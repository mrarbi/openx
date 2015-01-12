package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Zones generated by hbm2java
 */
public class Zones implements java.io.Serializable {

	private Integer zoneid;

	private Integer affiliateid;

	private String zonename;

	private String description;

	private short delivery;

	private short zonetype;

	private String category;

	private short width;

	private short height;

	private String adSelection;

	private String chain;

	private String prepend;

	private String append;

	private byte appendtype;

	private String forceappend;

	private short inventoryForecastType;

	private String comments;

	private BigDecimal cost;

	private Short costType;

	private String costVariableId;

	private BigDecimal technologyCost;

	private Short technologyCostType;

	private Date updated;

	private int block;

	private int capping;

	private int sessionCapping;

	private String what;

	private Integer asZoneId;

	private boolean isInAdDirect;

	private BigDecimal rate;

	private String pricing;

	private Integer oacCategoryId;

	private String extAdselection;

	private byte showCappedNoCookie;

	public Zones() {
	}

	public Zones(String zonename, String description, short delivery, short zonetype, String category, short width, short height, String adSelection, String chain, String prepend, String append,
			byte appendtype, short inventoryForecastType, Date updated, int block, int capping, int sessionCapping, String what, boolean isInAdDirect, String pricing, byte showCappedNoCookie) {
		this.zonename = zonename;
		this.description = description;
		this.delivery = delivery;
		this.zonetype = zonetype;
		this.category = category;
		this.width = width;
		this.height = height;
		this.adSelection = adSelection;
		this.chain = chain;
		this.prepend = prepend;
		this.append = append;
		this.appendtype = appendtype;
		this.inventoryForecastType = inventoryForecastType;
		this.updated = updated;
		this.block = block;
		this.capping = capping;
		this.sessionCapping = sessionCapping;
		this.what = what;
		this.isInAdDirect = isInAdDirect;
		this.pricing = pricing;
		this.showCappedNoCookie = showCappedNoCookie;
	}

	public Zones(Integer affiliateid, String zonename, String description, short delivery, short zonetype, String category, short width, short height, String adSelection, String chain,
			String prepend, String append, byte appendtype, String forceappend, short inventoryForecastType, String comments, BigDecimal cost, Short costType, String costVariableId,
			BigDecimal technologyCost, Short technologyCostType, Date updated, int block, int capping, int sessionCapping, String what, Integer asZoneId, boolean isInAdDirect, BigDecimal rate,
			String pricing, Integer oacCategoryId, String extAdselection, byte showCappedNoCookie) {
		this.affiliateid = affiliateid;
		this.zonename = zonename;
		this.description = description;
		this.delivery = delivery;
		this.zonetype = zonetype;
		this.category = category;
		this.width = width;
		this.height = height;
		this.adSelection = adSelection;
		this.chain = chain;
		this.prepend = prepend;
		this.append = append;
		this.appendtype = appendtype;
		this.forceappend = forceappend;
		this.inventoryForecastType = inventoryForecastType;
		this.comments = comments;
		this.cost = cost;
		this.costType = costType;
		this.costVariableId = costVariableId;
		this.technologyCost = technologyCost;
		this.technologyCostType = technologyCostType;
		this.updated = updated;
		this.block = block;
		this.capping = capping;
		this.sessionCapping = sessionCapping;
		this.what = what;
		this.asZoneId = asZoneId;
		this.isInAdDirect = isInAdDirect;
		this.rate = rate;
		this.pricing = pricing;
		this.oacCategoryId = oacCategoryId;
		this.extAdselection = extAdselection;
		this.showCappedNoCookie = showCappedNoCookie;
	}

	public Integer getZoneid() {
		return this.zoneid;
	}

	public void setZoneid(Integer zoneid) {
		this.zoneid = zoneid;
	}

	public Integer getAffiliateid() {
		return this.affiliateid;
	}

	public void setAffiliateid(Integer affiliateid) {
		this.affiliateid = affiliateid;
	}

	public String getZonename() {
		return this.zonename;
	}

	public void setZonename(String zonename) {
		this.zonename = zonename;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getDelivery() {
		return this.delivery;
	}

	public void setDelivery(short delivery) {
		this.delivery = delivery;
	}

	public short getZonetype() {
		return this.zonetype;
	}

	public void setZonetype(short zonetype) {
		this.zonetype = zonetype;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public short getWidth() {
		return this.width;
	}

	public void setWidth(short width) {
		this.width = width;
	}

	public short getHeight() {
		return this.height;
	}

	public void setHeight(short height) {
		this.height = height;
	}

	public String getAdSelection() {
		return this.adSelection;
	}

	public void setAdSelection(String adSelection) {
		this.adSelection = adSelection;
	}

	public String getChain() {
		return this.chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getPrepend() {
		return this.prepend;
	}

	public void setPrepend(String prepend) {
		this.prepend = prepend;
	}

	public String getAppend() {
		return this.append;
	}

	public void setAppend(String append) {
		this.append = append;
	}

	public byte getAppendtype() {
		return this.appendtype;
	}

	public void setAppendtype(byte appendtype) {
		this.appendtype = appendtype;
	}

	public String getForceappend() {
		return this.forceappend;
	}

	public void setForceappend(String forceappend) {
		this.forceappend = forceappend;
	}

	public short getInventoryForecastType() {
		return this.inventoryForecastType;
	}

	public void setInventoryForecastType(short inventoryForecastType) {
		this.inventoryForecastType = inventoryForecastType;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Short getCostType() {
		return this.costType;
	}

	public void setCostType(Short costType) {
		this.costType = costType;
	}

	public String getCostVariableId() {
		return this.costVariableId;
	}

	public void setCostVariableId(String costVariableId) {
		this.costVariableId = costVariableId;
	}

	public BigDecimal getTechnologyCost() {
		return this.technologyCost;
	}

	public void setTechnologyCost(BigDecimal technologyCost) {
		this.technologyCost = technologyCost;
	}

	public Short getTechnologyCostType() {
		return this.technologyCostType;
	}

	public void setTechnologyCostType(Short technologyCostType) {
		this.technologyCostType = technologyCostType;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getBlock() {
		return this.block;
	}

	public void setBlock(int block) {
		this.block = block;
	}

	public int getCapping() {
		return this.capping;
	}

	public void setCapping(int capping) {
		this.capping = capping;
	}

	public int getSessionCapping() {
		return this.sessionCapping;
	}

	public void setSessionCapping(int sessionCapping) {
		this.sessionCapping = sessionCapping;
	}

	public String getWhat() {
		return this.what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public Integer getAsZoneId() {
		return this.asZoneId;
	}

	public void setAsZoneId(Integer asZoneId) {
		this.asZoneId = asZoneId;
	}

	public boolean isIsInAdDirect() {
		return this.isInAdDirect;
	}

	public void setIsInAdDirect(boolean isInAdDirect) {
		this.isInAdDirect = isInAdDirect;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getPricing() {
		return this.pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	public Integer getOacCategoryId() {
		return this.oacCategoryId;
	}

	public void setOacCategoryId(Integer oacCategoryId) {
		this.oacCategoryId = oacCategoryId;
	}

	public String getExtAdselection() {
		return this.extAdselection;
	}

	public void setExtAdselection(String extAdselection) {
		this.extAdselection = extAdselection;
	}

	public byte getShowCappedNoCookie() {
		return this.showCappedNoCookie;
	}

	public void setShowCappedNoCookie(byte showCappedNoCookie) {
		this.showCappedNoCookie = showCappedNoCookie;
	}

}
