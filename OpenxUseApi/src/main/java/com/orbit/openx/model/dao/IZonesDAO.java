package com.orbit.openx.model.dao;

import java.util.List;

import com.orbit.openx.model.Zones;

/**
 * 
 *
 */
public interface IZonesDAO {
	
	
	public List<Zones> getZonesByAffiliatesId(Integer id);
	
	public Zones getZones(Integer id);

}
