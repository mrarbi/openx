package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * Accounts generated by hbm2java
 */
public class Accounts implements java.io.Serializable {

	private Integer accountId;

	private String accountType;

	private String accountName;

	private String m2mPassword;

	private String m2mTicket;

	public Accounts() {
	}

	public Accounts(String accountType) {
		this.accountType = accountType;
	}

	public Accounts(String accountType, String accountName, String m2mPassword, String m2mTicket) {
		this.accountType = accountType;
		this.accountName = accountName;
		this.m2mPassword = m2mPassword;
		this.m2mTicket = m2mTicket;
	}

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getM2mPassword() {
		return this.m2mPassword;
	}

	public void setM2mPassword(String m2mPassword) {
		this.m2mPassword = m2mPassword;
	}

	public String getM2mTicket() {
		return this.m2mTicket;
	}

	public void setM2mTicket(String m2mTicket) {
		this.m2mTicket = m2mTicket;
	}

}
