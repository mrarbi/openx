package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * PlacementZoneAssoc generated by hbm2java
 */
public class PlacementZoneAssoc implements java.io.Serializable {

	private Integer placementZoneAssocId;

	private Integer zoneId;

	private Integer placementId;

	public PlacementZoneAssoc() {
	}

	public PlacementZoneAssoc(Integer zoneId, Integer placementId) {
		this.zoneId = zoneId;
		this.placementId = placementId;
	}

	public Integer getPlacementZoneAssocId() {
		return this.placementZoneAssocId;
	}

	public void setPlacementZoneAssocId(Integer placementZoneAssocId) {
		this.placementZoneAssocId = placementZoneAssocId;
	}

	public Integer getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getPlacementId() {
		return this.placementId;
	}

	public void setPlacementId(Integer placementId) {
		this.placementId = placementId;
	}

}
