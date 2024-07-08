package com.kiun.poiexcore.plugs

import com.google.zxing.BarcodeFormat
import org.w3c.dom.Node

class QRCode(node: Node) : BitMatrixEncode(node) {

    override fun initParam(map: Map<String, Any>) {
        super.initParam(map)
        barcodeFormat = BarcodeFormat.QR_CODE
        heightValue = widthValue
    }
}
