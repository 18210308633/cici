package com.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.Region;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyRow {
    public static void main(String[] args) throws Exception { copyTemplate("Template.xls", "workbook.xls"); }

    public static void copyTemplate(String exTemplateFilePath, String targetFilePath) throws Exception {
        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(exTemplateFilePath));
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheetAt(0);
        int lastRow = sheet.getLastRowNum() + 1;
        copyRows(sheet, wb.getSheetAt(0), 1, lastRow, 20);
        FileOutputStream fileOut = new FileOutputStream(targetFilePath);
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }

    @SuppressWarnings("all")
    public static void copyRows(HSSFSheet sourceSheet, HSSFSheet targetSheet, int startRow, int endRow, int targetPosition) {
        int pStartRow = startRow - 1;
        int pEndRow = endRow - 1;
        int pPosition = targetPosition - 1;
        HSSFRow sourceRow = null, targetRow = null;
        HSSFCell sourceCell = null, targetCell = null;
        Region region = null;
        int cType, i, j, targetRowFrom, targetRowTo;
        if (pStartRow < 0 || pEndRow < 0 || pStartRow > pEndRow) {
            return;
        }        // 获取合并行单元格的数目,并设定目标单元格合并属性
        int mergedc = sourceSheet.getNumMergedRegions();
        for (i = 0; i < mergedc; i++) {
            region = sourceSheet.getMergedRegionAt(i);
            int rf = region.getRowFrom();
            int rt = region.getRowTo();
            if ((rf >= pStartRow) && (rt <= pEndRow)) {
                targetRowFrom = rf - pStartRow + pPosition;
                targetRowTo = rt - pStartRow + pPosition;
                region.setRowFrom(targetRowFrom);
                region.setRowTo(targetRowTo);
                targetSheet.addMergedRegion(region);
            }
        }
        // 设定个单元格的列宽
        for (i = pStartRow; i <= pEndRow; i++) {
            sourceRow = sourceSheet.getRow(i);
            if (sourceRow != null) {
                int firstC = sourceRow.getFirstCellNum();
                for (j = sourceRow.getLastCellNum(); j > firstC; j--) {
                    targetSheet.setColumnWidth(j, sourceSheet.getColumnWidth(j));
                    targetSheet.setColumnHidden(j, false);
                }
                break;
            }
        }
        //填充数据
        for (; i <= pEndRow; i++) {
            sourceRow = sourceSheet.getRow(i);
            if (sourceRow == null) {
                continue;
            }
            targetRow = targetSheet.createRow(i - pStartRow + pPosition);
            targetRow.setHeight(sourceRow.getHeight());
            int psy = sourceRow.getPhysicalNumberOfCells();
            for (j = sourceRow.getFirstCellNum(); j < psy; j++) {
                sourceCell = sourceRow.getCell(j);
                if (sourceCell == null) {
                    continue;
                }
                targetCell = targetRow.createCell(j);
                targetCell.setCellStyle(sourceCell.getCellStyle());
                cType = sourceCell.getCellType();
                targetCell.setCellType(cType);
                switch (cType) {
                    case HSSFCell.CELL_TYPE_BOOLEAN:
                        targetCell.setCellValue(sourceCell.getBooleanCellValue());
                        break;
                    case HSSFCell.CELL_TYPE_ERROR:
                        targetCell.setCellErrorValue(sourceCell.getErrorCellValue());
                        break;
                    case HSSFCell.CELL_TYPE_FORMULA:
                        targetCell.setCellFormula(parseFormula(sourceCell.getCellFormula()));
                        break;
                    case HSSFCell.CELL_TYPE_NUMERIC:
                        targetCell.setCellValue(sourceCell.getNumericCellValue());
                        break;
                    case HSSFCell.CELL_TYPE_STRING:
                        targetCell.setCellValue(sourceCell.getRichStringCellValue());
                        break;
                }
            }
        }
    }

    private static String parseFormula(String pPOIFormula) {
        final String cstReplaceString = "ATTR(semiVolatile)";
        //$NON-NLS-1$
        StringBuffer result = null;
        int index;
        result = new StringBuffer();
        index = pPOIFormula.indexOf(cstReplaceString);
        if (index >= 0) {
            result.append(pPOIFormula.substring(0, index));
            result.append(pPOIFormula.substring(index + cstReplaceString.length()));
        } else {
            result.append(pPOIFormula);
        }
        return result.toString();
    }
}
