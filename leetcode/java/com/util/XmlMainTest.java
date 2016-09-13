package com.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by rensong.pu on 2016/9/13.
 */
public class XmlMainTest {

    public static void main(String[] args) {
        String svgCode = "E://svgdemo.xml";
        XmlUtil xmlUtil = new XmlUtil(svgCode);
        xmlUtil.buildDoc();
        Document d = xmlUtil.getDocument();
        Node root = d.getFirstChild();
        XmlUtil.rgbWork(root);//rgb处理
        XmlUtil.clipPathNone(root);//处理url#

        XmlUtil.saveToXml(d);
    }


}
