package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * Preferences generated by hbm2java
 */
public class Preferences implements java.io.Serializable {

	private Integer preferenceId;

	private String preferenceName;

	private String accountType;

	public Preferences() {
	}

	public Preferences(String preferenceName, String accountType) {
		this.preferenceName = preferenceName;
		this.accountType = accountType;
	}

	public Integer getPreferenceId() {
		return this.preferenceId;
	}

	public void setPreferenceId(Integer preferenceId) {
		this.preferenceId = preferenceId;
	}

	public String getPreferenceName() {
		return this.preferenceName;
	}

	public void setPreferenceName(String preferenceName) {
		this.preferenceName = preferenceName;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
