package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Session generated by hbm2java
 */
public class Session implements java.io.Serializable {

	private String sessionid;

	private String sessiondata;

	private Date lastused;

	public Session() {
	}

	public Session(String sessionid, String sessiondata) {
		this.sessionid = sessionid;
		this.sessiondata = sessiondata;
	}

	public Session(String sessionid, String sessiondata, Date lastused) {
		this.sessionid = sessionid;
		this.sessiondata = sessiondata;
		this.lastused = lastused;
	}

	public String getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}

	public String getSessiondata() {
		return this.sessiondata;
	}

	public void setSessiondata(String sessiondata) {
		this.sessiondata = sessiondata;
	}

	public Date getLastused() {
		return this.lastused;
	}

	public void setLastused(Date lastused) {
		this.lastused = lastused;
	}

}