package com.kiun.poiexcore.uilts

import org.apache.poi.ss.usermodel.Sheet

class ExcelOfJava {

    companion object {

        @JvmStatic
        fun sheetCopy(desc: Sheet, src: Sheet, data: Any){
            desc.copyBy(src, data)
        }
    }
}
