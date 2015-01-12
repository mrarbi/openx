package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * ExtMarketStatsId generated by hbm2java
 */
public class ExtMarketStatsId implements java.io.Serializable {

	private Date dateTime;

	private String marketAdvertiserId;

	private int websiteId;

	private short adWidth;

	private short adHeight;

	private Integer zoneId;

	private Integer adId;

	private int impressions;

	private Integer clicks;

	private Integer requests;

	private BigDecimal revenue;

	public ExtMarketStatsId() {
	}

	public ExtMarketStatsId(Date dateTime, int websiteId, short adWidth, short adHeight, int impressions, BigDecimal revenue) {
		this.dateTime = dateTime;
		this.websiteId = websiteId;
		this.adWidth = adWidth;
		this.adHeight = adHeight;
		this.impressions = impressions;
		this.revenue = revenue;
	}

	public ExtMarketStatsId(Date dateTime, String marketAdvertiserId, int websiteId, short adWidth, short adHeight, Integer zoneId, Integer adId, int impressions, Integer clicks, Integer requests,
			BigDecimal revenue) {
		this.dateTime = dateTime;
		this.marketAdvertiserId = marketAdvertiserId;
		this.websiteId = websiteId;
		this.adWidth = adWidth;
		this.adHeight = adHeight;
		this.zoneId = zoneId;
		this.adId = adId;
		this.impressions = impressions;
		this.clicks = clicks;
		this.requests = requests;
		this.revenue = revenue;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getMarketAdvertiserId() {
		return this.marketAdvertiserId;
	}

	public void setMarketAdvertiserId(String marketAdvertiserId) {
		this.marketAdvertiserId = marketAdvertiserId;
	}

	public int getWebsiteId() {
		return this.websiteId;
	}

	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}

	public short getAdWidth() {
		return this.adWidth;
	}

	public void setAdWidth(short adWidth) {
		this.adWidth = adWidth;
	}

	public short getAdHeight() {
		return this.adHeight;
	}

	public void setAdHeight(short adHeight) {
		this.adHeight = adHeight;
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getAdId() {
		return this.adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public int getImpressions() {
		return this.impressions;
	}

	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public Integer getClicks() {
		return this.clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getRequests() {
		return this.requests;
	}

	public void setRequests(Integer requests) {
		this.requests = requests;
	}

	public BigDecimal getRevenue() {
		return this.revenue;
	}

	public void setRevenue(BigDecimal revenue) {
		this.revenue = revenue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExtMarketStatsId))
			return false;
		ExtMarketStatsId castOther = (ExtMarketStatsId) other;

		return ((this.getDateTime() == castOther.getDateTime()) || (this.getDateTime() != null && castOther.getDateTime() != null && this.getDateTime().equals(castOther.getDateTime())))
				&& ((this.getMarketAdvertiserId() == castOther.getMarketAdvertiserId()) || (this.getMarketAdvertiserId() != null && castOther.getMarketAdvertiserId() != null && this
						.getMarketAdvertiserId().equals(castOther.getMarketAdvertiserId()))) && (this.getWebsiteId() == castOther.getWebsiteId()) && (this.getAdWidth() == castOther.getAdWidth())
				&& (this.getAdHeight() == castOther.getAdHeight())
				&& ((this.getZoneId() == castOther.getZoneId()) || (this.getZoneId() != null && castOther.getZoneId() != null && this.getZoneId().equals(castOther.getZoneId())))
				&& ((this.getAdId() == castOther.getAdId()) || (this.getAdId() != null && castOther.getAdId() != null && this.getAdId().equals(castOther.getAdId())))
				&& (this.getImpressions() == castOther.getImpressions())
				&& ((this.getClicks() == castOther.getClicks()) || (this.getClicks() != null && castOther.getClicks() != null && this.getClicks().equals(castOther.getClicks())))
				&& ((this.getRequests() == castOther.getRequests()) || (this.getRequests() != null && castOther.getRequests() != null && this.getRequests().equals(castOther.getRequests())))
				&& ((this.getRevenue() == castOther.getRevenue()) || (this.getRevenue() != null && castOther.getRevenue() != null && this.getRevenue().equals(castOther.getRevenue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDateTime() == null ? 0 : this.getDateTime().hashCode());
		result = 37 * result + (getMarketAdvertiserId() == null ? 0 : this.getMarketAdvertiserId().hashCode());
		result = 37 * result + this.getWebsiteId();
		result = 37 * result + this.getAdWidth();
		result = 37 * result + this.getAdHeight();
		result = 37 * result + (getZoneId() == null ? 0 : this.getZoneId().hashCode());
		result = 37 * result + (getAdId() == null ? 0 : this.getAdId().hashCode());
		result = 37 * result + this.getImpressions();
		result = 37 * result + (getClicks() == null ? 0 : this.getClicks().hashCode());
		result = 37 * result + (getRequests() == null ? 0 : this.getRequests().hashCode());
		result = 37 * result + (getRevenue() == null ? 0 : this.getRevenue().hashCode());
		return result;
	}

}