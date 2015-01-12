package com.orbit.openx.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.xmlrpc.XmlRpcException;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Affiliates;
import com.orbit.openx.service.proxy.IPublisherProxy;
import com.orbit.openx.utils.Constants;

/**
 * 
 */
@Namespace(value = "/site")
public class AddSiteAction extends ActionSupport implements SessionAware, Constants {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Affiliates site;

	private List<Affiliates> listAffiliates = new ArrayList<Affiliates>(0);

	private String idSite;

	private List<String> selectSites = new ArrayList<String>(0);

	@Autowired
	IPublisherProxy publisherProxy;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "/addSite", results = { @Result(name = SUCCESS, type = "redirectAction", location = "site"), @Result(name = INPUT, type = "tiles", location = "addsite.tiles") })
	public String addSite() throws Exception {
		String result = SUCCESS;
		try {
			Integer pubId = publisherProxy.addPublisher(site.getWebsite(), site.getEmail(), site.getContact(), site.getContact(), "");
			if (null != pubId && !pubId.equals(0)) {
				session.put("info", "Enregistrement efféctué avec succès!");
				site = null;
			}
		} catch (XmlRpcException e) {
			addActionError("Erreur! le site web n'a pas été créé!\n" + e.getMessage());
			LOG.error("Erreur", e);
			result = INPUT;
		} catch (Exception e) {
			addActionError("Erreur!\n" + e.getMessage());
			LOG.error("Erreur", e);
			result = INPUT;
		}
		return result;
	}

	public Affiliates getSite() {
		return site;
	}

	public void setSite(Affiliates site) {
		this.site = site;
	}

	public List<Affiliates> getListAffiliates() {
		return listAffiliates;
	}

	public void setListAffiliates(List<Affiliates> ListAffiliates) {
		this.listAffiliates = ListAffiliates;
	}

	public String getIdSite() {
		return idSite;
	}

	public void setIdSite(String idSite) {
		this.idSite = idSite;
	}

	public List<String> getSelectSites() {
		return selectSites;
	}

	public void setSelectSites(List<String> selectSites) {
		this.selectSites = selectSites;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
