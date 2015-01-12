package com.orbit.openx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orbit.openx.model.Zones;
import com.orbit.openx.model.dao.IZonesDAO;

@Service
public class ZonesServiceImpl implements IZonesService {
	
	@Autowired
	private IZonesDAO zonesDAO;
	
	public List<Zones> getZonesByAffiliatesId(Integer id){
		return zonesDAO.getZonesByAffiliatesId(id);
	}
	
	public Zones getZones(Integer id) {
		return zonesDAO.getZones(id);
	}

}
