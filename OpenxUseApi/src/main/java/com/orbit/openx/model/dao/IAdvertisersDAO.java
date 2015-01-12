package com.orbit.openx.model.dao;

import java.util.List;

import com.orbit.openx.model.Clients;


public interface IAdvertisersDAO {

	
	public List<Clients> getListAdvertisers(int agenceId) throws Exception;
}
