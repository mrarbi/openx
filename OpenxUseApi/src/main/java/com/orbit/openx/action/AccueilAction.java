package com.orbit.openx.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Affiliates;
import com.orbit.openx.service.IAffiliatesService;
import com.orbit.openx.service.proxy.IPublisherProxy;
import com.orbit.openx.service.security.Utilisateur;

/**
 * 
 */
public class AccueilAction extends ActionSupport {

	@Autowired
	IPublisherProxy publisherProxy;

	@Autowired
	IAffiliatesService affiliatesService;

	List data = new ArrayList();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// @Action(value="/accueil", results={
	// @Result(name="success", type="tiles", location = "accueil.tiles")})
	// public String execute() throws Exception {
	// Gson gson = new Gson();
	// try {
	//
	// Utilisateur user = (Utilisateur)
	// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	// if (null != user) {
	// List<Affiliates> listAffiliates =
	// affiliatesService.getAffiliatesByUser(user.getId());
	// if (null != listAffiliates && !listAffiliates.isEmpty()) {
	// for (Affiliates affiliates : listAffiliates) {
	// Map resultMap = new HashMap();
	// Map[] map =
	// publisherProxy.advertiserPublisherStatistics(affiliates.getAffiliateid());
	//
	// resultMap.put("value", 1);
	// resultMap.put("color", "#HGHGHG");
	//
	// data.add(resultMap);
	// }
	// }
	// }
	//
	// ServletActionContext.getResponse().getWriter().write(gson.toJson(data));
	// } catch (Exception e) {
	// LOG.error("Erreur", e);
	// throw e;
	// }
	// return SUCCESS;
	// }

	@Action(value = "/getData")
	public void getData() throws Exception {
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
			LOG.error("Erreur", e);
			throw e;
		}
	}

	public static void main(String[] args) {

		Gson gson = new Gson();

		Map[] map = new HashMap[1];

		map[0] = new HashMap();

		map[0].put("value", 1);
		map[0].put("color", "#HGHGHG");

		System.out.println(gson.toJson(map));

	}

	public IAffiliatesService getAffiliatesService() {
		return affiliatesService;
	}

	public void setAffiliatesService(IAffiliatesService affiliatesService) {
		this.affiliatesService = affiliatesService;
	}

	public void setData(List data) {
		this.data = data;
	}

}
