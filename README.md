# poiex
# excel模板大数据导出

# 使用文档
## 一、模板编辑
### 1、


### Java
#### 下面示例演示使用数据项目将模板项目复制成sheet并导出到Workbook
//模板读取流
</br>
InputStream stream = this.getClass().getClassLoader().getResourceAsStream("test-export-sheets.xlsx");
</br>
//将集合每一项通过模板导出成页且合并到同个工作簿.
</br>
//
</br>
Workbook work2 = new ExcelExport(stream).exportSheets(list, ProductFlowData::getBatchNo, item-> 1);
</br>
work2.write(response.getOutputStream());

## kotlin
val stream = javaClass.classLoader.getResourceAsStream("松筒产品流转卡模板.xlsx")
val work = ExcelExport(stream).export(mutableMapOf("maplist" to data.list!!, "name" to "goto"))
