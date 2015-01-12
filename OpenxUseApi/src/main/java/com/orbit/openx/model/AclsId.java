package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * AclsId generated by hbm2java
 */
public class AclsId implements java.io.Serializable {

	private int bannerid;

	private String logical;

	private String type;

	private String comparison;

	private String data;

	private int executionorder;

	public AclsId() {
	}

	public AclsId(int bannerid, String logical, String type, String comparison, String data, int executionorder) {
		this.bannerid = bannerid;
		this.logical = logical;
		this.type = type;
		this.comparison = comparison;
		this.data = data;
		this.executionorder = executionorder;
	}

	public int getBannerid() {
		return this.bannerid;
	}

	public void setBannerid(int bannerid) {
		this.bannerid = bannerid;
	}

	public String getLogical() {
		return this.logical;
	}

	public void setLogical(String logical) {
		this.logical = logical;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComparison() {
		return this.comparison;
	}

	public void setComparison(String comparison) {
		this.comparison = comparison;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getExecutionorder() {
		return this.executionorder;
	}

	public void setExecutionorder(int executionorder) {
		this.executionorder = executionorder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AclsId))
			return false;
		AclsId castOther = (AclsId) other;

		return (this.getBannerid() == castOther.getBannerid())
				&& ((this.getLogical() == castOther.getLogical()) || (this.getLogical() != null && castOther.getLogical() != null && this.getLogical().equals(castOther.getLogical())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null && this.getType().equals(castOther.getType())))
				&& ((this.getComparison() == castOther.getComparison()) || (this.getComparison() != null && castOther.getComparison() != null && this.getComparison().equals(castOther.getComparison())))
				&& ((this.getData() == castOther.getData()) || (this.getData() != null && castOther.getData() != null && this.getData().equals(castOther.getData())))
				&& (this.getExecutionorder() == castOther.getExecutionorder());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBannerid();
		result = 37 * result + (getLogical() == null ? 0 : this.getLogical().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + (getComparison() == null ? 0 : this.getComparison().hashCode());
		result = 37 * result + (getData() == null ? 0 : this.getData().hashCode());
		result = 37 * result + this.getExecutionorder();
		return result;
	}

}
