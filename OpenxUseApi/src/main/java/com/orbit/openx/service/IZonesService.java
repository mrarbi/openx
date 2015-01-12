package com.orbit.openx.service;

import java.util.List;

import com.orbit.openx.model.Zones;


public interface IZonesService {

	public List<Zones> getZonesByAffiliatesId(Integer id);
	
	public Zones getZones(Integer id);
	
}
