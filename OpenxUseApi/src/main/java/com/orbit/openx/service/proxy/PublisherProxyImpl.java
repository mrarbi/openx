package com.orbit.openx.service.proxy;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.openads.proxy.Publisher;
import org.springframework.stereotype.Service;

@Service
public class PublisherProxyImpl extends AbstractProxy implements IPublisherProxy {

	public int addPublisher(String website, String emailAddress, String username, String publisherName, String password) throws XmlRpcException {
		Map<String, Object> struct = new Hashtable<String, Object>();
		struct.put("website", website);
		struct.put(Publisher.EMAIL_ADDRESS, emailAddress);
		struct.put(Publisher.USERNAME, username);
		struct.put(Publisher.PUBLISHER_NAME, publisherName);
		struct.put(Publisher.PASSWORD, password);
		return addEntity(struct);
	}

	public void deletePublisher(int idPublisher) throws XmlRpcException {
		deleteEntity(idPublisher);
	}

	@Override
	public int add() throws XmlRpcException {
		return getProxy().addPublisher(getStruct());
	}

	@Override
	public void delete() throws XmlRpcException {
		getProxy().deletePublisher(getId());
	}

	@Override
	public Map<String, Object>[] advertiserPublisherStatistics(int id, Date start) throws XmlRpcException {
		logon();
		Map<String, Object>[] maps = getProxy().publisherAdvertiserStatistics(id, start);
		logoff();
		return maps;
	}
	
	@Override
	public Map<String, Object>[] advertiserPublisherStatistics(int id) throws XmlRpcException {
		logon();
		Map<String, Object>[] maps = getProxy().publisherAdvertiserStatistics(id);
		logoff();
		return maps;
	}
	

}
