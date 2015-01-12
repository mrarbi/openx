package com.orbit.openx.service.proxy;

import org.apache.xmlrpc.XmlRpcException;



public interface IAdvertiserProxy extends IAbstractProxy {

	public int addAdvertiser(String advertName, int agenceId, String contact, String email) throws XmlRpcException;
	
	public void deleteAdvertiser(int idAdvert) throws XmlRpcException;
	
	
}
