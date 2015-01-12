package com.orbit.openx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orbit.openx.model.Affiliates;
import com.orbit.openx.model.dao.IAffiliatesDAO;

/**
 * 
 * @author m.arbi
 *
 */
@Service
public class AffiliatesServiceImpl implements IAffiliatesService {

	@Autowired
	private IAffiliatesDAO affiliatesDAO;

	public List<Affiliates> getAffiliatesByPublisher(Integer id) {
		return affiliatesDAO.getAffiliatesByPublisher(id);
	}

	public Affiliates getAffiliatesById(Integer id) {
		return affiliatesDAO.getAffiliatesById(id);
	}

	public List<Affiliates> getAffiliatesByUser(int id) {
		return affiliatesDAO.getAffiliatesByUser(id);
	}
	
	public int saveOrUpdateAffiliates(Affiliates affiliates) {
		return affiliatesDAO.saveOrUpdateAffiliates(affiliates);
	}
}
