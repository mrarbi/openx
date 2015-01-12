package com.orbit.openx.service.proxy;

import org.openads.proxy.OpenAdsApiXmlRpcProxy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class OpenxApiProxyFactory implements IOpenxApiProxyFactory {

	@Value("${openx.server}")
	String server;

	@Value("${openx.context}")
	String context;

	@Value("${openx.api.v1}")
	String apiPath;

	private static OpenAdsApiXmlRpcProxy instance;

	public OpenAdsApiXmlRpcProxy getInstance() {
		if (null == instance) {
			if (null != server && null != context && null != apiPath) {
				String basePath = context + apiPath;
				instance = new OpenAdsApiXmlRpcProxy(server, basePath);
			}
		}
		return instance;
	}

}
