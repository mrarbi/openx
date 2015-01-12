package com.orbit.openx.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.xmlrpc.XmlRpcException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Affiliates;
import com.orbit.openx.service.IAffiliatesService;
import com.orbit.openx.service.proxy.IPublisherProxy;
import com.orbit.openx.service.security.Utilisateur;
import com.orbit.openx.utils.Constants;
import com.orbit.openx.utils.Tools;

/**
 * 
 */
@Namespace(value = "/site")
public class ManageSiteAction extends ActionSupport implements SessionAware, Constants {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Affiliates site;

	private List<Affiliates> listAffiliates = new ArrayList<Affiliates>(0);

	private String idSite;

	private List<String> selectSites = new ArrayList<String>(0);

	@Autowired
	IPublisherProxy publisherProxy;

	@Autowired
	IAffiliatesService affiliatesService;

	@Action(value = "/formAddSite", results = { @Result(name = SUCCESS, type = "tiles", location = "addsite.tiles"), @Result(name = INPUT, type = "tiles", location = "addsite.tiles") })
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	@Action(value = "/site", results = { @Result(name = SUCCESS, type = "tiles", location = "site.tiles"), @Result(name = INPUT, type = "tiles", location = "site.tiles") })
	public String listSites() throws Exception {
		try {
			
//			ServletActionContext.getRequest().getSession();
			
			Utilisateur user = (Utilisateur) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			if (null != user) {
				listAffiliates = affiliatesService.getAffiliatesByUser(user.getId());
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
	@Action(value = "/delSite", results = { @Result(name = SUCCESS, type = "redirectAction", location = "site") })
	public String delSite() throws Exception {
		try {
			if (null != selectSites) {
				for (String id : selectSites) {
					if (StringUtils.isNotEmpty(id)) {
						publisherProxy.deletePublisher(Tools.getInteger(id));
						session.put("info", "Suppression efféctué avec succès!");
					}
				}
			}
		} catch (XmlRpcException e) {
			addActionError("Erreur! le site n'a pas été supprimée! \n" + e.getMessage());
			LOG.error("Erreur", e);
			throw e;
		} catch (Exception e) {
			LOG.error("Erreur", e);
			throw e;
		}
		return SUCCESS;
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
