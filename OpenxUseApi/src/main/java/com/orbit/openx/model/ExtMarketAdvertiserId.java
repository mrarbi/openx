package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * ExtMarketAdvertiserId generated by hbm2java
 */
public class ExtMarketAdvertiserId implements java.io.Serializable {

	private String marketAdvertiserId;

	private String name;

	public ExtMarketAdvertiserId() {
	}

	public ExtMarketAdvertiserId(String marketAdvertiserId, String name) {
		this.marketAdvertiserId = marketAdvertiserId;
		this.name = name;
	}

	public String getMarketAdvertiserId() {
		return this.marketAdvertiserId;
	}

	public void setMarketAdvertiserId(String marketAdvertiserId) {
		this.marketAdvertiserId = marketAdvertiserId;
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
		if (!(other instanceof ExtMarketAdvertiserId))
			return false;
		ExtMarketAdvertiserId castOther = (ExtMarketAdvertiserId) other;

		return ((this.getMarketAdvertiserId() == castOther.getMarketAdvertiserId()) || (this.getMarketAdvertiserId() != null && castOther.getMarketAdvertiserId() != null && this
				.getMarketAdvertiserId().equals(castOther.getMarketAdvertiserId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null && this.getName().equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMarketAdvertiserId() == null ? 0 : this.getMarketAdvertiserId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}
