package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * CampaignsTrackers generated by hbm2java
 */
public class CampaignsTrackers implements java.io.Serializable {

	private Integer campaignTrackerid;

	private int campaignid;

	private int trackerid;

	private short status;

	public CampaignsTrackers() {
	}

	public CampaignsTrackers(int campaignid, int trackerid, short status) {
		this.campaignid = campaignid;
		this.trackerid = trackerid;
		this.status = status;
	}

	public Integer getCampaignTrackerid() {
		return this.campaignTrackerid;
	}

	public void setCampaignTrackerid(Integer campaignTrackerid) {
		this.campaignTrackerid = campaignTrackerid;
	}

	public int getCampaignid() {
		return this.campaignid;
	}

	public void setCampaignid(int campaignid) {
		this.campaignid = campaignid;
	}

	public int getTrackerid() {
		return this.trackerid;
	}

	public void setTrackerid(int trackerid) {
		this.trackerid = trackerid;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}