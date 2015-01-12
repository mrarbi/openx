package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * ExtMarketAssocData generated by hbm2java
 */
public class ExtMarketAssocData implements java.io.Serializable {

	private int accountId;

	private String publisherAccountId;

	private byte status;

	private String apiKey;

	public ExtMarketAssocData() {
	}

	public ExtMarketAssocData(int accountId, String publisherAccountId, byte status) {
		this.accountId = accountId;
		this.publisherAccountId = publisherAccountId;
		this.status = status;
	}

	public ExtMarketAssocData(int accountId, String publisherAccountId, byte status, String apiKey) {
		this.accountId = accountId;
		this.publisherAccountId = publisherAccountId;
		this.status = status;
		this.apiKey = apiKey;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getPublisherAccountId() {
		return this.publisherAccountId;
	}

	public void setPublisherAccountId(String publisherAccountId) {
		this.publisherAccountId = publisherAccountId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getApiKey() {
		return this.apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}
