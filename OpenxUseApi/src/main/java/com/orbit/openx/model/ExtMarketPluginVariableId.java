package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * ExtMarketPluginVariableId generated by hbm2java
 */
public class ExtMarketPluginVariableId implements java.io.Serializable {

	private int userId;

	private String name;

	public ExtMarketPluginVariableId() {
	}

	public ExtMarketPluginVariableId(int userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ExtMarketPluginVariableId))
			return false;
		ExtMarketPluginVariableId castOther = (ExtMarketPluginVariableId) other;

		return (this.getUserId() == castOther.getUserId())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this.getName().equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
