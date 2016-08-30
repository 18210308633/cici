package com.poi;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * javaAPI poi导出 Excel应用
 * Created by rensong.pu on 2016/8/29.
 */
public class POITest {
    private static int headerHeight = 1;
    private static int rowdepth = 0;

    public static void main(String[] args) {
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("小铺");
        File file = new File("E://poi.xls");
        for (int i = 0; i < 3; i++) {
            writeToExcel(sheet);
            ++rowdepth;
        }
        try {
            FileOutputStream fos = new FileOutputStream(file);
            wb.write(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToExcel(Sheet sheet) {

        for (int i = rowdepth; i < rowdepth + 10; i++) {
            Row row = sheet.createRow(i + headerHeight);
            row.createCell(0).setCellValue("当前行:" + i);
            for (int j = 1; j < 4; j++) {
                row.createCell(j).setCellValue("当前列值为" + j);
            }
        }
        int rowTh = sheet.getLastRowNum();
        System.out.println("当前已经写到" + rowTh + "行");
        rowdepth = rowTh + 1;
    }
}
