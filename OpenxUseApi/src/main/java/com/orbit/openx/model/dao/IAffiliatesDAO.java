package com.orbit.openx.model.dao;

import java.util.List;

import com.orbit.openx.model.Affiliates;


public interface IAffiliatesDAO {

	
	public List<Affiliates> getAffiliatesByPublisher(Integer idPub);
	
	public Affiliates getAffiliatesById(Integer id);
	
	public List<Affiliates> getAffiliatesByUser(int id);
	
	public int saveOrUpdateAffiliates(Affiliates affiliates);
	
}
