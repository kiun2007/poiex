package com.kiun.poiexcore.excel;

import com.kiun.poiexcore.uilts.ExcelOfJava;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.function.Function;

/**
 * Excel导出
 */
public class ExcelExport {

    /**
     * 模板
     */
    private Workbook tempWorkBook;

    /**
     * 根据文件流初始化导出
     *
     * @param stream
     */
    public ExcelExport(InputStream stream) {
        try {
            tempWorkBook = WorkbookFactory.create(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Workbook export(Object object) {

        Workbook newWork = new SXSSFWorkbook(1000000);
        Sheet newSheet = newWork.createSheet();
        ExcelOfJava.sheetCopy(newSheet, tempWorkBook.getSheetAt(0), object);
        return newWork;
    }

    public <T> Workbook exportSheets(
            Collection<T> collection,
            Function<T, String> sheetNameGetter,
            Function<T, Integer> sheetTempIndexGetter
    ) {
        Workbook newWork = new SXSSFWorkbook(1000000);

        for (T item : collection) {
            String sheetName = sheetNameGetter.apply(item);
            int tempSheetIndex = 0;

            if (sheetTempIndexGetter != null) {
                tempSheetIndex = sheetTempIndexGetter.apply(item);
            }

            Sheet newSheet = newWork.createSheet(sheetName);
            ExcelOfJava.sheetCopy(newSheet, tempWorkBook.getSheetAt(tempSheetIndex), item);
        }
        return newWork;
    }


    public <T>Workbook exportSheets(
            Collection<T> collection,
            Function<T, String> sheetNameGetter
    ){
        return exportSheets(collection, sheetNameGetter, null);
    }
}
