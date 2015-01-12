package com.orbit.openx.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Clients;
import com.orbit.openx.service.IAdvertisersSerivice;
import com.orbit.openx.service.proxy.IAdvertiserProxy;
import com.orbit.openx.service.security.Utilisateur;
import com.orbit.openx.utils.Constants;
import com.orbit.openx.utils.Tools;

/**
 * 
 */
@Namespace(value = "/advert")
public class ManageAdvertAction extends ActionSupport implements SessionAware, Constants {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Clients advert;
	
	private Integer agencyid;

	private List<Clients> listAdverts = new ArrayList<Clients>(0);

	private List<String> selectAdverts = new ArrayList<String>(0);

	@Autowired
	private IAdvertisersSerivice advertisersSerivice;

	@Autowired
	private IAdvertiserProxy advertiserProxy;

	@Action(value = "/formAddAdvert", results = { @Result(name = SUCCESS, type = "tiles", location = "addadvert.tiles"), })
	public String execute() throws Exception {
		Utilisateur user = (Utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		agencyid = user.getId();
		return SUCCESS;
	}

	@Action(value = "/annonceurs", results = { @Result(name = SUCCESS, type = "tiles", location = "annonceurs.tiles") })
	public String listSites() throws Exception {
		try {
			// ServletActionContext.getRequest().getSession();
			Utilisateur user = (Utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (null != user) {
				listAdverts = advertisersSerivice.getListAdvertisers(user.getId());
			}
			String info = (String) session.get("info");
			if (null != info) {
				addActionMessage(info);
				session.remove("info");
			}
		} catch (Exception e) {
			LOG.error("Erreur", e);
			throw e;
		}
		return SUCCESS;
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "/delAdvert", results = { @Result(name = SUCCESS, type = "redirectAction", location = "annonceurs") })
	public String delAdvert() throws Exception {
		try {
			if (null != selectAdverts) {
				for (String id : selectAdverts) {
					if (StringUtils.isNotEmpty(id)) {
						advertiserProxy.deleteAdvertiser(Tools.getInteger(id));
						session.put("info", "Suppression efféctué avec succès!");
					}
				}
			}
		} catch (Exception e) {
			LOG.error("Erreur", e);
			throw e;
		}
		return SUCCESS;
	}

	public List<Clients> getListAdverts() {
		return listAdverts;
	}

	public void setListAdverts(List<Clients> listAdverts) {
		this.listAdverts = listAdverts;
	}

	public List<String> getSelectAdverts() {
		return selectAdverts;
	}

	public void setSelectAdverts(List<String> selectAdverts) {
		this.selectAdverts = selectAdverts;
	}

	public Clients getAdvert() {
		return advert;
	}

	public void setAdvert(Clients advert) {
		this.advert = advert;
	}

	public Integer getAgencyid() {
		return agencyid;
	}
	
	public void setAgencyid(Integer agencyid) {
		this.agencyid = agencyid;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	

}
