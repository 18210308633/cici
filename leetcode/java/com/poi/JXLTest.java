package com.poi;

import jxl.Workbook;
import jxl.format.Colour;
import jxl.format.UnderlineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;

/**
 * Created by rensong.pu on 2016/11/25.
 */
public class JXLTest {
    public static void main(String[] args) {
        File file = new File("E://htmlJxl.xls");
        try {
            WritableWorkbook wbb = Workbook.createWorkbook(file);
            POITest p = new POITest();
            String content = p.htmlCode();
            exportToExcel(wbb,content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void exportToExcel(WritableWorkbook wbb,String content){
        WritableSheet sheet = wbb.createSheet("三国杀武将列表",10);
        WritableFont font = new WritableFont(WritableFont.ARIAL,12,WritableFont.NO_BOLD,false,
                                             UnderlineStyle.NO_UNDERLINE, Colour.BLUE);
        WritableCellFormat wcf = new WritableCellFormat(font);
        try {
            wcf.setVerticalAlignment(VerticalAlignment.CENTRE);
        } catch (WriteException e1) {
            e1.printStackTrace();
        }

        try {
            sheet.addCell(new Label(2, 2, content, wcf));
            wbb.write();
            wbb.close();
        } catch (WriteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
