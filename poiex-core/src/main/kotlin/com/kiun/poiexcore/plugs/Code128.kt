package com.kiun.poiexcore.plugs

import com.google.zxing.BarcodeFormat
import org.w3c.dom.Node

class Code128(node: Node) : BitMatrixEncode(node) {

    override fun initParam(map: Map<String, Any>) {
        super.initParam(map)
        barcodeFormat = BarcodeFormat.CODE_128
        widthValue = if(widthValue == 0) 200 else widthValue
        heightValue = if(heightValue == 0) 80 else heightValue
    }
}
