package com.orbit.openx.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orbit.openx.model.Zones;

/**
 * 
 *
 */
@Repository
@Transactional
public class ZonesDAOImpl implements IZonesDAO {
	
	@Autowired
	SessionFactory sesFactory;
	
	@Override
	public List<Zones> getZonesByAffiliatesId(Integer id){
		return sesFactory.getCurrentSession().createQuery("from Zones where affiliateid = :id").setParameter("id", id).list();
	}
	
	@Override
	public Zones getZones(Integer id){
		return (Zones) sesFactory.getCurrentSession().get(Zones.class, id);
	}

}
