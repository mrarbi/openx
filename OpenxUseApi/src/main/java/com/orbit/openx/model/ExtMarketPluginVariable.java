package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * ExtMarketPluginVariable generated by hbm2java
 */
public class ExtMarketPluginVariable implements java.io.Serializable {

	private ExtMarketPluginVariableId id;

	private String value;

	public ExtMarketPluginVariable() {
	}

	public ExtMarketPluginVariable(ExtMarketPluginVariableId id, String value) {
		this.id = id;
		this.value = value;
	}

	public ExtMarketPluginVariableId getId() {
		return this.id;
	}

	public void setId(ExtMarketPluginVariableId id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}