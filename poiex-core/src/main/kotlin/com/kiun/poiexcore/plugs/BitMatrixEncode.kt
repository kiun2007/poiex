package com.kiun.poiexcore.plugs

import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.kiun.poiexcore.base.ConfigDataBase
import com.kiun.poiexcore.base.NodeValue
import com.kiun.poiexcore.uilts.toABGRColor
import com.sun.xml.internal.ws.util.ByteArrayBuffer
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.xssf.usermodel.XSSFClientAnchor
import org.apache.poi.xwpf.usermodel.XWPFDocument
import org.w3c.dom.Node
import java.awt.image.BufferedImage
import java.lang.RuntimeException
import javax.imageio.ImageIO

/**
 * 字节编码器
 */
open class BitMatrixEncode(node: Node) : ConfigDataBase(node) {

    /**
     * 码值
     */
    var code: NodeValue<String>? = null

    /**
     * 码宽度
     */
    var width: NodeValue<Int>? = null

    /**
     * 码高度
     */
    var height: NodeValue<Int>? = null

    /**
     * 前景色
     */
    var frontColor: NodeValue<String>? = null

    /**
     * 背景色
     */
    var backColor: NodeValue<String>? =  null

    /**
     * 格式类型
     * @see [com.google.zxing.BarcodeFormat]
     */
    var formatType: NodeValue<String>? = null

    var codeString: String? = null

    var widthValue: Int = 0

    var heightValue: Int = 0

    var fc: Int? = null

    var bc: Int? = null

    var barcodeFormat: BarcodeFormat? = null

    open fun initParam(map: Map<String, Any>){

        codeString = code?.toValue(map)

        widthValue = width?.toValue(map) ?: 0

        heightValue = height?.toValue(map) ?: 0

        if(formatType?.toValue(map) != null){
            barcodeFormat = BarcodeFormat.valueOf(formatType?.toValue(map)!!)
        }

        fc = frontColor?.toValue(map)?.toABGRColor() ?: 0xFF000000.toInt()
        bc = backColor?.toValue(map)?.toABGRColor() ?: 0x00FFFFFF
    }

    override fun dataToCell(cell: Cell, sourceCell: Cell, rowNum: Int, columnNum: Int, map: Map<String, Any>) {

        //初始参数
        initParam(map)
        val mergedAddress = sourceCell.sheet.mergedRegions.find { it.firstRow == rowNum && it.firstColumn == columnNum }

        val endRow = (mergedAddress?.lastRow ?: rowNum) + 1
        val endCol = (mergedAddress?.lastColumn ?: columnNum) + 1
        //构建瞄点
        val anchor = XSSFClientAnchor(0, 0, 0, 0, columnNum, rowNum, endCol, endRow)

        var cellWidthCount = 0
        var cellHeightCount = 0

        for (row in rowNum until endRow){
            cellHeightCount += sourceCell.sheet.getRow(row).heightInPoints.toInt()
        }

        for (col in columnNum until endCol){
            cellWidthCount += sourceCell.sheet.getColumnWidthInPixels(col).toInt()
        }

        //计算宽度
        if(widthValue == 0){
            widthValue = cellWidthCount
        }

        if (heightValue == 0){
            heightValue = cellHeightCount
        }

        if (barcodeFormat == null){
            throw RuntimeException("barcodeFormat 码格式不能为空")
        }

        val multiFormatWriter = MultiFormatWriter()
        val bitMatrix = multiFormatWriter.encode(codeString, barcodeFormat, widthValue, heightValue)

        val bufferedImage = BufferedImage(widthValue, heightValue, BufferedImage.TYPE_4BYTE_ABGR);
        for (x in 0 until widthValue) {
            for (y in 0 until heightValue) {
                bufferedImage.setRGB(x, y, (if(bitMatrix.get(x, y)) fc else bc) ?: 0);
            }
        }

        val buffer = ByteArrayBuffer(1024*1024)
        ImageIO.write(bufferedImage, "png", buffer)

        var drawing = cell.sheet.drawingPatriarch
        if(drawing == null){
            drawing = cell.sheet.createDrawingPatriarch()
        }

        drawing.createPicture(anchor, cell.sheet.workbook.addPicture(buffer.rawData, XWPFDocument.PICTURE_TYPE_PNG))
    }
}
