package com.poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FontFamily;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.model.StylesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
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
    private static int lastRow = 0;
    private static int columnLength = 5;

    public static void main(String[] args) {
        XSSFWorkbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("小铺");
        XSSFCellStyle cellStyle = wb.createCellStyle();
        cellStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
        cellStyle.setFillForegroundColor((short) 41);//设置背景色
        //设置字体
        XSSFFont xssfFont = wb.createFont();
        xssfFont.setFamily(FontFamily.DECORATIVE);
        xssfFont.setFontHeightInPoints((short) 16);
//        sheet.setColumnWidth(0, 4000);//设置列宽度
        cellStyle.setWrapText(true);//设置自动换行


        File file = new File("E://poi.xlsx");
        for (int i = 0; i < 3; i++) {
            writeToExcel(sheet);
            ++lastRow;
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

    public static void insertToHeader(Sheet sheet, Integer lastRow) {
        Cell headerCell = sheet.createRow(lastRow).createCell(0);
        headerCell.setCellValue("XXXXX表");
        sheet.addMergedRegion(new CellRangeAddress(lastRow, lastRow, 0, columnLength - 1));
        CellStyle cellStyle2 = sheet.getWorkbook().createCellStyle();
        XSSFFont font2 = (XSSFFont) sheet.getWorkbook().createFont();
        font2.setFontHeightInPoints((short) 16);
        font2.setFamily(FontFamily.ROMAN);
        cellStyle2.setFont(font2);
        cellStyle2.setFillForegroundColor((short) 52);
        cellStyle2.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        headerCell.setCellStyle(cellStyle2);
        Row rowHeader = sheet.createRow(headerHeight + lastRow);//第i个数据集的表头
        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFillForegroundColor((short) 44);
        cellStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
        XSSFFont font = (XSSFFont) sheet.getWorkbook().createFont();
        font.setFontHeightInPoints((short) 16);
        font.setFamily(FontFamily.DECORATIVE);
        cellStyle.setFont(font);
        Cell rowHeaderCell = rowHeader.createCell(0);
        rowHeaderCell.setCellStyle(cellStyle);
        rowHeaderCell.setCellValue("表头列数据行数据");
        //合并表头
        sheet.addMergedRegion(new CellRangeAddress(lastRow + headerHeight, lastRow + headerHeight, 0, columnLength - 1));
    }


    public static void writeToExcel(Sheet sheet) {
        insertToHeader(sheet, lastRow);
        ++lastRow;
        for (int i = lastRow; i < lastRow + 10; i++) {
            Row row = sheet.createRow(i + headerHeight);
            Cell temp = row.createCell(0);
            temp.setCellValue("当前行:" + i);
            temp.setCellStyle(decorateExcel((XSSFWorkbook) sheet.getWorkbook()));
            for (int j = 1; j < columnLength; j++) {
                Cell temp2 = row.createCell(j);
                temp2.setCellStyle(decorateExcel((XSSFWorkbook) sheet.getWorkbook()));
                temp2.setCellValue("当前列值为" + j);
            }
        }
        int rowTh = sheet.getLastRowNum();
        System.out.println("当前已经写到" + rowTh + "行");
        lastRow = rowTh + 1;
    }



    public static CellStyle decorateExcel(XSSFWorkbook wb){
        CellStyle cellStyle = wb.createCellStyle();
        //设置字体
        XSSFFont font = wb.createFont();
        font.setFontHeightInPoints((short) 16);
        font.setFamily(FontFamily.ROMAN);
        cellStyle.setFont(font);
        //设置背景色
        cellStyle.setFillForegroundColor((short) 22);
        cellStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);

        return cellStyle;
    }
}
