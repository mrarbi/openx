package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DataSummaryZoneImpressionHistory generated by hbm2java
 */
public class DataSummaryZoneImpressionHistory implements java.io.Serializable {

	private Long dataSummaryZoneImpressionHistoryId;

	private int operationInterval;

	private int operationIntervalId;

	private Date intervalStart;

	private Date intervalEnd;

	private int zoneId;

	private Integer forecastImpressions;

	private Integer actualImpressions;

	private Short est;

	public DataSummaryZoneImpressionHistory() {
	}

	public DataSummaryZoneImpressionHistory(int operationInterval, int operationIntervalId, Date intervalStart, Date intervalEnd, int zoneId) {
		this.operationInterval = operationInterval;
		this.operationIntervalId = operationIntervalId;
		this.intervalStart = intervalStart;
		this.intervalEnd = intervalEnd;
		this.zoneId = zoneId;
	}

	public DataSummaryZoneImpressionHistory(int operationInterval, int operationIntervalId, Date intervalStart, Date intervalEnd, int zoneId, Integer forecastImpressions, Integer actualImpressions,
			Short est) {
		this.operationInterval = operationInterval;
		this.operationIntervalId = operationIntervalId;
		this.intervalStart = intervalStart;
		this.intervalEnd = intervalEnd;
		this.zoneId = zoneId;
		this.forecastImpressions = forecastImpressions;
		this.actualImpressions = actualImpressions;
		this.est = est;
	}

	public Long getDataSummaryZoneImpressionHistoryId() {
		return this.dataSummaryZoneImpressionHistoryId;
	}

	public void setDataSummaryZoneImpressionHistoryId(Long dataSummaryZoneImpressionHistoryId) {
		this.dataSummaryZoneImpressionHistoryId = dataSummaryZoneImpressionHistoryId;
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

	public int getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getForecastImpressions() {
		return this.forecastImpressions;
	}

	public void setForecastImpressions(Integer forecastImpressions) {
		this.forecastImpressions = forecastImpressions;
	}

	public Integer getActualImpressions() {
		return this.actualImpressions;
	}

	public void setActualImpressions(Integer actualImpressions) {
		this.actualImpressions = actualImpressions;
	}

	public Short getEst() {
		return this.est;
	}

	public void setEst(Short est) {
		this.est = est;
	}

}
