package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * DataBktAVarId generated by hbm2java
 */
public class DataBktAVarId implements java.io.Serializable {

	private long serverConvId;

	private String serverIp;

	private int trackerVariableId;

	public DataBktAVarId() {
	}

	public DataBktAVarId(long serverConvId, String serverIp, int trackerVariableId) {
		this.serverConvId = serverConvId;
		this.serverIp = serverIp;
		this.trackerVariableId = trackerVariableId;
	}

	public long getServerConvId() {
		return this.serverConvId;
	}

	public void setServerConvId(long serverConvId) {
		this.serverConvId = serverConvId;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public int getTrackerVariableId() {
		return this.trackerVariableId;
	}

	public void setTrackerVariableId(int trackerVariableId) {
		this.trackerVariableId = trackerVariableId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DataBktAVarId))
			return false;
		DataBktAVarId castOther = (DataBktAVarId) other;

		return (this.getServerConvId() == castOther.getServerConvId())
				&& ((this.getServerIp() == castOther.getServerIp()) || (this.getServerIp() != null && castOther.getServerIp() != null && this.getServerIp().equals(castOther.getServerIp())))
				&& (this.getTrackerVariableId() == castOther.getTrackerVariableId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getServerConvId();
		result = 37 * result + (getServerIp() == null ? 0 : this.getServerIp().hashCode());
		result = 37 * result + this.getTrackerVariableId();
		return result;
	}

}
