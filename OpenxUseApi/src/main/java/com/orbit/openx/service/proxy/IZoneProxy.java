package com.orbit.openx.service.proxy;

import org.apache.xmlrpc.XmlRpcException;



public interface IZoneProxy extends IAbstractProxy {

	public int addZone(int publisherId, String zoneName, String type, int width, int height) throws XmlRpcException;
	
	public void deleteZone(int idZone) throws XmlRpcException;
	
}
