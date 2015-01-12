package com.orbit.openx.service.proxy;

import java.util.Hashtable;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.openads.proxy.OpenAdsApiXmlRpcProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class AbstractProxy implements IAbstractProxy{

	@Value("${openx.user}")
	private String username;

	@Value("${openx.password}")
	private String password;
	
	@Autowired
	OpenxApiProxyFactory proxy;
	
	private Map<String, Object> struct = new Hashtable<String, Object>(0);
	
	private int id = 0;
	
	public int addEntity(Map<String, Object> map) throws XmlRpcException {
		logon();
		setStruct(map);
		int id = add();
		logoff();
		return id;
	}
	
	public void deleteEntity(int id) throws XmlRpcException {
		logon();
		setId(id);
		delete();
		logoff();
	}
	
	@Override
	public void logon() throws XmlRpcException{
		proxy.getInstance().logon(username, password);
	}
	
	@Override
	public void logoff() throws XmlRpcException {
		proxy.getInstance().logoff();
	}

	public Map<String, Object> getStruct() {
		return struct;
	}
	
	public void setStruct(Map<String, Object> struct) {
		this.struct = struct;
	}

	@Override
	public int add() throws XmlRpcException {
		return 0;
	}

	@Override
	public void delete() throws XmlRpcException {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OpenAdsApiXmlRpcProxy getProxy() {
		return proxy.getInstance();
	}

}
