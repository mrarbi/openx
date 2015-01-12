package com.orbit.openx.proxy.service;


import static org.junit.Assert.assertTrue;

import org.apache.xmlrpc.XmlRpcException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.orbit.openx.service.proxy.IAdvertiserProxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
@ActiveProfiles("dev")
public class AdvertiserProxyImplTest {

	@Autowired
	IAdvertiserProxy advertiserProxy;

	@Test
//	@Transactional
//	@Rollback(false)
	public void testLogon() throws XmlRpcException {
		advertiserProxy.logon();
		assertTrue(true);
	}


}
