//package com.util;
//
//import org.apache.batik.transcoder.Transcoder;
//import org.apache.batik.transcoder.TranscoderException;
//import org.apache.batik.transcoder.TranscoderInput;
//import org.apache.batik.transcoder.TranscoderOutput;
//import org.apache.batik.transcoder.image.PNGTranscoder;
//
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.UnsupportedEncodingException;
//
///**
// * Created by rensong.pu on 2016/9/12.
// */
//public class SvgPngConverter {
//
//    public static void main(String[] args) {
//        String svgPath = "E:/circle1.svg";
//        File file = new File(svgPath);
//        String svgCode = null;
//        try (FileInputStream is = new FileInputStream(file)) {
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);
//            String line = null;
//            StringBuilder sb = new StringBuilder();
//            while ((line = br.readLine()) != null) {
//                sb.append(line+"\n");
//            }
//            System.out.println(sb.toString());
//            svgCode = sb.toString();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        convertToPng(svgCode, "E://svg.png");
//        System.out.println("success");
//    }
//
//    public static File convertToPng(String svgCode, String pngFilePath) {
//        File file = new File(pngFilePath);
//        FileOutputStream fos = null;
//        try {
//            file.createNewFile();
//            fos = new FileOutputStream(file);
//            convertToPng(svgCode, fos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static void convertToPng(String svgCode, OutputStream os) {
//        try {
//            byte[] bytes = svgCode.getBytes("utf-8");
//            PNGTranscoder t = new PNGTranscoder();
//            TranscoderInput input = new TranscoderInput(new ByteArrayInputStream(bytes));
//            TranscoderOutput output = new TranscoderOutput(os);
//            t.transcode(input, output);
//            os.flush();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (TranscoderException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (null != os) {
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
