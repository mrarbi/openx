package com.orbit.openx.service.proxy;


import java.util.Hashtable;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.hibernate.SessionFactory;
import org.openads.proxy.Advertiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvertiserProxyImpl extends AbstractProxy implements IAdvertiserProxy {

	@Autowired
	SessionFactory sesFactory;
	
	/**
	 * 
	 */
	public int addAdvertiser(String advertName, int agenceId, String contact, String email) throws XmlRpcException {
		Map<String, Object> struct = new Hashtable<String, Object>();
		struct.put(Advertiser.ADVERTISER_NAME, advertName);
		struct.put(Advertiser.AGENCY_ID, agenceId);
		struct.put(Advertiser.CONTACT_NAME, contact);
		struct.put(Advertiser.EMAIL_ADDRESS, email);
		struct.put(Advertiser.USERNAME, advertName);
//		struct.put("reportlastdate", "2014-03-23");
		return addEntity(struct);
	}

	/**
	 * 
	 */
	public void deleteAdvertiser(int idAdvert) throws XmlRpcException {
		deleteEntity(idAdvert);
	}


	@Override
	public int add() throws XmlRpcException {
		return getProxy().addAdvertiser(getStruct());
	}
	
	@Override
	public void delete() throws XmlRpcException {
		getProxy().deleteAdvertiser(getId());
	}


}
