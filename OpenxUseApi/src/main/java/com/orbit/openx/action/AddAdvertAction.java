package com.orbit.openx.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.xmlrpc.XmlRpcException;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Clients;
import com.orbit.openx.service.proxy.IAdvertiserProxy;
import com.orbit.openx.utils.Constants;

/**
 * 
 */
@Namespace(value = "/advert")
public class AddAdvertAction extends ActionSupport implements SessionAware, Constants {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Clients advert;
	
	private Integer agencyid;

	@Autowired
	private IAdvertiserProxy advertiserProxy;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "/addAdvert", results = { @Result(name = SUCCESS, type = "redirectAction", location = "annonceurs"), @Result(name = INPUT, type = "tiles", location = "addadvert.tiles") })
	public String addSite() throws Exception {
		String result = SUCCESS;
		try {
			Integer idAdvert = advertiserProxy.addAdvertiser(advert.getClientname(), agencyid, advert.getContact(), advert.getEmail());
			if (null != idAdvert && !idAdvert.equals(0)) {
				session.put("info", "Enregistrement éffectué avec succés.");
				advert = null;
			}
		} catch (XmlRpcException e) {
			addActionError("Erreur! l'annonceur n'a pas été créé! \n" + e.getMessage());
			LOG.error("Erreur", e);
			result = INPUT;
		} catch (Exception e) {
			LOG.error("Erreur", e);
			throw e;
		}
		return result;
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
