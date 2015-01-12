package com.orbit.openx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orbit.openx.model.Clients;
import com.orbit.openx.model.dao.IAdvertisersDAO;

@Service
public class AdvertisersServiceImpl implements IAdvertisersSerivice {
	
	@Autowired
	private IAdvertisersDAO advertisersDAO;
	
	public List<Clients> getListAdvertisers(int agenceId) throws Exception {
		return advertisersDAO.getListAdvertisers(agenceId);
	}
	

}
