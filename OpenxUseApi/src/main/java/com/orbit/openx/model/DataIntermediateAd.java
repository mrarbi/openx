package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * DataIntermediateAd generated by hbm2java
 */
public class DataIntermediateAd implements java.io.Serializable {

	private Long dataIntermediateAdId;

	private Date dateTime;

	private int operationInterval;

	private int operationIntervalId;

	private Date intervalStart;

	private Date intervalEnd;

	private int adId;

	private int creativeId;

	private int zoneId;

	private int requests;

	private int impressions;

	private int clicks;

	private int conversions;

	private BigDecimal totalBasketValue;

	private int totalNumItems;

	private Date updated;

	public DataIntermediateAd() {
	}

	public DataIntermediateAd(Date dateTime, int operationInterval, int operationIntervalId, Date intervalStart, Date intervalEnd, int adId, int creativeId, int zoneId, int requests,
			int impressions, int clicks, int conversions, BigDecimal totalBasketValue, int totalNumItems, Date updated) {
		this.dateTime = dateTime;
		this.operationInterval = operationInterval;
		this.operationIntervalId = operationIntervalId;
		this.intervalStart = intervalStart;
		this.intervalEnd = intervalEnd;
		this.adId = adId;
		this.creativeId = creativeId;
		this.zoneId = zoneId;
		this.requests = requests;
		this.impressions = impressions;
		this.clicks = clicks;
		this.conversions = conversions;
		this.totalBasketValue = totalBasketValue;
		this.totalNumItems = totalNumItems;
		this.updated = updated;
	}

	public Long getDataIntermediateAdId() {
		return this.dataIntermediateAdId;
	}

	public void setDataIntermediateAdId(Long dataIntermediateAdId) {
		this.dataIntermediateAdId = dataIntermediateAdId;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getOperationInterval() {
		return this.operationInterval;
	}

	public void setOperationInterval(int operationInterval) {
		this.operationInterval = operationInterval;
	}

	public int getOperationIntervalId() {
		return this.operationIntervalId;
	}

	public void setOperationIntervalId(int operationIntervalId) {
		this.operationIntervalId = operationIntervalId;
	}

	public Date getIntervalStart() {
		return this.intervalStart;
	}

	public void setIntervalStart(Date intervalStart) {
		this.intervalStart = intervalStart;
	}

	public Date getIntervalEnd() {
		return this.intervalEnd;
	}

	public void setIntervalEnd(Date intervalEnd) {
		this.intervalEnd = intervalEnd;
	}

	public int getAdId() {
		return this.adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public int getCreativeId() {
		return this.creativeId;
	}

	public void setCreativeId(int creativeId) {
		this.creativeId = creativeId;
	}

	public int getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public int getRequests() {
		return this.requests;
	}

	public void setRequests(int requests) {
		this.requests = requests;
	}

	public int getImpressions() {
		return this.impressions;
	}

	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public int getClicks() {
		return this.clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public int getConversions() {
		return this.conversions;
	}

	public void setConversions(int conversions) {
		this.conversions = conversions;
	}

	public BigDecimal getTotalBasketValue() {
		return this.totalBasketValue;
	}

	public void setTotalBasketValue(BigDecimal totalBasketValue) {
		this.totalBasketValue = totalBasketValue;
	}

	public int getTotalNumItems() {
		return this.totalNumItems;
	}

	public void setTotalNumItems(int totalNumItems) {
		this.totalNumItems = totalNumItems;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

}
