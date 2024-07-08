package com.example.demo

import com.example.demo.data.CoatingReportResponse
import com.example.demo.data.PageResult
import com.example.demo.data.ResultBean
import com.example.demo.data.TManufOrdEx
import com.google.gson.Gson
import com.kiun.poiexcore.excel.ExcelExport
import org.springframework.core.ParameterizedTypeReference
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.FileReader
import java.io.InputStreamReader
import java.net.URLEncoder
import java.util.*
import javax.servlet.http.HttpServletResponse

class StringUtil {

    fun format(format: String, vararg args: Any?): String{
        return String.format(format, *args)
    }
}

@RestController
class TestDemo {

    @GetMapping("test-export")
    fun testExport(response: HttpServletResponse)
    {
        //开始计时
        val m = System.currentTimeMillis()

        //导入大量数据
        val jsonStream = javaClass.classLoader.getResourceAsStream("data.json")
        val data = Gson().fromJson<PageResult<Map<String, Any>>>(
            InputStreamReader(jsonStream), object : ParameterizedTypeReference<PageResult<Map<String, Any>>>(){}.type
        )

        //导入模板文件流
        val stream = javaClass.classLoader.getResourceAsStream("test-export.xlsx")
        val work = ExcelExport(stream).export(mutableMapOf("maplist" to data.list!!, "name" to "goto"))

        //导出文件类型
        response.contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        //中文需要编码对应，防止乱码
        response.addHeader(
            "Content-Disposition", "Attachment;Filename=" + URLEncoder.encode("test-export", "UTF-8") + ".xlsx"
        )
        response.addHeader("Access-Control-Expose-Headers", "Content-Type, Content-Disposition")

        //将工作簿写入到http响应
        work.write(response.outputStream)

        //输出总用时
        println("=================================")
        println("use ${System.currentTimeMillis() - m} ms")
    }

    @GetMapping("/download")
    fun download(response: HttpServletResponse){

//        val jsonFile = "E:/work/Java/easypoi-master/demo/src/main/resources/templates/json.txt"
//        val data = Gson().fromJson<List<Map<String, Any>>>(FileReader(jsonFile), object : ParameterizedTypeReference<List<Map<String, Any>>>(){}.type)

        val jsonStream = javaClass.classLoader.getResourceAsStream("data.json")
//        val input = InputStreamReader(jsonStream)
//        val lines = input.readLines()
        val data = Gson().fromJson<PageResult<Map<String, Any>>>(
                InputStreamReader(jsonStream), object : ParameterizedTypeReference<PageResult<Map<String, Any>>>(){}.type
        )

        //excel文件名
        val fileName = "涂布车间统计报表"
        response.contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        //中文需要编码对应，防止乱码
        response.addHeader(
            "Content-Disposition",
            "Attachment;Filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xlsx"
        )
        response.addHeader("Access-Control-Expose-Headers", "Content-Type, Content-Disposition")

        val body = LinkedList<CoatingReportResponse>()
        for (i in 0..30000){

            val response = CoatingReportResponse()
            response.lotNumT = "${'A'+Random().nextInt(10)}"
            response.lotNumF = String.format("%08d", Random().nextInt(10))
            body.add(response)
        }



        val stream = javaClass.classLoader.getResourceAsStream("松筒产品流转卡模板.xlsx")
//        val work = ExcelExport(stream)
//            .export(mutableMapOf("maplist" to data.list!!, "name" to "goto"))

        val list = LinkedList<Map<String, String>>()
        for (i in 1 .. 2) {

            val map = LinkedHashMap<String, String>()
            //设备编号
            map.put("machineAndSort", "编号${i}");
            //缸号
            map.put("batchNo", "缸号${i}");
            //生产序号
            map.put("daySort", "");
            //进缸日期
            map.put("enterVatOrdDt", "");
            //流转卡号
            map.put("batchNoCodeBar", "");
            //客户名称
            map.put("customerNm", "");
            //交期
            map.put("manufOrdDt", "");
            //合约号
            map.put("cusContractCd", "");
            //纱支
            map.put("prodNm", "");
            //纱批
            map.put("lot", "");
            //客色号
            map.put("cusColorCd", "");

            map.put("colorCd", "");
            //颜色
            //颜色
            map.put("colorNm", "")
            //投染数
            //投染数
            map.put("totalWeightIn", "")
            //单重
            //单重
            map.put("pieceWgt", "")
            //投染个数
            //投染个数
            map.put("totalQtyIn", "")
            //工序留言
            //工序留言
            map.put("remark3", "")
            //计划调度留言
            //计划调度留言
            map.put("planContent", "")
            //打印人
            //打印人
            map.put("prtUserNm", "2024/12/1")
            list.add(map)
        }

        val m = System.currentTimeMillis()
        val work2 = ExcelExport(stream).exportSheets(list, {
            return@exportSheets it["batchNo"]
        }){
            return@exportSheets 1
        }

        println("=================================")
        println("${System.currentTimeMillis() - m} ms")
        work2.write(response.outputStream)
    }
}
