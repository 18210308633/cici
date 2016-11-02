//package com.com.opi;
//
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.poifs.filesystem.POIFSFileSystem;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * Created by thinkpad on 2016/8/11.
// */
//public class PoiTest_Read {
//    public static void main(String[] args) {
//        /**
//         * 读取Excel文件时，首先生成一个POIFSFileSystem对象，由POIFSFileSystem
//         * 对象构造一个HSSFWorkbook，此对象代表了Excel文档。
//         */
//        POIFSFileSystem fs = null;
//        HSSFWorkbook wb = null;
//        try {
//            fs = new POIFSFileSystem(new FileInputStream("d:/test.xls"));
//            wb = new HSSFWorkbook(fs);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        HSSFSheet sheet = wb.getSheetAt(0);//选择sheet
//        for (int i = 0; i < 10; i++) {
//            HSSFRow row = sheet.getRow(i);//获取行
//            for (int j = 0; j < 10; j++) {
//                String msg = String.valueOf(row.getCell(j));
//                System.out.print(msg + " ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}
