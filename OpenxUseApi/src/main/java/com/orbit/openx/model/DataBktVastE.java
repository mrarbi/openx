package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * DataBktVastE generated by hbm2java
 */
public class DataBktVastE implements java.io.Serializable {

	private DataBktVastEId id;

	private int count;

	public DataBktVastE() {
	}

	public DataBktVastE(DataBktVastEId id, int count) {
		this.id = id;
		this.count = count;
	}

	public DataBktVastEId getId() {
		return this.id;
	}

	public void setId(DataBktVastEId id) {
		this.id = id;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}