package com.example.demo.data;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TManufOrd implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 生产订单编号
     */
    private String manufOrdCd;

    /**
     * 生产类型
     */
    private String manufType;

    /**
     * 订单类型
     */
    private String ordType;

    /**
     * 生产状态
     */
    private String manufCls;

    /**
     * 当前流程
     */
    private String manufProcessId;

    /**
     * 流程交期
     */
    private String manufProcessDt;

    /**
     * 中心编号
     */
    private String cntrCd;

    /**
     * 客户编号
     */
    private String customerId;

    /**
     * 商品编号
     */
    private String prodId;

    /**
     * 纱线属性
     */
    private String yarnRemarks;

    /**
     * 生产批次号
     */
    private String lot;

    /**
     * 工艺号
     */
    private String craftSn;

    /**
     * 色号
     */
    private String colorCd;

    /**
     * 色系
     */
    private String colorSystem;

    /**
     * 色别
     */
    private String colorNm;

    /**
     * 生产日期
     */
    private String manufDt;

    /**
     * 生产总交期
     */
    private String manufOrdDt;

    /**
     * 缸号
     */
    private String batchNo;

    /**
     * 主缸ID
     */
    private String mainBatchNoId;

    /**
     * 机台号
     */
    private String machineNo;

    /**
     * 要求进缸日期
     */
    private String enterVatOrdDt;

    /**
     * 仓库发纱日期
     */
    private String whSendOutDt;

    /**
     * 复样日期
     */
    private String doSampleDt;

    /**
     * 开处方日期
     */
    private String getFormulaDt;

    /**
     * 配缸日期
     */
    private String fixUpVatDt;

    /**
     * 装笼日期
     */
    private String putCageDt;

    /**
     * 实际进缸日期
     */
    private String enterVatDt;

    /**
     * 实际出缸日期
     */
    private String outVatDt;

    /**
     * 质检结果
     */
    private String qcResult;

    /**
     * 箱ID
     */
    private String boxId;

    /**
     * 生产需量
     */
    private BigDecimal needQty;

    /**
     * 生产损耗
     */
    private BigDecimal lossQty;

    /**
     * 需采购量
     */
    private BigDecimal purchaseQty;

    /**
     * 投入总重量
     */
    private BigDecimal totalWeightIn;

    /**
     * 投入总数量
     */
    private BigDecimal totalQtyIn;

    /**
     * 产出毛重
     */
    private BigDecimal finishGweight;

    /**
     * 产出净重
     */
    private BigDecimal finishNweight;

    /**
     * 产出数量
     */
    private BigDecimal finishQty;

    /**
     * 计数单位
     */
    private String qtyUnit;

    /**
     * 外发标志
     */
    private BigDecimal outFlg;

    /**
     * 采购计划标志
     */
    private String purchasePlanFlg;

    /**
     * 外发计划标志
     */
    private String ofPlanFlg;

    /**
     * 记录人
     */
    private String inputUserId;

    /**
     * 记录时间
     */
    private Date inputDt;

    /**
     * 预定出库单号
     */
    private String shpOrdNum;

    /**
     * 预定入库单号
     */
    private String rcvOrdNum;

    /**
     * 账面库存编号
     */
    private String bookNum;

    /**
     * 机台ID
     */
    private String machineId;

    /**
     * 单重
     */
    private BigDecimal pieceWgt;

    /**
     * 日内排序
     */
    private String daySort;

    /**
     * 并缸投染数
     */
    private BigDecimal totalWgt;

    /**
     * 加急标志
     */
    private String urgentFlg;

    /**
     * 计划执行状态
     */
    private String planCls;

    /**
     * 复样执行状态
     */
    private String colorCls;

    /**
     * 生产执行状态
     */
    private String workCls;

    /**
     * 备注1
     */
    private String remark1;

    /**
     * 备注2
     */
    private String remark2;

    /**
     * 备注3
     */
    private String remark3;


    /**
     * 中控导入标识
     */
    private String controlImportFlg;
    /**
     * 文本1
     */
    private String char1;

    /**
     * 文本2
     */
    private String char2;

    /**
     * 文本3
     */
    private String char3;

    /**
     * 文本4
     */
    private String char4;

    /**
     * 文本5
     */
    private String char5;

    /**
     * 文本6
     */
    private String char6;

    /**
     * 文本7
     */
    private String char7;

    /**
     * 文本8
     */
    private String char8;

    /**
     * 文本9
     */
    private String char9;

    /**
     * 文本10
     */
    private String char10;

    /**
     * 数值1
     */
    private BigDecimal num1;

    /**
     * 数值2
     */
    private BigDecimal num2;

    /**
     * 数值3
     */
    private BigDecimal num3;

    /**
     * 数值4
     */
    private BigDecimal num4;

    /**
     * 数值5
     */
    private BigDecimal num5;

    /**
     * 数值6
     */
    private BigDecimal num6;

    /**
     * 数值7
     */
    private BigDecimal num7;

    /**
     * 数值8
     */
    private BigDecimal num8;

    /**
     * 数值9
     */
    private BigDecimal num9;

    /**
     * 数值10
     */
    private BigDecimal num10;

    /**
     * 更新次数
     */
    private Integer updCnt;

    /**
     * 删除区分
     */
    private String delFlg;

    /**
     * 登录时输入区分
     */
    private String addEntKbn;

    /**
     * 登录时程序ID
     */
    private String addPgmId;

    /**
     * 登录时用户ID
     */
    private String addUserId;

    /**
     * 登录时用户名称
     */
    private String addUserNm;

    /**
     * 登录时端末ID
     */
    private String addTnmtId;

    /**
     * 登录日期
     */
    private Date addDt;

    /**
     * 更新时输入区分
     */
    private String updEntKbn;

    /**
     * 更新时程序ID
     */
    private String updPgmId;

    /**
     * 更新时用户ID
     */
    private String updUserId;

    /**
     * 更新时用户名称
     */
    private String updUserNm;

    /**
     * 更新时端末ID
     */
    private String updTnmtId;

    /**
     * 更新日期
     */
    private Date updDt;

    /**
     * 毛坯仓库
     */
    private String whIdFrom;

    /**
     * 成品仓库
     */
    private String whIdTo;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public TManufOrd setId(String id) {
        this.id = id == null ? null : id.trim();
        return this;
    }

    /**
     * 获取生产订单编号
     *
     * @return MANUF_ORD_CD - 生产订单编号
     */
    public String getManufOrdCd() {
        return manufOrdCd;
    }

    /**
     * 设置生产订单编号
     *
     * @param manufOrdCd 生产订单编号
     */
    public TManufOrd setManufOrdCd(String manufOrdCd) {
        this.manufOrdCd = manufOrdCd == null ? null : manufOrdCd.trim();
        return this;
    }

    /**
     * 获取中控导入标识
     *
     * @return CONTROL_IMPORT_FLG - 中控导入标识
     */
    public String getControlImportFlg() {
        return controlImportFlg;
    }

    /**
     * 设置中控导入标识
     *
     * @param controlImportFlg 中控导入标识
     */
    public TManufOrd setControlImportFlg(String controlImportFlg) {
        this.controlImportFlg = controlImportFlg == null ? null : controlImportFlg.trim();
        return this;
    }
    /**
     * 获取生产类型
     *
     * @return MANUF_TYPE - 生产类型
     */
    public String getManufType() {
        return manufType;
    }

    /**
     * 设置生产类型
     *
     * @param manufType 生产类型
     */
    public TManufOrd setManufType(String manufType) {
        this.manufType = manufType == null ? null : manufType.trim();
        return this;
    }

    /**
     * 获取订单类型
     *
     * @return ORD_TYPE - 订单类型
     */
    public String getOrdType() {
        return ordType;
    }

    /**
     * 设置订单类型
     *
     * @param ordType 订单类型
     */
    public TManufOrd setOrdType(String ordType) {
        this.ordType = ordType == null ? null : ordType.trim();
        return this;
    }

    /**
     * 获取生产状态
     *
     * @return MANUF_CLS - 生产状态
     */
    public String getManufCls() {
        return manufCls;
    }

    /**
     * 设置生产状态
     *
     * @param manufCls 生产状态
     */
    public TManufOrd setManufCls(String manufCls) {
        this.manufCls = manufCls == null ? null : manufCls.trim();
        return this;
    }

    /**
     * 获取当前流程
     *
     * @return MANUF_PROCESS_ID - 当前流程
     */
    public String getManufProcessId() {
        return manufProcessId;
    }

    /**
     * 设置当前流程
     *
     * @param manufProcessId 当前流程
     */
    public TManufOrd setManufProcessId(String manufProcessId) {
        this.manufProcessId = manufProcessId == null ? null : manufProcessId.trim();
        return this;
    }

    /**
     * 获取流程交期
     *
     * @return MANUF_PROCESS_DT - 流程交期
     */
    public String getManufProcessDt() {
        return manufProcessDt;
    }

    /**
     * 设置流程交期
     *
     * @param manufProcessDt 流程交期
     */
    public TManufOrd setManufProcessDt(String manufProcessDt) {
        this.manufProcessDt = manufProcessDt == null ? null : manufProcessDt.trim();
        return this;
    }

    /**
     * 获取中心编号
     *
     * @return CNTR_CD - 中心编号
     */
    public String getCntrCd() {
        return cntrCd;
    }

    /**
     * 设置中心编号
     *
     * @param cntrCd 中心编号
     */
    public TManufOrd setCntrCd(String cntrCd) {
        this.cntrCd = cntrCd == null ? null : cntrCd.trim();
        return this;
    }

    /**
     * 获取客户编号
     *
     * @return CUSTOMER_ID - 客户编号
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置客户编号
     *
     * @param customerId 客户编号
     */
    public TManufOrd setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
        return this;
    }

    /**
     * 获取商品编号
     *
     * @return PROD_ID - 商品编号
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 设置商品编号
     *
     * @param prodId 商品编号
     */
    public TManufOrd setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
        return this;
    }

    /**
     * 获取纱线属性
     *
     * @return YARN_REMARKS - 纱线属性
     */
    public String getYarnRemarks() {
        return yarnRemarks;
    }

    /**
     * 设置纱线属性
     *
     * @param yarnRemarks 纱线属性
     */
    public TManufOrd setYarnRemarks(String yarnRemarks) {
        this.yarnRemarks = yarnRemarks == null ? null : yarnRemarks.trim();
        return this;
    }

    /**
     * 获取生产批次号
     *
     * @return LOT - 生产批次号
     */
    public String getLot() {
        return lot;
    }

    /**
     * 设置生产批次号
     *
     * @param lot 生产批次号
     */
    public TManufOrd setLot(String lot) {
        this.lot = lot == null ? null : lot.trim();
        return this;
    }

    /**
     * 获取工艺号
     *
     * @return CRAFT_SN - 工艺号
     */
    public String getCraftSn() {
        return craftSn;
    }

    /**
     * 设置工艺号
     *
     * @param craftSn 工艺号
     */
    public TManufOrd setCraftSn(String craftSn) {
        this.craftSn = craftSn == null ? null : craftSn.trim();
        return this;
    }

    /**
     * 获取色号
     *
     * @return COLOR_CD - 色号
     */
    public String getColorCd() {
        return colorCd;
    }

    /**
     * 设置色号
     *
     * @param colorCd 色号
     */
    public TManufOrd setColorCd(String colorCd) {
        this.colorCd = colorCd == null ? null : colorCd.trim();
        return this;
    }

    /**
     * 获取色系
     *
     * @return COLOR_SYSTEM - 色系
     */
    public String getColorSystem() {
        return colorSystem;
    }

    /**
     * 设置色系
     *
     * @param colorSystem 色系
     */
    public TManufOrd setColorSystem(String colorSystem) {
        this.colorSystem = colorSystem == null ? null : colorSystem.trim();
        return this;
    }

    /**
     * 获取色别
     *
     * @return COLOR_NM - 色别
     */
    public String getColorNm() {
        return colorNm;
    }

    /**
     * 设置色别
     *
     * @param colorNm 色别
     */
    public TManufOrd setColorNm(String colorNm) {
        this.colorNm = colorNm == null ? null : colorNm.trim();
        return this;
    }

    /**
     * 获取生产日期
     *
     * @return MANUF_DT - 生产日期
     */
    public String getManufDt() {
        return manufDt;
    }

    /**
     * 设置生产日期
     *
     * @param manufDt 生产日期
     */
    public TManufOrd setManufDt(String manufDt) {
        this.manufDt = manufDt == null ? null : manufDt.trim();
        return this;
    }

    /**
     * 获取生产总交期
     *
     * @return MANUF_ORD_DT - 生产总交期
     */
    public String getManufOrdDt() {
        return manufOrdDt;
    }

    /**
     * 设置生产总交期
     *
     * @param manufOrdDt 生产总交期
     */
    public TManufOrd setManufOrdDt(String manufOrdDt) {
        this.manufOrdDt = manufOrdDt == null ? null : manufOrdDt.trim();
        return this;
    }

    /**
     * 获取缸号
     *
     * @return BATCH_NO - 缸号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置缸号
     *
     * @param batchNo 缸号
     */
    public TManufOrd setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
        return this;
    }

    /**
     * 获取主缸ID
     *
     * @return MAIN_BATCH_NO_ID - 主缸ID
     */
    public String getMainBatchNoId() {
        return mainBatchNoId;
    }

    /**
     * 设置主缸ID
     *
     * @param mainBatchNoId 主缸ID
     */
    public TManufOrd setMainBatchNoId(String mainBatchNoId) {
        this.mainBatchNoId = mainBatchNoId == null ? null : mainBatchNoId.trim();
        return this;
    }

    /**
     * 获取机台号
     *
     * @return MACHINE_NO - 机台号
     */
    public String getMachineNo() {
        return machineNo;
    }

    /**
     * 设置机台号
     *
     * @param machineNo 机台号
     */
    public TManufOrd setMachineNo(String machineNo) {
        this.machineNo = machineNo == null ? null : machineNo.trim();
        return this;
    }

    /**
     * 获取要求进缸日期
     *
     * @return ENTER_VAT_ORD_DT - 要求进缸日期
     */
    public String getEnterVatOrdDt() {
        return enterVatOrdDt;
    }

    /**
     * 设置要求进缸日期
     *
     * @param enterVatOrdDt 要求进缸日期
     */
    public TManufOrd setEnterVatOrdDt(String enterVatOrdDt) {
        this.enterVatOrdDt = enterVatOrdDt == null ? null : enterVatOrdDt.trim();
        return this;
    }

    /**
     * 获取仓库发纱日期
     *
     * @return WH_SEND_OUT_DT - 仓库发纱日期
     */
    public String getWhSendOutDt() {
        return whSendOutDt;
    }

    /**
     * 设置仓库发纱日期
     *
     * @param whSendOutDt 仓库发纱日期
     */
    public TManufOrd setWhSendOutDt(String whSendOutDt) {
        this.whSendOutDt = whSendOutDt == null ? null : whSendOutDt.trim();
        return this;
    }

    /**
     * 获取复样日期
     *
     * @return DO_SAMPLE_DT - 复样日期
     */
    public String getDoSampleDt() {
        return doSampleDt;
    }

    /**
     * 设置复样日期
     *
     * @param doSampleDt 复样日期
     */
    public TManufOrd setDoSampleDt(String doSampleDt) {
        this.doSampleDt = doSampleDt == null ? null : doSampleDt.trim();
        return this;
    }

    /**
     * 获取开处方日期
     *
     * @return GET_FORMULA_DT - 开处方日期
     */
    public String getGetFormulaDt() {
        return getFormulaDt;
    }

    /**
     * 设置开处方日期
     *
     * @param getFormulaDt 开处方日期
     */
    public TManufOrd setGetFormulaDt(String getFormulaDt) {
        this.getFormulaDt = getFormulaDt == null ? null : getFormulaDt.trim();
        return this;
    }

    /**
     * 获取配缸日期
     *
     * @return FIX_UP_VAT_DT - 配缸日期
     */
    public String getFixUpVatDt() {
        return fixUpVatDt;
    }

    /**
     * 设置配缸日期
     *
     * @param fixUpVatDt 配缸日期
     */
    public TManufOrd setFixUpVatDt(String fixUpVatDt) {
        this.fixUpVatDt = fixUpVatDt == null ? null : fixUpVatDt.trim();
        return this;
    }

    /**
     * 获取装笼日期
     *
     * @return PUT_CAGE_DT - 装笼日期
     */
    public String getPutCageDt() {
        return putCageDt;
    }

    /**
     * 设置装笼日期
     *
     * @param putCageDt 装笼日期
     */
    public TManufOrd setPutCageDt(String putCageDt) {
        this.putCageDt = putCageDt == null ? null : putCageDt.trim();
        return this;
    }

    /**
     * 获取实际进缸日期
     *
     * @return ENTER_VAT_DT - 实际进缸日期
     */
    public String getEnterVatDt() {
        return enterVatDt;
    }

    /**
     * 设置实际进缸日期
     *
     * @param enterVatDt 实际进缸日期
     */
    public TManufOrd setEnterVatDt(String enterVatDt) {
        this.enterVatDt = enterVatDt == null ? null : enterVatDt.trim();
        return this;
    }

    /**
     * 获取实际出缸日期
     *
     * @return OUT_VAT_DT - 实际出缸日期
     */
    public String getOutVatDt() {
        return outVatDt;
    }

    /**
     * 设置实际出缸日期
     *
     * @param outVatDt 实际出缸日期
     */
    public TManufOrd setOutVatDt(String outVatDt) {
        this.outVatDt = outVatDt == null ? null : outVatDt.trim();
        return this;
    }

    /**
     * 获取质检结果
     *
     * @return QC_RESULT - 质检结果
     */
    public String getQcResult() {
        return qcResult;
    }

    /**
     * 设置质检结果
     *
     * @param qcResult 质检结果
     */
    public TManufOrd setQcResult(String qcResult) {
        this.qcResult = qcResult == null ? null : qcResult.trim();
        return this;
    }

    /**
     * 获取箱ID
     *
     * @return BOX_ID - 箱ID
     */
    public String getBoxId() {
        return boxId;
    }

    /**
     * 设置箱ID
     *
     * @param boxId 箱ID
     */
    public TManufOrd setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
        return this;
    }

    /**
     * 获取生产需量
     *
     * @return NEED_QTY - 生产需量
     */
    public BigDecimal getNeedQty() {
        return needQty;
    }

    /**
     * 设置生产需量
     *
     * @param needQty 生产需量
     */
    public TManufOrd setNeedQty(BigDecimal needQty) {
        this.needQty = needQty;
        return this;
    }

    /**
     * 获取生产损耗
     *
     * @return LOSS_QTY - 生产损耗
     */
    public BigDecimal getLossQty() {
        return lossQty;
    }

    /**
     * 设置生产损耗
     *
     * @param lossQty 生产损耗
     */
    public TManufOrd setLossQty(BigDecimal lossQty) {
        this.lossQty = lossQty;
        return this;
    }

    /**
     * 获取需采购量
     *
     * @return PURCHASE_QTY - 需采购量
     */
    public BigDecimal getPurchaseQty() {
        return purchaseQty;
    }

    /**
     * 设置需采购量
     *
     * @param purchaseQty 需采购量
     */
    public TManufOrd setPurchaseQty(BigDecimal purchaseQty) {
        this.purchaseQty = purchaseQty;
        return this;
    }

    /**
     * 获取投入总重量
     *
     * @return TOTAL_WEIGHT_IN - 投入总重量
     */
    public BigDecimal getTotalWeightIn() {
        return totalWeightIn;
    }

    /**
     * 设置投入总重量
     *
     * @param totalWeightIn 投入总重量
     */
    public TManufOrd setTotalWeightIn(BigDecimal totalWeightIn) {
        this.totalWeightIn = totalWeightIn;
        return this;
    }

    /**
     * 获取投入总数量
     *
     * @return TOTAL_QTY_IN - 投入总数量
     */
    public BigDecimal getTotalQtyIn() {
        return totalQtyIn;
    }

    /**
     * 设置投入总数量
     *
     * @param totalQtyIn 投入总数量
     */
    public TManufOrd setTotalQtyIn(BigDecimal totalQtyIn) {
        this.totalQtyIn = totalQtyIn;
        return this;
    }

    /**
     * 获取产出毛重
     *
     * @return FINISH_GWEIGHT - 产出毛重
     */
    public BigDecimal getFinishGweight() {
        return finishGweight;
    }

    /**
     * 设置产出毛重
     *
     * @param finishGweight 产出毛重
     */
    public TManufOrd setFinishGweight(BigDecimal finishGweight) {
        this.finishGweight = finishGweight;
        return this;
    }

    /**
     * 获取产出净重
     *
     * @return FINISH_NWEIGHT - 产出净重
     */
    public BigDecimal getFinishNweight() {
        return finishNweight;
    }

    /**
     * 设置产出净重
     *
     * @param finishNweight 产出净重
     */
    public TManufOrd setFinishNweight(BigDecimal finishNweight) {
        this.finishNweight = finishNweight;
        return this;
    }

    /**
     * 获取产出数量
     *
     * @return FINISH_QTY - 产出数量
     */
    public BigDecimal getFinishQty() {
        return finishQty;
    }

    /**
     * 设置产出数量
     *
     * @param finishQty 产出数量
     */
    public TManufOrd setFinishQty(BigDecimal finishQty) {
        this.finishQty = finishQty;
        return this;
    }

    /**
     * 获取计数单位
     *
     * @return QTY_UNIT - 计数单位
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * 设置计数单位
     *
     * @param qtyUnit 计数单位
     */
    public TManufOrd setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit == null ? null : qtyUnit.trim();
        return this;
    }

    /**
     * 获取外发标志
     *
     * @return OUT_FLG - 外发标志
     */
    public BigDecimal getOutFlg() {
        return outFlg;
    }

    /**
     * 设置外发标志
     *
     * @param outFlg 外发标志
     */
    public TManufOrd setOutFlg(BigDecimal outFlg) {
        this.outFlg = outFlg;
        return this;
    }

    /**
     * 获取采购计划标志
     *
     * @return PURCHASE_PLAN_FLG - 采购计划标志
     */
    public String getPurchasePlanFlg() {
        return purchasePlanFlg;
    }

    /**
     * 设置采购计划标志
     *
     * @param purchasePlanFlg 采购计划标志
     */
    public TManufOrd setPurchasePlanFlg(String purchasePlanFlg) {
        this.purchasePlanFlg = purchasePlanFlg == null ? null : purchasePlanFlg.trim();
        return this;
    }

    /**
     * 获取外发计划标志
     *
     * @return OF_PLAN_FLG - 外发计划标志
     */
    public String getOfPlanFlg() {
        return ofPlanFlg;
    }

    /**
     * 设置外发计划标志
     *
     * @param ofPlanFlg 外发计划标志
     */
    public TManufOrd setOfPlanFlg(String ofPlanFlg) {
        this.ofPlanFlg = ofPlanFlg == null ? null : ofPlanFlg.trim();
        return this;
    }

    /**
     * 获取记录人
     *
     * @return INPUT_USER_ID - 记录人
     */
    public String getInputUserId() {
        return inputUserId;
    }

    /**
     * 设置记录人
     *
     * @param inputUserId 记录人
     */
    public TManufOrd setInputUserId(String inputUserId) {
        this.inputUserId = inputUserId == null ? null : inputUserId.trim();
        return this;
    }

    /**
     * 获取记录时间
     *
     * @return INPUT_DT - 记录时间
     */
    public Date getInputDt() {
        return inputDt;
    }

    /**
     * 设置记录时间
     *
     * @param inputDt 记录时间
     */
    public TManufOrd setInputDt(Date inputDt) {
        this.inputDt = inputDt;
        return this;
    }

    /**
     * 获取预定出库单号
     *
     * @return SHP_ORD_NUM - 预定出库单号
     */
    public String getShpOrdNum() {
        return shpOrdNum;
    }

    /**
     * 设置预定出库单号
     *
     * @param shpOrdNum 预定出库单号
     */
    public TManufOrd setShpOrdNum(String shpOrdNum) {
        this.shpOrdNum = shpOrdNum == null ? null : shpOrdNum.trim();
        return this;
    }

    /**
     * 获取预定入库单号
     *
     * @return RCV_ORD_NUM - 预定入库单号
     */
    public String getRcvOrdNum() {
        return rcvOrdNum;
    }

    /**
     * 设置预定入库单号
     *
     * @param rcvOrdNum 预定入库单号
     */
    public TManufOrd setRcvOrdNum(String rcvOrdNum) {
        this.rcvOrdNum = rcvOrdNum == null ? null : rcvOrdNum.trim();
        return this;
    }

    /**
     * 获取账面库存编号
     *
     * @return BOOK_NUM - 账面库存编号
     */
    public String getBookNum() {
        return bookNum;
    }

    /**
     * 设置账面库存编号
     *
     * @param bookNum 账面库存编号
     */
    public TManufOrd setBookNum(String bookNum) {
        this.bookNum = bookNum == null ? null : bookNum.trim();
        return this;
    }

    /**
     * 获取机台ID
     *
     * @return MACHINE_ID - 机台ID
     */
    public String getMachineId() {
        return machineId;
    }

    /**
     * 设置机台ID
     *
     * @param machineId 机台ID
     */
    public TManufOrd setMachineId(String machineId) {
        this.machineId = machineId == null ? null : machineId.trim();
        return this;
    }

    /**
     * 获取单重
     *
     * @return PIECE_WGT - 单重
     */
    public BigDecimal getPieceWgt() {
        return pieceWgt;
    }

    /**
     * 设置单重
     *
     * @param pieceWgt 单重
     */
    public TManufOrd setPieceWgt(BigDecimal pieceWgt) {
        this.pieceWgt = pieceWgt;
        return this;
    }

    /**
     * 获取日内排序
     *
     * @return DAY_SORT - 日内排序
     */
    public String getDaySort() {
        return daySort;
    }

    /**
     * 设置日内排序
     *
     * @param daySort 日内排序
     */
    public TManufOrd setDaySort(String daySort) {
        this.daySort = daySort == null ? null : daySort.trim();
        return this;
    }

    /**
     * 获取并缸投染数
     *
     * @return TOTAL_WGT - 并缸投染数
     */
    public BigDecimal getTotalWgt() {
        return totalWgt;
    }

    /**
     * 设置并缸投染数
     *
     * @param totalWgt 并缸投染数
     */
    public TManufOrd setTotalWgt(BigDecimal totalWgt) {
        this.totalWgt = totalWgt;
        return this;
    }

    /**
     * 获取加急标志
     *
     * @return URGENT_FLG - 加急标志
     */
    public String getUrgentFlg() {
        return urgentFlg;
    }

    /**
     * 设置加急标志
     *
     * @param urgentFlg 加急标志
     */
    public TManufOrd setUrgentFlg(String urgentFlg) {
        this.urgentFlg = urgentFlg == null ? null : urgentFlg.trim();
        return this;
    }

    /**
     * 获取计划执行状态
     *
     * @return PLAN_CLS - 计划执行状态
     */
    public String getPlanCls() {
        return planCls;
    }

    /**
     * 设置计划执行状态
     *
     * @param planCls 计划执行状态
     */
    public TManufOrd setPlanCls(String planCls) {
        this.planCls = planCls == null ? null : planCls.trim();
        return this;
    }

    /**
     * 获取复样执行状态
     *
     * @return COLOR_CLS - 复样执行状态
     */
    public String getColorCls() {
        return colorCls;
    }

    /**
     * 设置复样执行状态
     *
     * @param colorCls 复样执行状态
     */
    public TManufOrd setColorCls(String colorCls) {
        this.colorCls = colorCls == null ? null : colorCls.trim();
        return this;
    }

    /**
     * 获取生产执行状态
     *
     * @return WORK_CLS - 生产执行状态
     */
    public String getWorkCls() {
        return workCls;
    }

    /**
     * 设置生产执行状态
     *
     * @param workCls 生产执行状态
     */
    public TManufOrd setWorkCls(String workCls) {
        this.workCls = workCls == null ? null : workCls.trim();
        return this;
    }

    /**
     * 获取备注1
     *
     * @return REMARK1 - 备注1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * 设置备注1
     *
     * @param remark1 备注1
     */
    public TManufOrd setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
        return this;
    }

    /**
     * 获取备注2
     *
     * @return REMARK2 - 备注2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 设置备注2
     *
     * @param remark2 备注2
     */
    public TManufOrd setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
        return this;
    }

    /**
     * 获取备注3
     *
     * @return REMARK3 - 备注3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * 设置备注3
     *
     * @param remark3 备注3
     */
    public TManufOrd setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
        return this;
    }

    /**
     * 获取文本1
     *
     * @return CHAR1 - 文本1
     */
    public String getChar1() {
        return char1;
    }

    /**
     * 设置文本1
     *
     * @param char1 文本1
     */
    public TManufOrd setChar1(String char1) {
        this.char1 = char1 == null ? null : char1.trim();
        return this;
    }

    /**
     * 获取文本2
     *
     * @return CHAR2 - 文本2
     */
    public String getChar2() {
        return char2;
    }

    /**
     * 设置文本2
     *
     * @param char2 文本2
     */
    public TManufOrd setChar2(String char2) {
        this.char2 = char2 == null ? null : char2.trim();
        return this;
    }

    /**
     * 获取文本3
     *
     * @return CHAR3 - 文本3
     */
    public String getChar3() {
        return char3;
    }

    /**
     * 设置文本3
     *
     * @param char3 文本3
     */
    public TManufOrd setChar3(String char3) {
        this.char3 = char3 == null ? null : char3.trim();
        return this;
    }

    /**
     * 获取文本4
     *
     * @return CHAR4 - 文本4
     */
    public String getChar4() {
        return char4;
    }

    /**
     * 设置文本4
     *
     * @param char4 文本4
     */
    public TManufOrd setChar4(String char4) {
        this.char4 = char4 == null ? null : char4.trim();
        return this;
    }

    /**
     * 获取文本5
     *
     * @return CHAR5 - 文本5
     */
    public String getChar5() {
        return char5;
    }

    /**
     * 设置文本5
     *
     * @param char5 文本5
     */
    public TManufOrd setChar5(String char5) {
        this.char5 = char5 == null ? null : char5.trim();
        return this;
    }

    /**
     * 获取文本6
     *
     * @return CHAR6 - 文本6
     */
    public String getChar6() {
        return char6;
    }

    /**
     * 设置文本6
     *
     * @param char6 文本6
     */
    public TManufOrd setChar6(String char6) {
        this.char6 = char6 == null ? null : char6.trim();
        return this;
    }

    /**
     * 获取文本7
     *
     * @return CHAR7 - 文本7
     */
    public String getChar7() {
        return char7;
    }

    /**
     * 设置文本7
     *
     * @param char7 文本7
     */
    public TManufOrd setChar7(String char7) {
        this.char7 = char7 == null ? null : char7.trim();
        return this;
    }

    /**
     * 获取文本8
     *
     * @return CHAR8 - 文本8
     */
    public String getChar8() {
        return char8;
    }

    /**
     * 设置文本8
     *
     * @param char8 文本8
     */
    public TManufOrd setChar8(String char8) {
        this.char8 = char8 == null ? null : char8.trim();
        return this;
    }

    /**
     * 获取文本9
     *
     * @return CHAR9 - 文本9
     */
    public String getChar9() {
        return char9;
    }

    /**
     * 设置文本9
     *
     * @param char9 文本9
     */
    public TManufOrd setChar9(String char9) {
        this.char9 = char9 == null ? null : char9.trim();
        return this;
    }

    /**
     * 获取文本10
     *
     * @return CHAR10 - 文本10
     */
    public String getChar10() {
        return char10;
    }

    /**
     * 设置文本10
     *
     * @param char10 文本10
     */
    public TManufOrd setChar10(String char10) {
        this.char10 = char10 == null ? null : char10.trim();
        return this;
    }

    /**
     * 获取数值1
     *
     * @return NUM1 - 数值1
     */
    public BigDecimal getNum1() {
        return num1;
    }

    /**
     * 设置数值1
     *
     * @param num1 数值1
     */
    public TManufOrd setNum1(BigDecimal num1) {
        this.num1 = num1;
        return this;
    }

    /**
     * 获取数值2
     *
     * @return NUM2 - 数值2
     */
    public BigDecimal getNum2() {
        return num2;
    }

    /**
     * 设置数值2
     *
     * @param num2 数值2
     */
    public TManufOrd setNum2(BigDecimal num2) {
        this.num2 = num2;
        return this;
    }

    /**
     * 获取数值3
     *
     * @return NUM3 - 数值3
     */
    public BigDecimal getNum3() {
        return num3;
    }

    /**
     * 设置数值3
     *
     * @param num3 数值3
     */
    public TManufOrd setNum3(BigDecimal num3) {
        this.num3 = num3;
        return this;
    }

    /**
     * 获取数值4
     *
     * @return NUM4 - 数值4
     */
    public BigDecimal getNum4() {
        return num4;
    }

    /**
     * 设置数值4
     *
     * @param num4 数值4
     */
    public TManufOrd setNum4(BigDecimal num4) {
        this.num4 = num4;
        return this;
    }

    /**
     * 获取数值5
     *
     * @return NUM5 - 数值5
     */
    public BigDecimal getNum5() {
        return num5;
    }

    /**
     * 设置数值5
     *
     * @param num5 数值5
     */
    public TManufOrd setNum5(BigDecimal num5) {
        this.num5 = num5;
        return this;
    }

    /**
     * 获取数值6
     *
     * @return NUM6 - 数值6
     */
    public BigDecimal getNum6() {
        return num6;
    }

    /**
     * 设置数值6
     *
     * @param num6 数值6
     */
    public TManufOrd setNum6(BigDecimal num6) {
        this.num6 = num6;
        return this;
    }

    /**
     * 获取数值7
     *
     * @return NUM7 - 数值7
     */
    public BigDecimal getNum7() {
        return num7;
    }

    /**
     * 设置数值7
     *
     * @param num7 数值7
     */
    public TManufOrd setNum7(BigDecimal num7) {
        this.num7 = num7;
        return this;
    }

    /**
     * 获取数值8
     *
     * @return NUM8 - 数值8
     */
    public BigDecimal getNum8() {
        return num8;
    }

    /**
     * 设置数值8
     *
     * @param num8 数值8
     */
    public TManufOrd setNum8(BigDecimal num8) {
        this.num8 = num8;
        return this;
    }

    /**
     * 获取数值9
     *
     * @return NUM9 - 数值9
     */
    public BigDecimal getNum9() {
        return num9;
    }

    /**
     * 设置数值9
     *
     * @param num9 数值9
     */
    public TManufOrd setNum9(BigDecimal num9) {
        this.num9 = num9;
        return this;
    }

    /**
     * 获取数值10
     *
     * @return NUM10 - 数值10
     */
    public BigDecimal getNum10() {
        return num10;
    }

    /**
     * 设置数值10
     *
     * @param num10 数值10
     */
    public TManufOrd setNum10(BigDecimal num10) {
        this.num10 = num10;
        return this;
    }

    /**
     * 获取更新次数
     *
     * @return UPD_CNT - 更新次数
     */
    public Integer getUpdCnt() {
        return updCnt;
    }

    /**
     * 设置更新次数
     *
     * @param updCnt 更新次数
     */
    public TManufOrd setUpdCnt(Integer updCnt) {
        this.updCnt = updCnt;
        return this;
    }

    /**
     * 获取删除区分
     *
     * @return DEL_FLG - 删除区分
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * 设置删除区分
     *
     * @param delFlg 删除区分
     */
    public TManufOrd setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
        return this;
    }

    /**
     * 获取登录时输入区分
     *
     * @return ADD_ENT_KBN - 登录时输入区分
     */
    public String getAddEntKbn() {
        return addEntKbn;
    }

    /**
     * 设置登录时输入区分
     *
     * @param addEntKbn 登录时输入区分
     */
    public TManufOrd setAddEntKbn(String addEntKbn) {
        this.addEntKbn = addEntKbn == null ? null : addEntKbn.trim();
        return this;
    }

    /**
     * 获取登录时程序ID
     *
     * @return ADD_PGM_ID - 登录时程序ID
     */
    public String getAddPgmId() {
        return addPgmId;
    }

    /**
     * 设置登录时程序ID
     *
     * @param addPgmId 登录时程序ID
     */
    public TManufOrd setAddPgmId(String addPgmId) {
        this.addPgmId = addPgmId == null ? null : addPgmId.trim();
        return this;
    }

    /**
     * 获取登录时用户ID
     *
     * @return ADD_USER_ID - 登录时用户ID
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置登录时用户ID
     *
     * @param addUserId 登录时用户ID
     */
    public TManufOrd setAddUserId(String addUserId) {
        this.addUserId = addUserId == null ? null : addUserId.trim();
        return this;
    }

    /**
     * 获取登录时用户名称
     *
     * @return ADD_USER_NM - 登录时用户名称
     */
    public String getAddUserNm() {
        return addUserNm;
    }

    /**
     * 设置登录时用户名称
     *
     * @param addUserNm 登录时用户名称
     */
    public TManufOrd setAddUserNm(String addUserNm) {
        this.addUserNm = addUserNm == null ? null : addUserNm.trim();
        return this;
    }

    /**
     * 获取登录时端末ID
     *
     * @return ADD_TNMT_ID - 登录时端末ID
     */
    public String getAddTnmtId() {
        return addTnmtId;
    }

    /**
     * 设置登录时端末ID
     *
     * @param addTnmtId 登录时端末ID
     */
    public TManufOrd setAddTnmtId(String addTnmtId) {
        this.addTnmtId = addTnmtId == null ? null : addTnmtId.trim();
        return this;
    }

    /**
     * 获取登录日期
     *
     * @return ADD_DT - 登录日期
     */
    public Date getAddDt() {
        return addDt;
    }

    /**
     * 设置登录日期
     *
     * @param addDt 登录日期
     */
    public TManufOrd setAddDt(Date addDt) {
        this.addDt = addDt;
        return this;
    }

    /**
     * 获取更新时输入区分
     *
     * @return UPD_ENT_KBN - 更新时输入区分
     */
    public String getUpdEntKbn() {
        return updEntKbn;
    }

    /**
     * 设置更新时输入区分
     *
     * @param updEntKbn 更新时输入区分
     */
    public TManufOrd setUpdEntKbn(String updEntKbn) {
        this.updEntKbn = updEntKbn == null ? null : updEntKbn.trim();
        return this;
    }

    /**
     * 获取更新时程序ID
     *
     * @return UPD_PGM_ID - 更新时程序ID
     */
    public String getUpdPgmId() {
        return updPgmId;
    }

    /**
     * 设置更新时程序ID
     *
     * @param updPgmId 更新时程序ID
     */
    public TManufOrd setUpdPgmId(String updPgmId) {
        this.updPgmId = updPgmId == null ? null : updPgmId.trim();
        return this;
    }

    /**
     * 获取更新时用户ID
     *
     * @return UPD_USER_ID - 更新时用户ID
     */
    public String getUpdUserId() {
        return updUserId;
    }

    /**
     * 设置更新时用户ID
     *
     * @param updUserId 更新时用户ID
     */
    public TManufOrd setUpdUserId(String updUserId) {
        this.updUserId = updUserId == null ? null : updUserId.trim();
        return this;
    }

    /**
     * 获取更新时用户名称
     *
     * @return UPD_USER_NM - 更新时用户名称
     */
    public String getUpdUserNm() {
        return updUserNm;
    }

    /**
     * 设置更新时用户名称
     *
     * @param updUserNm 更新时用户名称
     */
    public TManufOrd setUpdUserNm(String updUserNm) {
        this.updUserNm = updUserNm == null ? null : updUserNm.trim();
        return this;
    }

    /**
     * 获取更新时端末ID
     *
     * @return UPD_TNMT_ID - 更新时端末ID
     */
    public String getUpdTnmtId() {
        return updTnmtId;
    }

    /**
     * 设置更新时端末ID
     *
     * @param updTnmtId 更新时端末ID
     */
    public TManufOrd setUpdTnmtId(String updTnmtId) {
        this.updTnmtId = updTnmtId == null ? null : updTnmtId.trim();
        return this;
    }

    /**
     * 获取更新日期
     *
     * @return UPD_DT - 更新日期
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * 设置更新日期
     *
     * @param updDt 更新日期
     */
    public TManufOrd setUpdDt(Date updDt) {
        this.updDt = updDt;
        return this;
    }

    /**
     * 获取毛坯仓库
     *
     * @return WH_ID_FROM - 毛坯仓库
     */
    public String getWhIdFrom() {
        return whIdFrom;
    }

    /**
     * 设置毛坯仓库
     *
     * @param whIdFrom 毛坯仓库
     */
    public TManufOrd setWhIdFrom(String whIdFrom) {
        this.whIdFrom = whIdFrom == null ? null : whIdFrom.trim();
        return this;
    }

    /**
     * 获取成品仓库
     *
     * @return WH_ID_TO - 成品仓库
     */
    public String getWhIdTo() {
        return whIdTo;
    }

    /**
     * 设置成品仓库
     *
     * @param whIdTo 成品仓库
     */
    public TManufOrd setWhIdTo(String whIdTo) {
        this.whIdTo = whIdTo == null ? null : whIdTo.trim();
        return this;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TManufOrd other = (TManufOrd) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getManufOrdCd() == null ? other.getManufOrdCd() == null : this.getManufOrdCd().equals(other.getManufOrdCd()))
            && (this.getManufType() == null ? other.getManufType() == null : this.getManufType().equals(other.getManufType()))
            && (this.getOrdType() == null ? other.getOrdType() == null : this.getOrdType().equals(other.getOrdType()))
            && (this.getManufCls() == null ? other.getManufCls() == null : this.getManufCls().equals(other.getManufCls()))
            && (this.getManufProcessId() == null ? other.getManufProcessId() == null : this.getManufProcessId().equals(other.getManufProcessId()))
            && (this.getManufProcessDt() == null ? other.getManufProcessDt() == null : this.getManufProcessDt().equals(other.getManufProcessDt()))
            && (this.getCntrCd() == null ? other.getCntrCd() == null : this.getCntrCd().equals(other.getCntrCd()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getProdId() == null ? other.getProdId() == null : this.getProdId().equals(other.getProdId()))
            && (this.getYarnRemarks() == null ? other.getYarnRemarks() == null : this.getYarnRemarks().equals(other.getYarnRemarks()))
            && (this.getLot() == null ? other.getLot() == null : this.getLot().equals(other.getLot()))
            && (this.getCraftSn() == null ? other.getCraftSn() == null : this.getCraftSn().equals(other.getCraftSn()))
            && (this.getColorCd() == null ? other.getColorCd() == null : this.getColorCd().equals(other.getColorCd()))
            && (this.getColorSystem() == null ? other.getColorSystem() == null : this.getColorSystem().equals(other.getColorSystem()))
            && (this.getColorNm() == null ? other.getColorNm() == null : this.getColorNm().equals(other.getColorNm()))
            && (this.getManufDt() == null ? other.getManufDt() == null : this.getManufDt().equals(other.getManufDt()))
            && (this.getManufOrdDt() == null ? other.getManufOrdDt() == null : this.getManufOrdDt().equals(other.getManufOrdDt()))
            && (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getMainBatchNoId() == null ? other.getMainBatchNoId() == null : this.getMainBatchNoId().equals(other.getMainBatchNoId()))
            && (this.getMachineNo() == null ? other.getMachineNo() == null : this.getMachineNo().equals(other.getMachineNo()))
            && (this.getEnterVatOrdDt() == null ? other.getEnterVatOrdDt() == null : this.getEnterVatOrdDt().equals(other.getEnterVatOrdDt()))
            && (this.getWhSendOutDt() == null ? other.getWhSendOutDt() == null : this.getWhSendOutDt().equals(other.getWhSendOutDt()))
            && (this.getDoSampleDt() == null ? other.getDoSampleDt() == null : this.getDoSampleDt().equals(other.getDoSampleDt()))
            && (this.getGetFormulaDt() == null ? other.getGetFormulaDt() == null : this.getGetFormulaDt().equals(other.getGetFormulaDt()))
            && (this.getFixUpVatDt() == null ? other.getFixUpVatDt() == null : this.getFixUpVatDt().equals(other.getFixUpVatDt()))
            && (this.getPutCageDt() == null ? other.getPutCageDt() == null : this.getPutCageDt().equals(other.getPutCageDt()))
            && (this.getEnterVatDt() == null ? other.getEnterVatDt() == null : this.getEnterVatDt().equals(other.getEnterVatDt()))
            && (this.getOutVatDt() == null ? other.getOutVatDt() == null : this.getOutVatDt().equals(other.getOutVatDt()))
            && (this.getQcResult() == null ? other.getQcResult() == null : this.getQcResult().equals(other.getQcResult()))
            && (this.getBoxId() == null ? other.getBoxId() == null : this.getBoxId().equals(other.getBoxId()))
            && (this.getNeedQty() == null ? other.getNeedQty() == null : this.getNeedQty().equals(other.getNeedQty()))
            && (this.getLossQty() == null ? other.getLossQty() == null : this.getLossQty().equals(other.getLossQty()))
            && (this.getPurchaseQty() == null ? other.getPurchaseQty() == null : this.getPurchaseQty().equals(other.getPurchaseQty()))
            && (this.getTotalWeightIn() == null ? other.getTotalWeightIn() == null : this.getTotalWeightIn().equals(other.getTotalWeightIn()))
            && (this.getTotalQtyIn() == null ? other.getTotalQtyIn() == null : this.getTotalQtyIn().equals(other.getTotalQtyIn()))
            && (this.getFinishGweight() == null ? other.getFinishGweight() == null : this.getFinishGweight().equals(other.getFinishGweight()))
            && (this.getFinishNweight() == null ? other.getFinishNweight() == null : this.getFinishNweight().equals(other.getFinishNweight()))
            && (this.getFinishQty() == null ? other.getFinishQty() == null : this.getFinishQty().equals(other.getFinishQty()))
            && (this.getQtyUnit() == null ? other.getQtyUnit() == null : this.getQtyUnit().equals(other.getQtyUnit()))
            && (this.getOutFlg() == null ? other.getOutFlg() == null : this.getOutFlg().equals(other.getOutFlg()))
            && (this.getPurchasePlanFlg() == null ? other.getPurchasePlanFlg() == null : this.getPurchasePlanFlg().equals(other.getPurchasePlanFlg()))
            && (this.getOfPlanFlg() == null ? other.getOfPlanFlg() == null : this.getOfPlanFlg().equals(other.getOfPlanFlg()))
            && (this.getInputUserId() == null ? other.getInputUserId() == null : this.getInputUserId().equals(other.getInputUserId()))
            && (this.getInputDt() == null ? other.getInputDt() == null : this.getInputDt().equals(other.getInputDt()))
            && (this.getShpOrdNum() == null ? other.getShpOrdNum() == null : this.getShpOrdNum().equals(other.getShpOrdNum()))
            && (this.getRcvOrdNum() == null ? other.getRcvOrdNum() == null : this.getRcvOrdNum().equals(other.getRcvOrdNum()))
            && (this.getBookNum() == null ? other.getBookNum() == null : this.getBookNum().equals(other.getBookNum()))
            && (this.getMachineId() == null ? other.getMachineId() == null : this.getMachineId().equals(other.getMachineId()))
            && (this.getPieceWgt() == null ? other.getPieceWgt() == null : this.getPieceWgt().equals(other.getPieceWgt()))
            && (this.getDaySort() == null ? other.getDaySort() == null : this.getDaySort().equals(other.getDaySort()))
            && (this.getTotalWgt() == null ? other.getTotalWgt() == null : this.getTotalWgt().equals(other.getTotalWgt()))
            && (this.getUrgentFlg() == null ? other.getUrgentFlg() == null : this.getUrgentFlg().equals(other.getUrgentFlg()))
            && (this.getPlanCls() == null ? other.getPlanCls() == null : this.getPlanCls().equals(other.getPlanCls()))
            && (this.getColorCls() == null ? other.getColorCls() == null : this.getColorCls().equals(other.getColorCls()))
            && (this.getWorkCls() == null ? other.getWorkCls() == null : this.getWorkCls().equals(other.getWorkCls()))
            && (this.getRemark1() == null ? other.getRemark1() == null : this.getRemark1().equals(other.getRemark1()))
            && (this.getRemark2() == null ? other.getRemark2() == null : this.getRemark2().equals(other.getRemark2()))
            && (this.getRemark3() == null ? other.getRemark3() == null : this.getRemark3().equals(other.getRemark3()))
            && (this.getControlImportFlg() == null ? other.getControlImportFlg() == null : this.getControlImportFlg().equals(other.getControlImportFlg()))
            && (this.getChar1() == null ? other.getChar1() == null : this.getChar1().equals(other.getChar1()))
            && (this.getChar2() == null ? other.getChar2() == null : this.getChar2().equals(other.getChar2()))
            && (this.getChar3() == null ? other.getChar3() == null : this.getChar3().equals(other.getChar3()))
            && (this.getChar4() == null ? other.getChar4() == null : this.getChar4().equals(other.getChar4()))
            && (this.getChar5() == null ? other.getChar5() == null : this.getChar5().equals(other.getChar5()))
            && (this.getChar6() == null ? other.getChar6() == null : this.getChar6().equals(other.getChar6()))
            && (this.getChar7() == null ? other.getChar7() == null : this.getChar7().equals(other.getChar7()))
            && (this.getChar8() == null ? other.getChar8() == null : this.getChar8().equals(other.getChar8()))
            && (this.getChar9() == null ? other.getChar9() == null : this.getChar9().equals(other.getChar9()))
            && (this.getChar10() == null ? other.getChar10() == null : this.getChar10().equals(other.getChar10()))
            && (this.getNum1() == null ? other.getNum1() == null : this.getNum1().equals(other.getNum1()))
            && (this.getNum2() == null ? other.getNum2() == null : this.getNum2().equals(other.getNum2()))
            && (this.getNum3() == null ? other.getNum3() == null : this.getNum3().equals(other.getNum3()))
            && (this.getNum4() == null ? other.getNum4() == null : this.getNum4().equals(other.getNum4()))
            && (this.getNum5() == null ? other.getNum5() == null : this.getNum5().equals(other.getNum5()))
            && (this.getNum6() == null ? other.getNum6() == null : this.getNum6().equals(other.getNum6()))
            && (this.getNum7() == null ? other.getNum7() == null : this.getNum7().equals(other.getNum7()))
            && (this.getNum8() == null ? other.getNum8() == null : this.getNum8().equals(other.getNum8()))
            && (this.getNum9() == null ? other.getNum9() == null : this.getNum9().equals(other.getNum9()))
            && (this.getNum10() == null ? other.getNum10() == null : this.getNum10().equals(other.getNum10()))
            && (this.getUpdCnt() == null ? other.getUpdCnt() == null : this.getUpdCnt().equals(other.getUpdCnt()))
            && (this.getDelFlg() == null ? other.getDelFlg() == null : this.getDelFlg().equals(other.getDelFlg()))
            && (this.getAddEntKbn() == null ? other.getAddEntKbn() == null : this.getAddEntKbn().equals(other.getAddEntKbn()))
            && (this.getAddPgmId() == null ? other.getAddPgmId() == null : this.getAddPgmId().equals(other.getAddPgmId()))
            && (this.getAddUserId() == null ? other.getAddUserId() == null : this.getAddUserId().equals(other.getAddUserId()))
            && (this.getAddUserNm() == null ? other.getAddUserNm() == null : this.getAddUserNm().equals(other.getAddUserNm()))
            && (this.getAddTnmtId() == null ? other.getAddTnmtId() == null : this.getAddTnmtId().equals(other.getAddTnmtId()))
            && (this.getAddDt() == null ? other.getAddDt() == null : this.getAddDt().equals(other.getAddDt()))
            && (this.getUpdEntKbn() == null ? other.getUpdEntKbn() == null : this.getUpdEntKbn().equals(other.getUpdEntKbn()))
            && (this.getUpdPgmId() == null ? other.getUpdPgmId() == null : this.getUpdPgmId().equals(other.getUpdPgmId()))
            && (this.getUpdUserId() == null ? other.getUpdUserId() == null : this.getUpdUserId().equals(other.getUpdUserId()))
            && (this.getUpdUserNm() == null ? other.getUpdUserNm() == null : this.getUpdUserNm().equals(other.getUpdUserNm()))
            && (this.getUpdTnmtId() == null ? other.getUpdTnmtId() == null : this.getUpdTnmtId().equals(other.getUpdTnmtId()))
            && (this.getUpdDt() == null ? other.getUpdDt() == null : this.getUpdDt().equals(other.getUpdDt()))
            && (this.getWhIdFrom() == null ? other.getWhIdFrom() == null : this.getWhIdFrom().equals(other.getWhIdFrom()))
            && (this.getWhIdTo() == null ? other.getWhIdTo() == null : this.getWhIdTo().equals(other.getWhIdTo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getManufOrdCd() == null) ? 0 : getManufOrdCd().hashCode());
        result = prime * result + ((getManufType() == null) ? 0 : getManufType().hashCode());
        result = prime * result + ((getOrdType() == null) ? 0 : getOrdType().hashCode());
        result = prime * result + ((getManufCls() == null) ? 0 : getManufCls().hashCode());
        result = prime * result + ((getManufProcessId() == null) ? 0 : getManufProcessId().hashCode());
        result = prime * result + ((getManufProcessDt() == null) ? 0 : getManufProcessDt().hashCode());
        result = prime * result + ((getCntrCd() == null) ? 0 : getCntrCd().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getProdId() == null) ? 0 : getProdId().hashCode());
        result = prime * result + ((getYarnRemarks() == null) ? 0 : getYarnRemarks().hashCode());
        result = prime * result + ((getLot() == null) ? 0 : getLot().hashCode());
        result = prime * result + ((getCraftSn() == null) ? 0 : getCraftSn().hashCode());
        result = prime * result + ((getColorCd() == null) ? 0 : getColorCd().hashCode());
        result = prime * result + ((getColorSystem() == null) ? 0 : getColorSystem().hashCode());
        result = prime * result + ((getColorNm() == null) ? 0 : getColorNm().hashCode());
        result = prime * result + ((getManufDt() == null) ? 0 : getManufDt().hashCode());
        result = prime * result + ((getManufOrdDt() == null) ? 0 : getManufOrdDt().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getMainBatchNoId() == null) ? 0 : getMainBatchNoId().hashCode());
        result = prime * result + ((getMachineNo() == null) ? 0 : getMachineNo().hashCode());
        result = prime * result + ((getEnterVatOrdDt() == null) ? 0 : getEnterVatOrdDt().hashCode());
        result = prime * result + ((getWhSendOutDt() == null) ? 0 : getWhSendOutDt().hashCode());
        result = prime * result + ((getDoSampleDt() == null) ? 0 : getDoSampleDt().hashCode());
        result = prime * result + ((getGetFormulaDt() == null) ? 0 : getGetFormulaDt().hashCode());
        result = prime * result + ((getFixUpVatDt() == null) ? 0 : getFixUpVatDt().hashCode());
        result = prime * result + ((getPutCageDt() == null) ? 0 : getPutCageDt().hashCode());
        result = prime * result + ((getEnterVatDt() == null) ? 0 : getEnterVatDt().hashCode());
        result = prime * result + ((getOutVatDt() == null) ? 0 : getOutVatDt().hashCode());
        result = prime * result + ((getQcResult() == null) ? 0 : getQcResult().hashCode());
        result = prime * result + ((getBoxId() == null) ? 0 : getBoxId().hashCode());
        result = prime * result + ((getNeedQty() == null) ? 0 : getNeedQty().hashCode());
        result = prime * result + ((getLossQty() == null) ? 0 : getLossQty().hashCode());
        result = prime * result + ((getPurchaseQty() == null) ? 0 : getPurchaseQty().hashCode());
        result = prime * result + ((getTotalWeightIn() == null) ? 0 : getTotalWeightIn().hashCode());
        result = prime * result + ((getTotalQtyIn() == null) ? 0 : getTotalQtyIn().hashCode());
        result = prime * result + ((getFinishGweight() == null) ? 0 : getFinishGweight().hashCode());
        result = prime * result + ((getFinishNweight() == null) ? 0 : getFinishNweight().hashCode());
        result = prime * result + ((getFinishQty() == null) ? 0 : getFinishQty().hashCode());
        result = prime * result + ((getQtyUnit() == null) ? 0 : getQtyUnit().hashCode());
        result = prime * result + ((getOutFlg() == null) ? 0 : getOutFlg().hashCode());
        result = prime * result + ((getPurchasePlanFlg() == null) ? 0 : getPurchasePlanFlg().hashCode());
        result = prime * result + ((getOfPlanFlg() == null) ? 0 : getOfPlanFlg().hashCode());
        result = prime * result + ((getInputUserId() == null) ? 0 : getInputUserId().hashCode());
        result = prime * result + ((getInputDt() == null) ? 0 : getInputDt().hashCode());
        result = prime * result + ((getShpOrdNum() == null) ? 0 : getShpOrdNum().hashCode());
        result = prime * result + ((getRcvOrdNum() == null) ? 0 : getRcvOrdNum().hashCode());
        result = prime * result + ((getBookNum() == null) ? 0 : getBookNum().hashCode());
        result = prime * result + ((getMachineId() == null) ? 0 : getMachineId().hashCode());
        result = prime * result + ((getPieceWgt() == null) ? 0 : getPieceWgt().hashCode());
        result = prime * result + ((getDaySort() == null) ? 0 : getDaySort().hashCode());
        result = prime * result + ((getTotalWgt() == null) ? 0 : getTotalWgt().hashCode());
        result = prime * result + ((getUrgentFlg() == null) ? 0 : getUrgentFlg().hashCode());
        result = prime * result + ((getPlanCls() == null) ? 0 : getPlanCls().hashCode());
        result = prime * result + ((getColorCls() == null) ? 0 : getColorCls().hashCode());
        result = prime * result + ((getWorkCls() == null) ? 0 : getWorkCls().hashCode());
        result = prime * result + ((getRemark1() == null) ? 0 : getRemark1().hashCode());
        result = prime * result + ((getRemark2() == null) ? 0 : getRemark2().hashCode());
        result = prime * result + ((getRemark3() == null) ? 0 : getRemark3().hashCode());
        result = prime * result + ((getControlImportFlg() == null) ? 0 : getControlImportFlg().hashCode());
        result = prime * result + ((getChar1() == null) ? 0 : getChar1().hashCode());
        result = prime * result + ((getChar2() == null) ? 0 : getChar2().hashCode());
        result = prime * result + ((getChar3() == null) ? 0 : getChar3().hashCode());
        result = prime * result + ((getChar4() == null) ? 0 : getChar4().hashCode());
        result = prime * result + ((getChar5() == null) ? 0 : getChar5().hashCode());
        result = prime * result + ((getChar6() == null) ? 0 : getChar6().hashCode());
        result = prime * result + ((getChar7() == null) ? 0 : getChar7().hashCode());
        result = prime * result + ((getChar8() == null) ? 0 : getChar8().hashCode());
        result = prime * result + ((getChar9() == null) ? 0 : getChar9().hashCode());
        result = prime * result + ((getChar10() == null) ? 0 : getChar10().hashCode());
        result = prime * result + ((getNum1() == null) ? 0 : getNum1().hashCode());
        result = prime * result + ((getNum2() == null) ? 0 : getNum2().hashCode());
        result = prime * result + ((getNum3() == null) ? 0 : getNum3().hashCode());
        result = prime * result + ((getNum4() == null) ? 0 : getNum4().hashCode());
        result = prime * result + ((getNum5() == null) ? 0 : getNum5().hashCode());
        result = prime * result + ((getNum6() == null) ? 0 : getNum6().hashCode());
        result = prime * result + ((getNum7() == null) ? 0 : getNum7().hashCode());
        result = prime * result + ((getNum8() == null) ? 0 : getNum8().hashCode());
        result = prime * result + ((getNum9() == null) ? 0 : getNum9().hashCode());
        result = prime * result + ((getNum10() == null) ? 0 : getNum10().hashCode());
        result = prime * result + ((getUpdCnt() == null) ? 0 : getUpdCnt().hashCode());
        result = prime * result + ((getDelFlg() == null) ? 0 : getDelFlg().hashCode());
        result = prime * result + ((getAddEntKbn() == null) ? 0 : getAddEntKbn().hashCode());
        result = prime * result + ((getAddPgmId() == null) ? 0 : getAddPgmId().hashCode());
        result = prime * result + ((getAddUserId() == null) ? 0 : getAddUserId().hashCode());
        result = prime * result + ((getAddUserNm() == null) ? 0 : getAddUserNm().hashCode());
        result = prime * result + ((getAddTnmtId() == null) ? 0 : getAddTnmtId().hashCode());
        result = prime * result + ((getAddDt() == null) ? 0 : getAddDt().hashCode());
        result = prime * result + ((getUpdEntKbn() == null) ? 0 : getUpdEntKbn().hashCode());
        result = prime * result + ((getUpdPgmId() == null) ? 0 : getUpdPgmId().hashCode());
        result = prime * result + ((getUpdUserId() == null) ? 0 : getUpdUserId().hashCode());
        result = prime * result + ((getUpdUserNm() == null) ? 0 : getUpdUserNm().hashCode());
        result = prime * result + ((getUpdTnmtId() == null) ? 0 : getUpdTnmtId().hashCode());
        result = prime * result + ((getUpdDt() == null) ? 0 : getUpdDt().hashCode());
        result = prime * result + ((getWhIdFrom() == null) ? 0 : getWhIdFrom().hashCode());
        result = prime * result + ((getWhIdTo() == null) ? 0 : getWhIdTo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", manufOrdCd=").append(manufOrdCd);
        sb.append(", manufType=").append(manufType);
        sb.append(", ordType=").append(ordType);
        sb.append(", manufCls=").append(manufCls);
        sb.append(", manufProcessId=").append(manufProcessId);
        sb.append(", manufProcessDt=").append(manufProcessDt);
        sb.append(", cntrCd=").append(cntrCd);
        sb.append(", customerId=").append(customerId);
        sb.append(", prodId=").append(prodId);
        sb.append(", yarnRemarks=").append(yarnRemarks);
        sb.append(", lot=").append(lot);
        sb.append(", craftSn=").append(craftSn);
        sb.append(", colorCd=").append(colorCd);
        sb.append(", colorSystem=").append(colorSystem);
        sb.append(", colorNm=").append(colorNm);
        sb.append(", manufDt=").append(manufDt);
        sb.append(", manufOrdDt=").append(manufOrdDt);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", mainBatchNoId=").append(mainBatchNoId);
        sb.append(", machineNo=").append(machineNo);
        sb.append(", enterVatOrdDt=").append(enterVatOrdDt);
        sb.append(", whSendOutDt=").append(whSendOutDt);
        sb.append(", doSampleDt=").append(doSampleDt);
        sb.append(", getFormulaDt=").append(getFormulaDt);
        sb.append(", fixUpVatDt=").append(fixUpVatDt);
        sb.append(", putCageDt=").append(putCageDt);
        sb.append(", enterVatDt=").append(enterVatDt);
        sb.append(", outVatDt=").append(outVatDt);
        sb.append(", qcResult=").append(qcResult);
        sb.append(", boxId=").append(boxId);
        sb.append(", needQty=").append(needQty);
        sb.append(", lossQty=").append(lossQty);
        sb.append(", purchaseQty=").append(purchaseQty);
        sb.append(", totalWeightIn=").append(totalWeightIn);
        sb.append(", totalQtyIn=").append(totalQtyIn);
        sb.append(", finishGweight=").append(finishGweight);
        sb.append(", finishNweight=").append(finishNweight);
        sb.append(", finishQty=").append(finishQty);
        sb.append(", qtyUnit=").append(qtyUnit);
        sb.append(", outFlg=").append(outFlg);
        sb.append(", purchasePlanFlg=").append(purchasePlanFlg);
        sb.append(", ofPlanFlg=").append(ofPlanFlg);
        sb.append(", inputUserId=").append(inputUserId);
        sb.append(", inputDt=").append(inputDt);
        sb.append(", shpOrdNum=").append(shpOrdNum);
        sb.append(", rcvOrdNum=").append(rcvOrdNum);
        sb.append(", bookNum=").append(bookNum);
        sb.append(", machineId=").append(machineId);
        sb.append(", pieceWgt=").append(pieceWgt);
        sb.append(", daySort=").append(daySort);
        sb.append(", totalWgt=").append(totalWgt);
        sb.append(", urgentFlg=").append(urgentFlg);
        sb.append(", planCls=").append(planCls);
        sb.append(", colorCls=").append(colorCls);
        sb.append(", workCls=").append(workCls);
        sb.append(", remark1=").append(remark1);
        sb.append(", remark2=").append(remark2);
        sb.append(", remark3=").append(remark3);
        sb.append(", controlImportFlg=").append(controlImportFlg);
        sb.append(", char1=").append(char1);
        sb.append(", char2=").append(char2);
        sb.append(", char3=").append(char3);
        sb.append(", char4=").append(char4);
        sb.append(", char5=").append(char5);
        sb.append(", char6=").append(char6);
        sb.append(", char7=").append(char7);
        sb.append(", char8=").append(char8);
        sb.append(", char9=").append(char9);
        sb.append(", char10=").append(char10);
        sb.append(", num1=").append(num1);
        sb.append(", num2=").append(num2);
        sb.append(", num3=").append(num3);
        sb.append(", num4=").append(num4);
        sb.append(", num5=").append(num5);
        sb.append(", num6=").append(num6);
        sb.append(", num7=").append(num7);
        sb.append(", num8=").append(num8);
        sb.append(", num9=").append(num9);
        sb.append(", num10=").append(num10);
        sb.append(", updCnt=").append(updCnt);
        sb.append(", delFlg=").append(delFlg);
        sb.append(", addEntKbn=").append(addEntKbn);
        sb.append(", addPgmId=").append(addPgmId);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addUserNm=").append(addUserNm);
        sb.append(", addTnmtId=").append(addTnmtId);
        sb.append(", addDt=").append(addDt);
        sb.append(", updEntKbn=").append(updEntKbn);
        sb.append(", updPgmId=").append(updPgmId);
        sb.append(", updUserId=").append(updUserId);
        sb.append(", updUserNm=").append(updUserNm);
        sb.append(", updTnmtId=").append(updTnmtId);
        sb.append(", updDt=").append(updDt);
        sb.append(", whIdFrom=").append(whIdFrom);
        sb.append(", whIdTo=").append(whIdTo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
