package com.orbit.openx.service.proxy;


import java.util.Hashtable;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.openads.proxy.Zone;
import org.springframework.stereotype.Service;

@Service
public class ZoneProxyImpl extends AbstractProxy implements IZoneProxy {

	/**
	 * 
	 */
	public int addZone(int publisherId, String zoneName, String type, int width, int height) throws XmlRpcException {
		Map<String, Object> struct = new Hashtable<String, Object>();
		struct.put(Zone.PUBLISHER_ID, publisherId);
		struct.put(Zone.ZONE_NAME, zoneName);
		struct.put(Zone.TYPE, type);
		struct.put(Zone.WIDTH, width);
		struct.put(Zone.HEIGHT, height);
		return addEntity(struct);
	}

	/**
	 * 
	 */
	public void deleteZone(int idZone) throws XmlRpcException {
		deleteEntity(idZone);
	}


	@Override
	public int add() throws XmlRpcException {
		return getProxy().addZone(getStruct());
	}
	
	@Override
	public void delete() throws XmlRpcException {
		getProxy().deleteZone(getId());
	}

}
