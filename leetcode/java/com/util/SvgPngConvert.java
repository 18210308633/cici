package com.util;

import com.poi.POITest;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.util.XMLResourceDescriptor;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rensong.pu on 2016/9/12.
 */
public class SvgPngConvert {
    private static Logger logger = LoggerFactory.getLogger(SvgPngConvert.class);

    public static Document createDocument(InputStream is) {
        Document doc = null;
        //创建一个svg文档
        String parser = XMLResourceDescriptor.getXMLParserClassName();
        SAXSVGDocumentFactory sdf = new SAXSVGDocumentFactory(parser);
        try {
            doc = sdf.createSVGDocument(null, is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public File saveSvg(InputStream svgStream) {
        Document svgXmlDoc = createDocument(svgStream);
        FileOutputStream fos = null;
        File file = null;
        try {
            file = File.createTempFile("svgFile", ".svg");
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource domSource = new DOMSource(svgXmlDoc);
            fos = new FileOutputStream(file);
            transformer.transform(domSource, new StreamResult(fos));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }

    /**
     * 对流入的svg字符串做处理
     *
     * @param svgCode
     * @return
     */
    public static String workXml(String svgCode) {
        String res = null;
        if (svgCode.length() < 500) {
            try {
                return new String(svgCode.getBytes("utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        try {
            InputStream is = new ByteArrayInputStream(svgCode.getBytes("utf-8"));
            XmlUtil xmlUtil = new XmlUtil(is);
            xmlUtil.buildDoc();
            Document document = xmlUtil.getDocument();
            Node root = document.getFirstChild();
            xmlUtil.rgbWork(root);//rgb处理
            xmlUtil.clipPathNone(root);//处理url#
            List<String> textVal = new ArrayList<>(); //图例列表
//            textVal.add("新访客-UV");
//            textVal.add("老访客-UV");
            textVal.add("adpad-订单数");
            textVal.add("android-订单数");
            textVal.add("ipad-订单数");
            textVal.add("iphone-订单数");
            textVal.add("wap-订单数");

            xmlUtil.legendWork(root, textVal);
            xmlUtil.saveToXml(document); //保存处理过的svg文件
            res = docToXml(document);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return res;
    }

    //document转xml字符串
    public static String docToXml(Document document) {
        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty("encoding", "utf-8");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            transformer.transform(new DOMSource(document), new StreamResult(bos));
            return bos.toString();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * svg字符串转png文件
     *
     * @param svgCode
     * @param pngPath
     */
    public static void convertToPng(String svgCode, String pngPath) {
        File file = new File(pngPath);
        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file);
            convertToPng(svgCode, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void convertToPngInMemory(String svgCode, OutputStream outputStream) {
        convertToPng(svgCode, outputStream);
    }

    /**
     * svgcode转为png文件，直接输出到流中
     *
     * @param svgCode
     * @param os
     */
    public static void convertToPng(String svgCode, OutputStream os) {
        try {
            byte[] bytes = svgCode.getBytes("utf-8");
            PNGTranscoder pt = new PNGTranscoder();
            TranscoderInput input = new TranscoderInput(new ByteArrayInputStream(bytes));
            TranscoderOutput output = new TranscoderOutput(os);
            pt.transcode(input, output);
            logger.info("图片绘制完成");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (TranscoderException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public static String modify(String orignSvg) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+=\\\"(?>rgba.+?\\))");//正则匹配rgba的值
        Matcher matcher = pattern.matcher(orignSvg);
        while (matcher.matches()) {
            String ma = matcher.group();
            String[] rgba = ma.split(",");
            String opacity = rgba[3];
            String target = ma.substring(0, ma.indexOf(",", 2));
            String attriName = ma.substring(0, ma.indexOf("="));
            target = target + ") " + attriName + "-opacity=\"" + opacity + "\"";
            orignSvg.replaceAll(ma, target);
        }
        return orignSvg;
    }

    /**
     * 输入svgCode
     * 输出 excel
     *
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("E://svgbar.svg");
        String svgCode = null;
        try (InputStream is = new FileInputStream(file)) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(is, Charset.forName("utf-8")));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = bf.readLine()) != null) {
                sb.append(line);
            }
            System.out.println(svgCode); //输入内容svgCode
//        convertToPng(workXml(svgCode), "E://svgout3.png");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
            convertToPng(workXml(svgCode), outputStream);
            convertToPng(workXml(svgCode), outputStream2);
//        //将图片svgout3.png，写入excel
            XSSFWorkbook workbook = new XSSFWorkbook();
//        POITest.insertImg("E://svgout3.png",workbook);
            Sheet sheet = workbook.createSheet("img");
            ByteArrayOutputStream[] outputStreams = new ByteArrayOutputStream[]{outputStream, outputStream2};
            POITest.insertImg(outputStreams, sheet, 1, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class MemoryFile {
        //将落地的svgout2图片文件在内存中处理掉
        private MappedByteBuffer out;
        private RandomAccessFile memoryFile;
        private long length = 10485760;//10M

        public MemoryFile() {
            try {
                memoryFile = new RandomAccessFile("svgout.png", "wr");
                memoryFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);

                FileChannel channel = memoryFile.getChannel();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void write(byte[] bytes) {
            out.put(bytes);
            System.out.println("write to memory file success!");
            if (memoryFile != null) {
                try {
                    memoryFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
