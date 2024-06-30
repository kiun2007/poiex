package com.kiun.poiexcore.plugs

import com.kiun.poiexcore.base.ConfigDataBase
import com.kiun.poiexcore.base.NodeValue
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFClientAnchor
import org.w3c.dom.Node

class QRCode(node: Node) : ConfigDataBase(node) {

    /**
     * 二维码值
     */
    var code: NodeValue<String>? = null

    /**
     * 每个单元格处理
     */
    override fun dataToCell(cell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {

        var codeString = code?.toValue(map)
//        var bitMatrix = Code128Writer().encode(codeString, BarcodeFormat.CODE_128, 150, 80)

        var anchor = XSSFClientAnchor(
                0, 0, 0, 0,
                cell.columnIndex,
                cell.row.rowNum,
                cell.columnIndex,
                cell.row.rowNum
        )

//        val barcodeQRCode = Barcode128(null)
//        barcodeQRCode.code = codeString
//        var image = barcodeQRCode.createAwtImage(Color.BLACK, Color.WHITE)

//        JPEGCodec.createJPEGEncoder(null).encode(BufferedImage())
//        ImageWriter
//        ImageIO.write(RenderedImage(image), "jpg", null)

//        PoiExcelGraphDataUtil.getDrawingPatriarch(cell.sheet).createPicture(anchor,
//                cell.sheet.workbook.addPicture(, getImageType(data)))
    }
}
