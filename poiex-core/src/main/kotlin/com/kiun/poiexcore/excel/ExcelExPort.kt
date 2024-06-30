package com.kiun.poiexcore.excel

import com.kiun.poiexcore.uilts.copyBy
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.streaming.SXSSFWorkbook
import java.io.InputStream

//class ExcelExport(stream: InputStream) {
//
//    private var tempWorkBook: Workbook = WorkbookFactory.create(stream)
//
//    fun export(data: Any): Workbook {
//
//        val newWork = SXSSFWorkbook(1000000)
//        val newSheet = newWork.createSheet()
//
//        newSheet.copyBy(tempWorkBook.getSheetAt(0), data)
//        return newWork
//    }
//}
