package com.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * xml工具类
 * 增加节点，修改节点属性值等操作
 * Created by rensong.pu on 2016/9/13.
 */
public class XmlUtil {
    private static String opactity = ""; //存放opacity属性值
    private String xmlPath = null;
    private InputStream inputStream = null;
    private Document document = null;
    private Element root = null;
    private static final Logger logger = LoggerFactory.getLogger(XmlUtil.class);

    public XmlUtil(InputStream is) {
        this.inputStream = is;
    }

    public XmlUtil(String xmlPath) {
        this.xmlPath = xmlPath;
    }

    /**
     * 构建xmlDocument ,Root节点
     */
    public void buildDoc() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            logger.debug("construct document builder success");
//            document = builder.parse(new File(xmlPath));
            document = builder.parse(inputStream);
            logger.debug("construct xml document success");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //处理rgba
    public void rgbWork(Node temp) {
        //递归终止
        if (temp.getChildNodes() == null) {
            return;
        }
        NodeList nodeList = temp.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() != Node.TEXT_NODE) {
//                System.out.println("--" + node.getNodeName() + ":" + node.getNodeValue());
                NamedNodeMap map = node.getAttributes();
                Attr fill = (Attr) map.getNamedItem("fill");
                Attr stroke = (Attr) map.getNamedItem("stroke");
                doRGB(fill, node);
                doRGB(stroke, node);
                rgbWork(node);//递归调用
            }
        }
    }

    private void doRGB(Attr attr, Node parent) {
        if (null != attr && attr.getNodeValue().contains("rgba")) {
            String rgba = attr.getNodeValue();
            attr.setNodeValue(rgbTrans(rgba));
            ((Element) parent).setAttribute(attr.getNodeName() + "-opacity", opactity);//新增opactity属性
        }
    }

    //设置clip-path属性值为none
    public void clipPathNone(Node root) {
        List<Node> nodes = new ArrayList<>();
        getNodeByClass(root, "highcharts-series-group", nodes); //针对折线图的属性，后续找规律，做修改针对所有图形
        if (null == nodes) {
            return;
        }
        NodeList nodeList2 = nodes.get(0).getChildNodes();
        for (int j = 0; j < nodeList2.getLength(); j++) {
            Node node1 = nodeList2.item(j);
            if (node1.getNodeType() != Node.TEXT_NODE) {
                NamedNodeMap nodeMap1 = node1.getAttributes();
                Node clipPath = nodeMap1.getNamedItem("clip-path");
                if (clipPath != null) {
                    clipPath.setNodeValue("none");
                }
            }
        }

    }

    /**
     * 在root节点下根据class属性值定位node节点
     *
     * @param root
     * @param classVal
     * @param res      存放匹配的class节点
     */
    public void getNodeByClass(Node root, String classVal, List<Node> res) {
        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node temp = nodeList.item(i);
            if (temp.getNodeType() != Node.TEXT_NODE) {
                NamedNodeMap nodeMap = temp.getAttributes();
                Node seriesGroup = nodeMap.getNamedItem("class");
                if (null != seriesGroup && seriesGroup.getNodeValue().equals(classVal)) {
//                    System.out.println(seriesGroup.getNodeName() + ":" + seriesGroup.getNodeValue());
                    res.add(temp);
                } else {
                    //递归去子节点查找
                    getNodeByClass(temp, classVal, res);
                }
            }
        }
    }

    //处理图例
    public void legendWork(Node root, List<String> textVal) {
        List<Node> temp = new ArrayList<>();
        getNodeByClass(root, "highcharts-legend", temp);
        int index = 0;
        if (temp != null) {
            List<Node> lengendItem = new ArrayList<>();
            getNodeByClass(temp.get(0), "highcharts-legend-item", lengendItem);
            if (lengendItem.size() != textVal.size()) {
                logger.info("图例个数有问题！！");
                return;
            }
            for (Node node : lengendItem) {
                addElement(node, "text", new String(textVal.get(index++).getBytes(Charset.forName("utf-8"))));
            }
        }
    }

    //给指定节点添加一个节点
    public Element addElement(Node parent, String tagName, String tagValue) {
        Document doc = parent.getOwnerDocument();
        Element element = doc.createElement(tagName);
        element.setTextContent(tagValue);
        parent.appendChild(element);
        return element;
    }

    //rgba转rgb输出
    public String rgbTrans(String rgba) {
        rgba = rgba.substring(5, rgba.length() - 1);
        logger.debug("rgba=>" + rgba);
        String[] ss = rgba.split(",");
        opactity = ss[ss.length - 1];
        StringBuilder builder = new StringBuilder("rgb(");
        for (int i = 0; i < ss.length - 1; i++) {
            builder.append(ss[i]);
            if (i == ss.length - 2) {
                builder.append(")");
                break;
            }
            builder.append(",");
        }
        return builder.toString();
    }

    //保存为xml文件
    public void saveToXml(Document document) {
        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            Transformer transformer = factory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            //设置编码类型
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            StreamResult result = new StreamResult(new FileOutputStream("E://svgout.svg"));
            //将DOM转为xml
            transformer.transform(domSource, result);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

    public String getXmlPath() {
        return xmlPath;
    }

    public void setXmlPath(String xmlPath) {
        this.xmlPath = xmlPath;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Element getRoot() {
        return root;
    }

    public void setRoot(Element root) {
        this.root = root;
    }

    public static Logger getLogger() {
        return logger;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
