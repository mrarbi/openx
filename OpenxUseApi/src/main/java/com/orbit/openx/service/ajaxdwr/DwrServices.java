package com.orbit.openx.service.ajaxdwr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.ServletActionContext;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.orbit.openx.model.Affiliates;
import com.orbit.openx.model.Zones;
import com.orbit.openx.service.IAffiliatesService;
import com.orbit.openx.service.proxy.IPublisherProxy;
import com.orbit.openx.service.security.Utilisateur;

@Service
@RemoteProxy
public class DwrServices {

	@Autowired
	IPublisherProxy publisherProxy;

	@Autowired
	IAffiliatesService affiliatesService;
	
	public String getStr() {
		Gson gson = new Gson();
		Zones zone = new Zones();
		zone.setZonename("tttttttttttttttttt");
		return gson.toJson(zone);
		
	}
	
	@RemoteMethod
	public void getData() throws Exception {
		List data = new ArrayList();
		Gson gson = new Gson();
		try {
			Utilisateur user = (Utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (null != user) {
				List<Affiliates> listAffiliates = affiliatesService.getAffiliatesByUser(user.getId());
				if (null != listAffiliates && !listAffiliates.isEmpty()) {
					for (Affiliates affiliates : listAffiliates) {
						Map[] map = publisherProxy.advertiserPublisherStatistics(affiliates.getAffiliateid());
						Map resultMap = new HashMap();
						String color = "#E" + RandomStringUtils.randomNumeric(5);
						if (null != map && map.length > 0) {
							resultMap = new HashMap();
							resultMap.put("value", map[0].get("impressions"));
							resultMap.put("color", color);
							resultMap.put("site", affiliates.getName());
							data.add(resultMap);
							
						} else {
							resultMap = new HashMap();
							resultMap.put("value", 1);
							resultMap.put("color", "#ffffff");
							data.add(resultMap);
						}
					}
				}
			}

			HttpServletResponse response = ServletActionContext.getResponse();

			response.setContentType("application/json");
			response.getWriter().write(gson.toJson(data));
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	
}
