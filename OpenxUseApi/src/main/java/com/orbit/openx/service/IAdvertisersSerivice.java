package com.orbit.openx.service;

import java.util.List;

import com.orbit.openx.model.Clients;


public interface IAdvertisersSerivice {
	
	public List<Clients> getListAdvertisers(int agenceId) throws Exception;
}
