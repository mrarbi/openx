package com.orbit.openx.service.proxy;

import java.util.Date;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;



public interface IPublisherProxy extends IAbstractProxy {

	public int addPublisher(String website, String email_address, String username, String publisher_name, String password) throws XmlRpcException;
	
	public void deletePublisher(int idPublisher) throws XmlRpcException;
	
	public Map[] advertiserPublisherStatistics(int id, Date start) throws XmlRpcException;
	
	public Map[] advertiserPublisherStatistics(int id) throws XmlRpcException;
	
}
