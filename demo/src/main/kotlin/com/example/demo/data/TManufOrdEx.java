package com.example.demo.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 生产订单一览
 *
 */
public class TManufOrdEx extends TManufOrd {
    private static final long serialVersionUID = 1L;

    private String manufTypeNm;

    private String manufClsNm;

    private String customerNm;

    private String prodNm;

    private String unitNm;

    private String sellOrdContractCd;

    private Date takingDt;

    private  Date startDate;

    private  Date endDate;

    private  Date enterVatOrdDate;
    //wpf使用字段 end

    private String sellConLineNo;

    private BigDecimal kgs;

    private String whCntrCd;

    private String whId;

    private String whNm;

    private BigDecimal stockNwe;

    private String sellOrdCd;

    private String colorSystemNm;

    private Integer manufProcessFlg;

    private String sectionCd;

    private String cusProdNm;

    private String cusColorCd;

    private String cusColorDiff;

    private String urgentFlgNm;

    private String planClsNm;

    private String colorClsNm;

    private String workClsNm;

    private String ordTypeNm;

    private String machineCd;

    private String lot2;

    private String stkClsSub;

    private String manufProcess;

    private String prodNmYarn;
    //成品数量
    private BigDecimal diffNwe;
    //已出库成品数量
    private BigDecimal sumNweIss;
    //未出库成品数量
    private BigDecimal unShipQty;
    //销售员
    private String  follower;
    //销售员Id
    private String  followerId;
    //销售员名称
    private String  followerNm;
    //交货地址
    private String  addr;
    private String prodRemarks;
    //新缸号
    private String newBatchNo;

    //码单总数量
    private BigDecimal totalQty;
    //码单总毛重
    private BigDecimal totalGweight;
    //码单总净重
    private BigDecimal totalNweight;
    // add by xhs 2020-06-10 start
    private String takingDtFrom;
    // 2020/06/16 【改动点160】 By wkl INS S
    //head备注
    private String headRemark;
    //包装要求1
    private String packing;
    //行备注
    private String lineRemark;
    // 2020/06/16 【改动点160】 By wkl INS E

    //计划留言调度内容
    private String planContent;
    //订单总数量
    private BigDecimal sumKgs;
    //码单总净重TOTAL_WEIGHT_IN
    private BigDecimal sumWeight;
    //机台号日内排序拼接用
    private String machineAndSort;

    // 生产订单Id
    private String manufOrdId;
    // 打样执行状态
    private String proofingCls;
    //wkl add 7/22 新增中心编号为了权限验证
    private String newCntrCd;

    //wkl add 8/13 新增交期明细行号
    private String lineNo;

    /**
     * add by xhs 2020-08-18 start 改动点 236
     * 原料类型code
     */
    private String rawType;

    /**
     *  add by xhs 2020-09-16 start 改动点 276
     * 单价 PRICE
     */
    private BigDecimal price;

    /**
     *  add by xhs 2020-09-16 start 改动点 276
     * 总价 ALL_PRICE
     */
    private BigDecimal allPrice;

    private String assetModel;

    private String actualDate;

    private String batchNoParallelCylinder;

    private BigDecimal subActQty;

    private BigDecimal subOrdQty;

    private String egCustomerNm;

    private String egYarnNm;

    private String egColor;

    private String dailyPlan;

    // add wkl 2021/12/2补足生产绑定销售表的字段的空值 start
    private String   cusContractCd;

    private String   saleType;

    private String  saleUserId;

    private String  shipType;

    private String   deliveryAddr;

    //包装要求2
    private String packing2;

    private String saleIntentionId;
    private String saleIntentionLineId;
    private String qa;
    private String dyeingLoss;
    private String transExpenses;
    private String balanceDate;
    private String deadline;
    private String others;
    private String intentionCustomerId;
    private String saleKbn;
    //申请部门
    private String applyOrdId;
    //出货方式名称
    private String shipTypeNm;
    //
    private String cntrId;
    private String oldSaleOrdCd;
    private String oldSaleOrdId;
    private String oldSaleOrdLineId;
    private String oldSaleOrdLineCd;
    private Date deliveryDt;
    private String colorDiff;
    private BigDecimal ordQty;
    private String colorSampleCls;
    private String purpose;
    private String workUserId;
    private String orgId;
    private String tel;
    private String fax;
    private String saleOrdId;
    private String packing1;

