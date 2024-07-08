package com.example.demo;

import com.example.demo.data.ProductFlowData;
import com.kiun.poiexcore.excel.ExcelExport;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
public class TestDemo4J {

    @GetMapping("/test-export-sheets4j")
    public void download(HttpServletResponse response) throws IOException {

        //excel文件名
        String fileName = "涂布车间统计报表";
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        //中文需要编码对应，防止乱码
        response.addHeader(
                "Content-Disposition",
                "Attachment;Filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xlsx"
        );
        response.addHeader("Access-Control-Expose-Headers", "Content-Type, Content-Disposition");
        List<ProductFlowData> list = new LinkedList<>();
        for (int i = 0; i < 20; i ++) {
            ProductFlowData data = new ProductFlowData();

            data.setMachineAndSort(String.format("编号: %d", i));
            data.setBatchNo(String.format("%d", i));
            data.setPrtUserNm("2024/12/1");
            list.add(data);
        }

        long m = System.currentTimeMillis();

        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("test-export-sheets.xlsx");
        Workbook work2 = new ExcelExport(stream).exportSheets(list, ProductFlowData::getBatchNo, item-> 1);
        work2.write(response.getOutputStream());
        System.out.println("use time is " + (System.currentTimeMillis() - m) + "ms");
    }

    @GetMapping("/test-autoheight4j")
    public void testAutoheight4j(HttpServletResponse response) throws IOException {

        //excel文件名
        String fileName = "test-autoheight4j";
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        //中文需要编码对应，防止乱码
        response.addHeader(
                "Content-Disposition",
                "Attachment;Filename=" + URLEncoder.encode(fileName, "UTF-8") + ".xlsx"
        );
        response.addHeader("Access-Control-Expose-Headers", "Content-Type, Content-Disposition");

        Map<String, Object> data = new HashMap<>();

        List<Map<String, String>> list = new LinkedList<>();
        for (int i = 0; i < 10; i ++) {
            Map<String, String> map = new HashMap<>();

            map.put("stkClsNm", "在库");
            map.put("materialFromNm", "本厂");

            StringBuffer buffer = new StringBuffer();
            for (int j = 0; j <= i; j++) {
                buffer.append("商品名称非常非常非常非常长长长长");
            }
            map.put("prodNm", buffer.toString());
            map.put("yarnLot", "lixy-021221");
            map.put("qtyOrd", "1");
            map.put("nweightOrd", "1");
            map.put("locNmOrd", "B01010101");
            map.put("remarks", "备注");
            list.add(map);
        }

        data.put("list", list);
        data.put("whNm", "毛坯");
        data.put("shpOrdNum", "SHP123213099123");
        data.put("shpTypeNm", "领料出库");
        data.put("shpOrdDt", "2024/07/08");
        data.put("exportUserNm", "用户A");

        long m = System.currentTimeMillis();

        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("test-autoheight.xlsx");
        Workbook work2 = new ExcelExport(stream).export(data);
        work2.write(response.getOutputStream());
        System.out.println("use time is " + (System.currentTimeMillis() - m) + "ms");
    }
}
