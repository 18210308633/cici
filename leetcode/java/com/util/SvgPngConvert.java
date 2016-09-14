package com.util;

import org.apache.batik.apps.rasterizer.DestinationType;
import org.apache.batik.apps.rasterizer.SVGConverter;
import org.apache.batik.apps.rasterizer.SVGConverterException;
import org.apache.batik.dom.svg.SAXSVGDocumentFactory;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.Document;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rensong.pu on 2016/9/12.
 */
public class SvgPngConvert {
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

    public static void convert(String imgPath, String svgCode) {
        File svgFile = new File(svgCode);
        //convert svg to Png
        SVGConverter converter = new SVGConverter();
        converter.setDestinationType(DestinationType.PNG);
        converter.setSources(new String[]{modify(svgFile.toString())});
        converter.setDst(new File(imgPath));
        try {
            converter.execute();
        } catch (SVGConverterException e) {
            e.printStackTrace();
        }
    }

    public static String modify(String orignSvg) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+=\\\"(?>rgba.+?\\))");
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

    public static void main(String[] args) {
        convert("E://svg2.png", "E://svgout.svg");
    }

}
