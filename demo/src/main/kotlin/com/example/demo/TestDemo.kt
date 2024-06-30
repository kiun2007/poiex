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

        val m = System.currentTimeMillis()

        val stream = javaClass.classLoader.getResourceAsStream("生产订单模板.xlsx")
        val work = ExcelExport(stream)
            .export(mutableMapOf("maplist" to data.list!!, "name" to "goto"))

        println("=================================")
        println("${System.currentTimeMillis() - m} ms")
        work.write(response.outputStream)
    }
}