    private String totalPrice;
    private String signAddress;
    private String dyeType;

    private String saleOrdLineId;

    private String seasonNm;

    private String orderBatch;

    private String saleOrdCd;
    // add wkl 2021/12/2补足生产绑定销售表的字段的空值 end


    //add wkl 2022/4/14 新增并线编号
    private String parallelNum;

    //2022/06/17 上线问题30 从意向到计划，加一个最终买家客户 By wkl ADD S-->
    /** 最终买家客户*/
    private String  finalBuyerId;

    //2022/07/07 物流计划新增联系人名称，联系人电话 By wkl ADD S-->
    //联系人名称
    private String contactsNm;
    //联系人电话
    private String contactsTel;
    //入库日期
    private String  rcvDt;
    //看板区分
    private String  billboardKbn;
    //看板区分名称
    private String billboardKbnNm;

    private String numberOfTanks;



    /**  禁荧光区分（0,1）*/
    private String isFluor;
    /**  头缸确认区分（0,1）*/
    private String headCylConfirm;
    /** 寄样区分*/
    private String postSample;

    //add wkl 2023/02/14 新增 生产作业内容,生产作业内容code start
    private String workContent;
    private String workContentCode;
    //add wkl 2023/02/14 新增 生产作业内容,生产作业内容code end

    //add wkl 2023/04/03 新增 旧缸号 start
    private String oldBatchNo;
    private Integer repairTimes;
    //add wkl 2023/04/03 新增 旧缸号 end


    private String  saleOrdLineCd;

    /**
     * 品番
     */
    private String prodNum;

    private String planRemark;

    private String hostBatchNo;

    private String  concatSort;

    private String  mainBatchNoFlg;

    public String getMainBatchNoFlg() {
        return mainBatchNoFlg;
    }

    public void setMainBatchNoFlg(String mainBatchNoFlg) {
        this.mainBatchNoFlg = mainBatchNoFlg;
    }

    public String getConcatSort() {
        return concatSort;
    }

    public void setConcatSort(String concatSort) {
        this.concatSort = concatSort;
    }

    public String getHostBatchNo() {
        return hostBatchNo;
    }

    public void setHostBatchNo(String hostBatchNo) {
        this.hostBatchNo = hostBatchNo;
    }

    public String getPlanRemark() {
        return planRemark;
    }

    public void setPlanRemark(String planRemark) {
        this.planRemark = planRemark;
    }

    public String getProdNum() {
        return prodNum;
    }

    public void setProdNum(String prodNum) {
        this.prodNum = prodNum;
    }

    public String getSaleOrdLineCd() {
        return saleOrdLineCd;
    }

