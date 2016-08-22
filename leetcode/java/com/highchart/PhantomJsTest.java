package com.highchart;

import java.io.*;

/**
 * java调用PhantomJS执行js文件
 * Created by thinkpad on 2016/8/18.
 */
public class PhantomJsTest {
    private static String exePath = "C:/Users/thinkpad/Desktop/cici/highcharts/HTML5_research/NodeJS-Highcharts/";
    private static String imgFile = "E:/pic.jpg";

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p = runtime.exec(exePath + "phantomjs.exe " + exePath + "run.js");
            ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
            InputStream is = p.getInputStream();
            byte[] bytes = new byte[4096];
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int len;
            while ((len = br.read()) != -1) {
                out.write(bytes, 0, len);
            }
            System.out.println("sssss");
            byte[] outbyte = out.toByteArray();
            writeToFile(outbyte, imgFile);
            System.out.println("sssss");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //将二进制数据写入图片文件
    public static void writeToFile(byte[] out, String outPutFile) {
        File file = new File(outPutFile);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
