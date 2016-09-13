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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * xml工具类
 * Created by rensong.pu on 2016/9/13.
 */
public class XmlUtil {
    private static String opactity = ""; //存放opacity属性值
    private String xmlPath = null;
    private Document document = null;
    private Element root = null;
    private static final Logger logger = LoggerFactory.getLogger(XmlUtil.class);

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
            document = builder.parse(new File(xmlPath));
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
    public static void rgbWork(Node temp) {
        //递归终止
        if (temp.getChildNodes() == null) {
            return;
        }
        NodeList nodeList = temp.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() != Node.TEXT_NODE) {
                System.out.println("--" + node.getNodeName() + ":" + node.getNodeValue());
                NamedNodeMap map = node.getAttributes();
                Attr fill = (Attr) map.getNamedItem("fill");
                Attr stroke = (Attr) map.getNamedItem("stroke");
                doRGB(fill, node);
                doRGB(stroke, node);
                rgbWork(node);//递归调用
            }
        }
    }

    private static void doRGB(Attr attr, Node parent) {
        if (null != attr && attr.getNodeValue().contains("rgba")) {
            String rgba = attr.getNodeValue();
            attr.setNodeValue(rgbTrans(rgba));
            ((Element) parent).setAttribute(attr.getNodeName() + "-opacity", opactity);//新增opactity属性
        }
    }

    //设置clip-path属性值为none
    public static void clipPathNone(Node root) {
        NodeList nodeList = root.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node temp = nodeList.item(i);
            if (temp.getNodeType() == Node.TEXT_NODE) {
                continue;
            }
            NamedNodeMap nodeMap = temp.getAttributes();
            Node seriesGroup = nodeMap.getNamedItem("class");
            if (null != seriesGroup && seriesGroup.getNodeValue().equals("highcharts-series-group")) {
                System.out.println(seriesGroup.getNodeName() + ":" + seriesGroup.getNodeValue());
                NodeList nodeList2 = temp.getChildNodes();
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

        }
    }

    //处理图例
    public void legendWork(){

    }

    //给指定节点添加一个节点
    public static Element addElement(Node parent, String tagName, String tagValue) {
        Document doc = parent.getOwnerDocument();
        Element child = doc.createElement(tagName);
        child.setNodeValue(tagValue);
        return child;
    }

    //rgba转rgb输出
    public static String rgbTrans(String rgba) {
        rgba = rgba.substring(5, rgba.length() - 1);
        System.out.println("rgba=>" + rgba);
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
    public static void saveToXml(Document document) {
        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            Transformer transformer = factory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            //设置编码类型
            transformer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
            StreamResult result = new StreamResult(new FileOutputStream("E://svgout.xml"));
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
}
