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
import org.springframework.beans.factory.annotation.Value;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.model.Affiliates;
import com.orbit.openx.model.Zones;
import com.orbit.openx.service.IAffiliatesService;
import com.orbit.openx.service.IZonesService;
import com.orbit.openx.service.proxy.IZoneProxy;
import com.orbit.openx.utils.Constants;
import com.orbit.openx.utils.Tools;

/**
 * 
 */
@Namespace(value = "/zone")
public class AddZoneAction extends ActionSupport implements SessionAware, Constants {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	private Affiliates site = null;

	private String idSite = null;

	private String idZone = null;

	private List<Zones> listZones = new ArrayList<Zones>(0);

	private Zones zone;

	private String typeTag;

	private List<String> selectZones = new ArrayList<String>(0);

	private List<String> deleteZones = new ArrayList<String>(0);

	@Autowired
	IAffiliatesService affiliatesService;

	@Autowired
	IZonesService zonesService;

	@Autowired
	IZoneProxy zoneProxy;

	@Value("${openx.server}")
	String server;

	@Value("${openx.context}")
	String context;

	@Value("${openx.delivery.js.head}")
	String deliveryJsHead;

	@Value("${openx.delivery.js}")
	String deliveryJs;

	@Value("${openx.delivery.fr}")
	String deliveryFr;

	@Value("${openx.delivery.ck}")
	String deliveryCk;

	@Value("${openx.delivery.avw}")
	String deliveryAvw;

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "/addZone", results = { @Result(name = SUCCESS, type = "redirectAction", location = "siteZones"), @Result(name = INPUT, type = "tiles", location = "addzone.tiles"), })
	public String addZone() throws Exception {
		String result = SUCCESS;
		try {
			Integer zoneId = zoneProxy.addZone(Tools.getInteger(idSite), zone.getZonename(), "0", Integer.valueOf(zone.getWidth()), Integer.valueOf(zone.getHeight()));
			if (null != zoneId && !zoneId.equals(0)) {
				session.put("idSite", idSite);
				session.put("info", "Enregistrement efféctué avec succès!");
				zone = null;
			}
		} catch (XmlRpcException e) {
			addActionError("Erreur! la zone n'a pas été créé! \n" + e.getMessage());
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

	public String getIdSite() {
		return idSite;
	}

	public void setIdSite(String idSite) {
		this.idSite = idSite;
	}

	public String getIdZone() {
		return idZone;
	}

	public void setIdZone(String idZone) {
		this.idZone = idZone;
	}

	public List<Zones> getListZones() {
		return listZones;
	}

	public void setListZones(List<Zones> listZones) {
		this.listZones = listZones;
	}

	public String getTypeTag() {
		return typeTag;
	}

	public void setTypeTag(String typeTag) {
		this.typeTag = typeTag;
	}

	public List<String> getSelectZones() {
		return selectZones;
	}

	public void setSelectZones(List<String> selectZones) {
		this.selectZones = selectZones;
	}

	public Zones getZone() {
		return zone;
	}

	public void setZone(Zones zone) {
		this.zone = zone;
	}

	public List<String> getDeleteZones() {
		return deleteZones;
	}

	public void setDeleteZones(List<String> deleteZones) {
		this.deleteZones = deleteZones;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