    public void setSaleOrdLineCd(String saleOrdLineCd) {
        this.saleOrdLineCd = saleOrdLineCd;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSignAddress() {
        return signAddress;
    }

    public void setSignAddress(String signAddress) {
        this.signAddress = signAddress;
    }

    public String getDyeType() {
        return dyeType;
    }

    public void setDyeType(String dyeType) {
        this.dyeType = dyeType;
    }

    public Integer getRepairTimes() {
        return repairTimes;
    }

    public void setRepairTimes(Integer repairTimes) {
        this.repairTimes = repairTimes;
    }

    public String getOldBatchNo() {
        return oldBatchNo;
    }

    public void setOldBatchNo(String oldBatchNo) {
        this.oldBatchNo = oldBatchNo;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getWorkContentCode() {
        return workContentCode;
    }

    public void setWorkContentCode(String workContentCode) {
        this.workContentCode = workContentCode;
    }

    public String getBillboardKbnNm() {
        return billboardKbnNm;
    }

    public void setBillboardKbnNm(String billboardKbnNm) {
        this.billboardKbnNm = billboardKbnNm;
    }

    public String getIsFluor() {
        return isFluor;
    }

    public void setIsFluor(String isFluor) {
        this.isFluor = isFluor;
    }

    public String getHeadCylConfirm() {
        return headCylConfirm;
    }

    public void setHeadCylConfirm(String headCylConfirm) {
        this.headCylConfirm = headCylConfirm;
    }

    public String getPostSample() {
        return postSample;
    }

    public void setPostSample(String postSample) {
        this.postSample = postSample;
    }

    public String getNumberOfTanks() {
        return numberOfTanks;
    }

    public TManufOrdEx setNumberOfTanks(String numberOfTanks) {
        this.numberOfTanks = numberOfTanks;
        return this;
    }

    public String getBillboardKbn() {
        return billboardKbn;
    }

    public void setBillboardKbn(String billboardKbn) {
        this.billboardKbn = billboardKbn;
    }

    public String getRcvDt() {
        return rcvDt;
    }

    public void setRcvDt(String rcvDt) {
        this.rcvDt = rcvDt;
    }

    public String getContactsNm() {
        return contactsNm;
    }

    public void setContactsNm(String contactsNm) {
        this.contactsNm = contactsNm;
    }

    public String getContactsTel() {
        return contactsTel;
    }

    public void setContactsTel(String contactsTel) {
        this.contactsTel = contactsTel;
    }

    public String getFinalBuyerId() {
        return finalBuyerId;
    }

    public void setFinalBuyerId(String finalBuyerId) {
        this.finalBuyerId = finalBuyerId;
    }

    public String getParallelNum() {
        return parallelNum;
    }

    public void setParallelNum(String parallelNum) {
        this.parallelNum = parallelNum;
    }

    public String getSaleOrdCd() {
        return saleOrdCd;
    }

    public void setSaleOrdCd(String saleOrdCd) {
        this.saleOrdCd = saleOrdCd;
    }

    public String getSeasonNm() {
        return seasonNm;
    }

    public void setSeasonNm(String seasonNm) {
        this.seasonNm = seasonNm;
    }

    public String getOrderBatch() {
        return orderBatch;
    }

    public void setOrderBatch(String orderBatch) {
        this.orderBatch = orderBatch;
    }

    public String getSaleOrdLineId() {
        return saleOrdLineId;
    }

    public void setSaleOrdLineId(String saleOrdLineId) {
        this.saleOrdLineId = saleOrdLineId;
    }

    public String getPacking1() {
        return packing1;
    }

    public void setPacking1(String packing1) {
        this.packing1 = packing1;
    }

    public String getSaleOrdId() {
        return saleOrdId;
    }

    public void setSaleOrdId(String saleOrdId) {
        this.saleOrdId = saleOrdId;
    }

    public String getWorkUserId() {
        return workUserId;
    }

    public void setWorkUserId(String workUserId) {
        this.workUserId = workUserId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCntrId() {
        return cntrId;
    }

    public void setCntrId(String cntrId) {
        this.cntrId = cntrId;
    }

    public String getOldSaleOrdCd() {
        return oldSaleOrdCd;
    }

    public void setOldSaleOrdCd(String oldSaleOrdCd) {
        this.oldSaleOrdCd = oldSaleOrdCd;
    }

    public String getOldSaleOrdId() {
        return oldSaleOrdId;
    }

    public void setOldSaleOrdId(String oldSaleOrdId) {
        this.oldSaleOrdId = oldSaleOrdId;
    }

    public String getOldSaleOrdLineId() {
        return oldSaleOrdLineId;
    }

    public void setOldSaleOrdLineId(String oldSaleOrdLineId) {
        this.oldSaleOrdLineId = oldSaleOrdLineId;
    }

    public String getOldSaleOrdLineCd() {
        return oldSaleOrdLineCd;
    }

    public void setOldSaleOrdLineCd(String oldSaleOrdLineCd) {
        this.oldSaleOrdLineCd = oldSaleOrdLineCd;
    }


    public Date getDeliveryDt() {
        return deliveryDt;
    }

    public void setDeliveryDt(Date deliveryDt) {
        this.deliveryDt = deliveryDt;
    }

    public String getColorDiff() {
        return colorDiff;
    }

    public void setColorDiff(String colorDiff) {
        this.colorDiff = colorDiff;
    }

    public BigDecimal getOrdQty() {
        return ordQty;
    }

    public void setOrdQty(BigDecimal ordQty) {
        this.ordQty = ordQty;
    }

    public String getColorSampleCls() {
        return colorSampleCls;
    }

    public void setColorSampleCls(String colorSampleCls) {
        this.colorSampleCls = colorSampleCls;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getShipTypeNm() {
        return shipTypeNm;
    }

    public void setShipTypeNm(String shipTypeNm) {
        this.shipTypeNm = shipTypeNm;
    }

    public String getApplyOrdId() {
        return applyOrdId;
    }

    public void setApplyOrdId(String applyOrdId) {
        this.applyOrdId = applyOrdId;
    }

    public String getIntentionCustomerId() {
        return intentionCustomerId;
    }

    public void setIntentionCustomerId(String intentionCustomerId) {
        this.intentionCustomerId = intentionCustomerId;
    }

    public String getSaleKbn() {
        return saleKbn;
    }

    public void setSaleKbn(String saleKbn) {
        this.saleKbn = saleKbn;
    }

    public String getPacking2() {
        return packing2;
    }

    public void setPacking2(String packing2) {
        this.packing2 = packing2;
    }

    public String getSaleIntentionId() {
        return saleIntentionId;
    }

    public void setSaleIntentionId(String saleIntentionId) {
        this.saleIntentionId = saleIntentionId;
    }

    public String getSaleIntentionLineId() {
        return saleIntentionLineId;
    }

    public void setSaleIntentionLineId(String saleIntentionLineId) {
        this.saleIntentionLineId = saleIntentionLineId;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getDyeingLoss() {
        return dyeingLoss;
    }

    public void setDyeingLoss(String dyeingLoss) {
        this.dyeingLoss = dyeingLoss;
    }

    public String getTransExpenses() {
        return transExpenses;
    }

    public void setTransExpenses(String transExpenses) {
        this.transExpenses = transExpenses;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }


    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getSaleUserId() {
        return saleUserId;
    }

    public void setSaleUserId(String saleUserId) {
        this.saleUserId = saleUserId;
    }

    public String getCusContractCd() {
        return cusContractCd;
    }

    public void setCusContractCd(String cusContractCd) {
        this.cusContractCd = cusContractCd;
    }

    public String getDailyPlan() {
        return dailyPlan;
    }

    public void setDailyPlan(String dailyPlan) {
        this.dailyPlan = dailyPlan;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public String getNewCntrCd() {
        return newCntrCd;
    }

    public void setNewCntrCd(String newCntrCd) {
        this.newCntrCd = newCntrCd;
    }

    public String getMachineAndSort() {
        return machineAndSort;
    }

    public void setMachineAndSort(String machineAndSort) {
        this.machineAndSort = machineAndSort;
    }

    public BigDecimal getSumKgs() {
        return sumKgs;
    }

    public void setSumKgs(BigDecimal sumKgs) {
        this.sumKgs = sumKgs;
    }

    public BigDecimal getSumWeight() {
        return sumWeight;
    }

    public void setSumWeight(BigDecimal sumWeight) {
        this.sumWeight = sumWeight;
    }

    public String getHeadRemark() {
        return headRemark;
    }

    public void setHeadRemark(String headRemark) {
        this.headRemark = headRemark;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public String getLineRemark() {
        return lineRemark;
    }

    public void setLineRemark(String lineRemark) {
        this.lineRemark = lineRemark;
    }

    public String getTakingDtFrom() {
        return takingDtFrom;
    }

    public void setTakingDtFrom(String takingDtFrom) {
        this.takingDtFrom = takingDtFrom;
    }



    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public BigDecimal getTotalGweight() {
        return totalGweight;
    }

    public void setTotalGweight(BigDecimal totalGweight) {
        this.totalGweight = totalGweight;
    }

    public BigDecimal getTotalNweight() {
        return totalNweight;
    }

    public void setTotalNweight(BigDecimal totalNweight) {
        this.totalNweight = totalNweight;
    }

    public String getNewBatchNo() {
        return newBatchNo;
    }

    public void setNewBatchNo(String newBatchNo) {
        this.newBatchNo = newBatchNo;
    }

    public String getProdRemarks() {
        return prodRemarks;
    }

    public void setProdRemarks(String prodRemarks) {
        this.prodRemarks = prodRemarks;
    }

    public BigDecimal getUnShipQty() {
        return unShipQty;
    }

    public void setUnShipQty(BigDecimal unShipQty) {
        this.unShipQty = unShipQty;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public BigDecimal getDiffNwe() {
        return diffNwe;
    }

    public void setDiffNwe(BigDecimal diffNwe) {
        this.diffNwe = diffNwe;
    }

    public BigDecimal getSumNweIss() {
        return sumNweIss;
    }

    public void setSumNweIss(BigDecimal sumNweIss) {
        this.sumNweIss = sumNweIss;
    }

    public String getProdNmYarn() {
        return prodNmYarn;
    }

    public void setProdNmYarn(String prodNmYarn) {
        this.prodNmYarn = prodNmYarn;
    }

    public String getManufTypeNm() {
        return manufTypeNm;
    }

    public void setManufTypeNm(String manufTypeNm) {
        this.manufTypeNm = manufTypeNm;
    }

    public String getManufClsNm() {
        return manufClsNm;
    }

    public void setManufClsNm(String manufClsNm) {
        this.manufClsNm = manufClsNm;
    }

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm;
    }

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getUnitNm() {
        return unitNm;
    }

    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }

    public String getSellOrdContractCd() {
        return sellOrdContractCd;
    }

    public void setSellOrdContractCd(String sellOrdContractCd) {
        this.sellOrdContractCd = sellOrdContractCd;
    }

    public Date getTakingDt() {
        return takingDt;
    }

    public void setTakingDt(Date takingDt) {
        this.takingDt = takingDt;
    }

    public String getSellConLineNo() {
        return sellConLineNo;
    }

    public void setSellConLineNo(String sellConLineNo) {
        this.sellConLineNo = sellConLineNo;
    }

    public BigDecimal getKgs() {
        return kgs;
    }

    public void setKgs(BigDecimal kgs) {
        this.kgs = kgs;
    }

    public String getWhCntrCd() {
        return whCntrCd;
    }

    public void setWhCntrCd(String whCntrCd) {
        this.whCntrCd = whCntrCd;
    }

    public String getWhId() {
        return whId;
    }

    public void setWhId(String whId) {
        this.whId = whId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEnterVatOrdDate() {
        return enterVatOrdDate;
    }

    public void setEnterVatOrdDate(Date enterVatOrdDate) {
        this.enterVatOrdDate = enterVatOrdDate;
    }


    public BigDecimal getStockNwe() {
        return stockNwe;
    }

    public void setStockNwe(BigDecimal stockNwe) {
        this.stockNwe = stockNwe;
    }

    public String getSellOrdCd() {
        return sellOrdCd;
    }

    public void setSellOrdCd(String sellOrdCd) {
        this.sellOrdCd = sellOrdCd;
    }

    public String getColorSystemNm() {
        return colorSystemNm;
    }

    public void setColorSystemNm(String colorSystemNm) {
        this.colorSystemNm = colorSystemNm;
    }

    public Integer getManufProcessFlg() {
        return manufProcessFlg;
    }

    public void setManufProcessFlg(Integer manufProcessFlg) {
        this.manufProcessFlg = manufProcessFlg;
    }

    public String getSectionCd() {
        return sectionCd;
    }

    public void setSectionCd(String sectionCd) {
        this.sectionCd = sectionCd;
    }

    public String getCusProdNm() {
        return cusProdNm;
    }

    public void setCusProdNm(String cusProdNm) {
        this.cusProdNm = cusProdNm;
    }

    public String getCusColorCd() {
        return cusColorCd;
    }

    public void setCusColorCd(String cusColorCd) {
        this.cusColorCd = cusColorCd;
    }

    public String getCusColorDiff() {
        return cusColorDiff;
    }

    public void setCusColorDiff(String cusColorDiff) {
        this.cusColorDiff = cusColorDiff;
    }

    public String getUrgentFlgNm() {
        return urgentFlgNm;
    }

    public void setUrgentFlgNm(String urgentFlgNm) {
        this.urgentFlgNm = urgentFlgNm;
    }

    public String getPlanClsNm() {
        return planClsNm;
    }

    public void setPlanClsNm(String planClsNm) {
        this.planClsNm = planClsNm;
    }

    public String getColorClsNm() {
        return colorClsNm;
    }

    public void setColorClsNm(String colorClsNm) {
        this.colorClsNm = colorClsNm;
    }

    public String getWorkClsNm() {
        return workClsNm;
    }

    public void setWorkClsNm(String workClsNm) {
        this.workClsNm = workClsNm;
    }

    public String getOrdTypeNm() {
        return ordTypeNm;
    }

    public void setOrdTypeNm(String ordTypeNm) {
        this.ordTypeNm = ordTypeNm;
    }

    public String getMachineCd() {
        return machineCd;
    }

    public void setMachineCd(String machineCd) {
        this.machineCd = machineCd;
    }

    public String getLot2() {
        return lot2;
    }

    public void setLot2(String lot2) {
        this.lot2 = lot2;
    }

    public String getStkClsSub() {
        return stkClsSub;
    }

    public void setStkClsSub(String stkClsSub) {
        this.stkClsSub = stkClsSub;
    }

    public String getManufProcess() {
        return manufProcess;
    }

    public void setManufProcess(String manufProcess) {
        this.manufProcess = manufProcess;
    }

    public String getManufOrdId() {
        return manufOrdId;
    }

    public void setManufOrdId(String manufOrdId) {
        this.manufOrdId = manufOrdId;
    }

    public String getProofingCls() {
        return proofingCls;
    }

    public void setProofingCls(String proofingCls) {
        this.proofingCls = proofingCls;
    }

    public String getRawType() {
        return rawType;
    }

    public void setRawType(String rawType) {
        this.rawType = rawType;
    }

    public String getBatchNoParallelCylinder() {
        return batchNoParallelCylinder;
    }

    public String getWhNm() {
        return whNm;
    }

    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

    public BigDecimal getSubActQty() {
        return subActQty;
    }

    public void setSubActQty(BigDecimal subActQty) {
        this.subActQty = subActQty;
    }

    public BigDecimal getSubOrdQty() {
        return subOrdQty;
    }

    public void setSubOrdQty(BigDecimal subOrdQty) {
        this.subOrdQty = subOrdQty;
    }

    public void setBatchNoParallelCylinder(String batchNoParallelCylinder) {
        this.batchNoParallelCylinder = batchNoParallelCylinder;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(BigDecimal allPrice) {
        this.allPrice = allPrice;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    public String getFollowerNm() {
        return followerNm;
    }

    public void setFollowerNm(String followerNm) {
        this.followerNm = followerNm;
    }

    public String getEgCustomerNm() {
        return egCustomerNm;
    }

    public void setEgCustomerNm(String egCustomerNm) {
        this.egCustomerNm = egCustomerNm;
    }

    public String getEgYarnNm() {
        return egYarnNm;
    }

    public void setEgYarnNm(String egYarnNm) {
        this.egYarnNm = egYarnNm;
    }

    public String getEgColor() {
        return egColor;
    }

    public void setEgColor(String egColor) {
        this.egColor = egColor;
    }
}
