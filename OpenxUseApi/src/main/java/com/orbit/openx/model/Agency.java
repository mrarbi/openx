package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Agency generated by hbm2java
 */
public class Agency implements java.io.Serializable {

	private Integer agencyid;

	private String name;

	private String contact;

	private String email;

	private String logoutUrl;

	private Short active;

	private Date updated;

	private Integer accountId;

	public Agency() {
	}

	public Agency(String name, String email, Date updated) {
		this.name = name;
		this.email = email;
		this.updated = updated;
	}

	public Agency(String name, String contact, String email, String logoutUrl, Short active, Date updated, Integer accountId) {
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.logoutUrl = logoutUrl;
		this.active = active;
		this.updated = updated;
		this.accountId = accountId;
	}

	public Integer getAgencyid() {
		return this.agencyid;
	}

	public void setAgencyid(Integer agencyid) {
		this.agencyid = agencyid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogoutUrl() {
		return this.logoutUrl;
	}

	public void setLogoutUrl(String logoutUrl) {
		this.logoutUrl = logoutUrl;
	}

	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

}
