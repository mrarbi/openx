package com.orbit.openx.service.proxy;

import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;


public interface IAbstractProxy {

	public int addEntity(Map<String, Object> map) throws XmlRpcException;
	
	public void deleteEntity(int id) throws XmlRpcException;
	
	public int add() throws XmlRpcException;
	
	public void delete() throws XmlRpcException;

	public void logon() throws XmlRpcException;
	
	public void logoff() throws XmlRpcException;
	
	public Map<String, Object> getStruct();
	
	public void setStruct(Map<String, Object> struct);

	public int getId();

	public void setId(int id);

}
