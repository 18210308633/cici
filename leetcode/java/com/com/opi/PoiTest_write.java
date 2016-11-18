//package com.com.opi;
//
//imp org.apache.poi.hssf.usermodel.HSSFCell;
//imp org.apache.poi.hssf.usermodel.HSSFRow;
//imp org.apache.poi.hssf.usermodel.HSSFSheet;
//imp org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//imp java.io.FileOutputStream;
//
//public class PoiTest_write {
//    static public void main(String[] args) throws Exception {
//        FileOutputStream fos = new FileOutputStream("d:/test.xls");
//        HSSFWorkbook wb = new HSSFWorkbook();
//        HSSFSheet s = wb.createSheet();
//
//        wb.setSheetName(0, "second sheet");
//        for (int i = 0; i < 10; i++) {
//            HSSFRow row = s.createRow(i);
//            for (int j = 0; j < 10; j++) {
//                HSSFCell cell = row.createCell(j);
//                cell.setCellValue("Hello!");
//            }
//        }
//        wb.write(fos);
//        fos.close();
//    }
//
//
//}
