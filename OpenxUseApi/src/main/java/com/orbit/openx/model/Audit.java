package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Audit generated by hbm2java
 */
public class Audit implements java.io.Serializable {

	private Integer auditid;

	private int actionid;

	private String context;

	private Integer contextid;

	private Integer parentid;

	private String details;

	private int userid;

	private String username;

	private byte usertype;

	private Date updated;

	private int accountId;

	private Integer advertiserAccountId;

	private Integer websiteAccountId;

	public Audit() {
	}

	public Audit(int actionid, String context, String details, int userid, byte usertype, int accountId) {
		this.actionid = actionid;
		this.context = context;
		this.details = details;
		this.userid = userid;
		this.usertype = usertype;
		this.accountId = accountId;
	}

	public Audit(int actionid, String context, Integer contextid, Integer parentid, String details, int userid, String username, byte usertype, Date updated, int accountId,
			Integer advertiserAccountId, Integer websiteAccountId) {
		this.actionid = actionid;
		this.context = context;
		this.contextid = contextid;
		this.parentid = parentid;
		this.details = details;
		this.userid = userid;
		this.username = username;
		this.usertype = usertype;
		this.updated = updated;
		this.accountId = accountId;
		this.advertiserAccountId = advertiserAccountId;
		this.websiteAccountId = websiteAccountId;
	}

	public Integer getAuditid() {
		return this.auditid;
	}

	public void setAuditid(Integer auditid) {
		this.auditid = auditid;
	}

	public int getActionid() {
		return this.actionid;
	}

	public void setActionid(int actionid) {
		this.actionid = actionid;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getContextid() {
		return this.contextid;
	}

	public void setContextid(Integer contextid) {
		this.contextid = contextid;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte getUsertype() {
		return this.usertype;
	}

	public void setUsertype(byte usertype) {
		this.usertype = usertype;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Integer getAdvertiserAccountId() {
		return this.advertiserAccountId;
	}

	public void setAdvertiserAccountId(Integer advertiserAccountId) {
		this.advertiserAccountId = advertiserAccountId;
	}

	public Integer getWebsiteAccountId() {
		return this.websiteAccountId;
	}

	public void setWebsiteAccountId(Integer websiteAccountId) {
		this.websiteAccountId = websiteAccountId;
	}

}
