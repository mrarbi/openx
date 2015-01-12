package com.orbit.openx.service;

import java.util.List;

import com.orbit.openx.model.Affiliates;

/**
 * 
 * @author m.arbi
 *
 */
public interface IAffiliatesService {

	public List<Affiliates> getAffiliatesByPublisher(Integer id);

	public Affiliates getAffiliatesById(Integer id);

	public List<Affiliates> getAffiliatesByUser(int id);
	
	public int saveOrUpdateAffiliates(Affiliates affiliates);
	
}
