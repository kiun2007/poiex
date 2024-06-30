package com.example.demo.data;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 * @author lixy
 */
public class CoatingReportResponse {

    private String bizDateT;

    private String shiftT;

    private String lotNumY;

    private String supplierName;

    private Float materialYSpc;

    private Float materialYWidth;

    private Float materialYLength;

    private Float outNumber;

    private String lotNumT;

    private String productInfoT;

    private Float materialTWidth;

    private Float materialTLength;

    private Float inNumber;

    private Integer connector;

    private Float lossT;

    private Float lossPercentageT;

    private String bizDateF;

    private String shiftF;

    private String lotNumF;

    private String productInfoF;

    private String materialFWidth;

	public String getCutWidth(){
		return formatDecimal(materialFWidth);
	}

	private String realLength;

    private String materialFLength;

	public String getCutLength(){
		return formatDecimal(materialFLength);
	}

	public Double excelCutLength(){
		return materialFLength == null ? null : Double.parseDouble(materialFLength);
	}

	public String getRealLength() {
		return realLength!=null?realLength:materialFLength;
	}

    private String inNumberF;

    private String connectorF;

	public Integer getCutConnector(){
		return connectorF == null ? 0 : (connectorF.contains("\r\n") ? 0: Integer.parseInt(connectorF));
	}

    private Float lossF;

    private Float lossPercentageF;

    private Float lossPercentageTotal;

	private Float pieceQtyRcvOrd = 20f;

	private String formatDecimal(String source){
		if (source != null && source.contains("\r\n")){
			return source;
		}
		BigDecimal decimal = source == null ? BigDecimal.ZERO : new BigDecimal(source);
		DecimalFormat format = new DecimalFormat("#.##");
		return format.format(decimal);
	}

	/**
	 * 合并单元格
	 */
	private Integer margeCount = 1;

	/**
	 * 飞边
	 * @return
	 */
	public BigDecimal getLostWidth(){
		if (materialTWidth == null){
			materialTWidth = 0f;
		}
		return BigDecimal.valueOf(materialTWidth).subtract(new BigDecimal(countOutWidth==null?"0":countOutWidth));
	}

	private String countOutWidth;

	public LocalDate getCoatingDate(){
		return LocalDate.parse(bizDateT);
	}

	public LocalDate getCuttingDate(){
		if (bizDateF.contains("\r\n")){
			return null;
		}
		return LocalDate.parse(bizDateF);
	}

	public Double cuttingLength(){
		if (getRealLength() == null) return 0.0;
		return Double.parseDouble(getRealLength());
	}

	public Double cuttingWidth(){
		return Double.parseDouble(getCutLength());
	}

	public String getBizDateT() {
		return bizDateT;
	}

	public void setBizDateT(String bizDateT) {
		this.bizDateT = bizDateT;
	}

	public String getShiftT() {
		return shiftT;
	}

	public void setShiftT(String shiftT) {
		this.shiftT = shiftT;
	}

	public String getLotNumY() {
		return lotNumY;
	}

	public void setLotNumY(String lotNumY) {
		this.lotNumY = lotNumY;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Float getMaterialYSpc() {
		return materialYSpc;
	}

	public void setMaterialYSpc(Float materialYSpc) {
		this.materialYSpc = materialYSpc;
	}

	public Float getMaterialYWidth() {
		return materialYWidth;
	}

	public void setMaterialYWidth(Float materialYWidth) {
		this.materialYWidth = materialYWidth;
	}

	public Float getMaterialYLength() {
		return materialYLength;
	}

	public void setMaterialYLength(Float materialYLength) {
		this.materialYLength = materialYLength;
	}

	public Float getOutNumber() {
		return outNumber;
	}

	public void setOutNumber(Float outNumber) {
		this.outNumber = outNumber;
	}

	public String getLotNumT() {
		return lotNumT;
	}

	public void setLotNumT(String lotNumT) {
		this.lotNumT = lotNumT;
	}

	public String getProductInfoT() {
		return productInfoT;
	}

	public void setProductInfoT(String productInfoT) {
		this.productInfoT = productInfoT;
	}

	public Float getMaterialTWidth() {
		return materialTWidth;
	}

	public void setMaterialTWidth(Float materialTWidth) {
		this.materialTWidth = materialTWidth;
	}

	public Float getMaterialTLength() {
		return materialTLength;
	}

	public void setMaterialTLength(Float materialTLength) {
		this.materialTLength = materialTLength;
	}

	public Float getInNumber() {
		return inNumber;
	}

	public void setInNumber(Float inNumber) {
		this.inNumber = inNumber;
	}

	public Integer getConnector() {
		return connector;
	}

	public void setConnector(Integer connector) {
		this.connector = connector;
	}

	public Float getLossT() {
		return lossT;
	}

	public void setLossT(Float lossT) {
		this.lossT = lossT;
	}

	public Float getLossPercentageT() {
		return lossPercentageT;
	}

	public void setLossPercentageT(Float lossPercentageT) {
		this.lossPercentageT = lossPercentageT;
	}

	public String getBizDateF() {
		return bizDateF;
	}

	public void setBizDateF(String bizDateF) {
		this.bizDateF = bizDateF;
	}

	public String getShiftF() {
		return shiftF;
	}

	public void setShiftF(String shiftF) {
		this.shiftF = shiftF;
	}

	public String getLotNumF() {
		return lotNumF;
	}

	public void setLotNumF(String lotNumF) {
		this.lotNumF = lotNumF;
	}

	public String getProductInfoF() {
		return productInfoF;
	}

	public void setProductInfoF(String productInfoF) {
		this.productInfoF = productInfoF;
	}

	public String getMaterialFWidth() {
		return materialFWidth;
	}

	public void setMaterialFWidth(String materialFWidth) {
		this.materialFWidth = materialFWidth;
	}

	public void setRealLength(String realLength) {
		this.realLength = realLength;
	}

	public String getMaterialFLength() {
		return materialFLength;
	}

	public void setMaterialFLength(String materialFLength) {
		this.materialFLength = materialFLength;
	}

	public String getInNumberF() {
		return inNumberF;
	}

	public void setInNumberF(String inNumberF) {
		this.inNumberF = inNumberF;
	}

	public String getConnectorF() {
		return connectorF;
	}

	public void setConnectorF(String connectorF) {
		this.connectorF = connectorF;
	}

	public Float getLossF() {
		return lossF;
	}

	public void setLossF(Float lossF) {
		this.lossF = lossF;
	}

	public Float getLossPercentageF() {
		return lossPercentageF;
	}

	public void setLossPercentageF(Float lossPercentageF) {
		this.lossPercentageF = lossPercentageF;
	}

	public Float getLossPercentageTotal() {
		return lossPercentageTotal;
	}

	public void setLossPercentageTotal(Float lossPercentageTotal) {
		this.lossPercentageTotal = lossPercentageTotal;
	}

	public Integer getMargeCount() {
		return margeCount;
	}

	public void setMargeCount(Integer margeCount) {
		this.margeCount = margeCount;
	}

	public String getCountOutWidth() {
		return countOutWidth;
	}

	public void setCountOutWidth(String countOutWidth) {
		this.countOutWidth = countOutWidth;
	}

	public Float getPieceQtyRcvOrd() {
		return pieceQtyRcvOrd;
	}

	public void setPieceQtyRcvOrd(Float pieceQtyRcvOrd) {
		this.pieceQtyRcvOrd = pieceQtyRcvOrd;
	}
}
