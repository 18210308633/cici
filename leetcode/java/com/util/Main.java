package com.util;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * Created by thinkpad on 2016/10/6.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("E://svgdemo2.svg");
        String svgCode = null;
        try (InputStream is = new FileInputStream(file)) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = bf.readLine()) != null) {
                sb.append(line);
            }
            svgCode = sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(svgCode); //输入内容svgCode
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        SvgPngConvert.convertToPng(SvgPngConvert.workXml(svgCode), "E://svgout2.png");
        SvgPngConvert.convertToPng(SvgPngConvert.workXml(svgCode), outputStream);
        //生成的png导入到excel中
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Drawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor clientAnchor = new XSSFClientAnchor(0, 0, 50, 50, 1, 1, 5, 5);
        clientAnchor.setAnchorType(3);//原图，不受终点cell位置影响
        drawing.createPicture(clientAnchor, workbook.addPicture(outputStream.toByteArray(), Workbook.PICTURE_TYPE_PNG));
        File excel = new File("E://jiling.xlsx");
        try (OutputStream out = new FileOutputStream(excel)) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
