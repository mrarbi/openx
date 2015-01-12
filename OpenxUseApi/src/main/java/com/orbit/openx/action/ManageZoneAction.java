package com.orbit.openx.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
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
import com.orbit.openx.vo.TagVO;

/**
 * 
 */
@Namespace(value = "/zone")
public class ManageZoneAction extends ActionSupport implements SessionAware, Constants {

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

	@Action(value = "/formAddZone", results = { @Result(name = SUCCESS, type = "tiles", location = "addzone.tiles"), })
	public String execute() throws Exception {
		session.put("site", site);
		return SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	@Action(value = "/siteZones", results = { @Result(name = SUCCESS, type = "tiles", location = "listzone.tiles"), })
	public String siteZones() throws Exception {
		try {
			// idSite =
			// ServletActionContext.getRequest().getAttribute("idSite");
			if (null == idSite) {
				idSite = (String) session.get("idSite");
			}
			if (null != idSite && StringUtils.isNotEmpty(idSite) && StringUtils.isNumeric(idSite)) {
				Integer idSiteInt = Tools.getInteger(idSite);
				site = affiliatesService.getAffiliatesById(idSiteInt);
				listZones = zonesService.getZonesByAffiliatesId(idSiteInt);
			}
			String info = (String) session.get("info");
			if (null != info) {
				addActionMessage(info);
				session.remove("info");
			}
		} catch (Exception e) {
			addActionError("Erreur!\n" + e.getMessage());
			LOG.error("Erreur", e);
			throw e;
		}
		return SUCCESS;
	}

	/**
	 * 
	 */
	@Action(value = "/delZone", results = { @Result(name = SUCCESS, type = "redirectAction", location = "siteZones"), @Result(name = INPUT, type = "tiles", location = "listzone.tiles"), })
	public String delZone() throws Exception {
		String result = SUCCESS;
		try {
			if (null != deleteZones) {
				for (String id : deleteZones) {
					if (StringUtils.isNotEmpty(id)) {
						zoneProxy.deleteZone(Tools.getInteger(id));
						session.put("info", "Suppression efféctué avec succès!");
					}
				}
			}
		} catch (XmlRpcException e) {
			addActionError("Erreur! la zone n'a pas été supprimée! \n" + e.getMessage());
			LOG.error("Erreur", e);
			result = INPUT;
		} catch (Exception e) {
			addActionError("Erreur!\n" + e.getMessage());
			LOG.error("Erreur", e);
			result = INPUT;
		}
		return result;
	}

//	/**
//	 * 
//	 * @return
//	 * @throws Exception
//	 */
//	@Action(value = "/addZone", results = { @Result(name = SUCCESS, type = "redirectAction", location = "siteZones"), @Result(name = INPUT, type = "tiles", location = "addzone.tiles"), })
//	public String addZone() throws Exception {
//		String result = SUCCESS;
//		try {
//			Integer zoneId = zoneProxy.addZone(Tools.getInteger(idSite), zone.getZonename(), "0", Integer.valueOf(zone.getWidth()), Integer.valueOf(zone.getHeight()));
//			if (null != zoneId && !zoneId.equals(0)) {
//				session.put("idSite", idSite);
//				session.put("info", "Enregistrement efféctué avec succès!");
//				zone = null;
//			}
//		} catch (XmlRpcException e) {
//			addActionError("Erreur! la zone n'a pas été créé! \n" + e.getMessage());
//			LOG.error("Erreur", e);
//			result = INPUT;
//		} catch (Exception e) {
//			addActionError("Erreur!\n" + e.getMessage());
//			LOG.error("Erreur", e);
//			result = INPUT;
//		}
//		return result;
//	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@Action(value = "/getTag", results = { @Result(name = SUCCESS, location = "/tags.jsp") })
	public String getTag() throws Exception {
		try {
			Zones zone = zonesService.getZones(Tools.getInteger(idZone));
			if (null != zone && StringUtils.isNotEmpty(typeTag)) {
				TagVO tagVO = new TagVO();
				tagVO.setIdZone(Tools.getString(zone.getZoneid()));
				tagVO.setNomZone(zone.getZonename());
				tagVO.setPosition("(" + zone.getWidth() + " x " + zone.getHeight() + ")");
				tagVO.setHeight(Tools.getString(zone.getHeight()));
				tagVO.setWidth(Tools.getString(zone.getWidth()));

				// js avec header
				if (TAG_TYPE_JAVASCRIPT_HEADER.equalsIgnoreCase(typeTag)) {
					StringBuffer tagValue = new StringBuffer();
					tagValue.append("<script type='text/javascript'>").append("\n");
					tagValue.append(FUNCTION_AD_SCRIPT + "(" + zone.getZoneid() + ");").append("\n");
					tagValue.append("</script>").append("\n");

					String headTag = PROTOCOL_HTTP_SLACH + server + context + deliveryJsHead + PARAM_ID_EQUAL + idSite;
					ServletActionContext.getRequest().setAttribute("headTag", headTag);
					tagVO.setTagValue(tagValue.toString());
					ServletActionContext.getRequest().setAttribute("adTag", tagVO);
				}
				// js sans header
				if (TAG_TYPE_JAVASCRIPT.equalsIgnoreCase(typeTag)) {
					StringBuffer tagValue = new StringBuffer();
					tagValue.append("<script type='text/javascript'>").append("\n");
					tagValue.append("document.write(\"<script type='text/javascript' src='" + PROTOCOL_HTTP_SLACH + server + context + deliveryJs + "\");").append("\n");
					tagValue.append("document.write (\"?zoneid=" + idZone + "\");").append("\n");
					tagValue.append("document.write (\"&amp;cb=" + RandomStringUtils.randomAlphanumeric(8) + "\");").append("\n");
					tagValue.append("document.write (\"'><\\/script>\");").append("\n");
					tagValue.append("</script>");

					tagVO.setTagValue(tagValue.toString());
					ServletActionContext.getRequest().setAttribute("adTag", tagVO);
				}
				// iframe tag
				if (TAG_TYPE_IFRAME.equalsIgnoreCase(typeTag)) {
					StringBuffer tagValue = new StringBuffer();
					String randomId = RandomStringUtils.randomAlphanumeric(8).toLowerCase();
					String randomZone = RandomStringUtils.randomAlphanumeric(8).toLowerCase();

					tagValue.append("<iframe id='" + randomId + "' name='" + randomId + "'");
					tagValue.append(" src='" + PROTOCOL_HTTP_SLACH + server + context + deliveryFr + "?zoneid=" + idZone + "'");
					tagValue.append(" frameborder='0' scrolling='no' width='" + zone.getWidth() + "' height='" + zone.getHeight() + "'>").append("\n");
					tagValue.append("<a href='" + PROTOCOL_HTTP_SLACH + server + context + deliveryCk + "?n=" + randomZone + "' target='_blank'>");
					tagValue.append("<img src='" + PROTOCOL_HTTP_SLACH + server + context + deliveryAvw + "?zoneid=" + idZone + "&amp;n=" + randomZone + "' border='0' alt='' /></a>").append("\n");
					tagValue.append("</iframe>");

					tagVO.setTagValue(tagValue.toString());
					ServletActionContext.getRequest().setAttribute("adTag", tagVO);
				}
			}
//			siteZones();
		} catch (Exception e) {
			LOG.error("Erreur", e);
			throw e;
		}
		return SUCCESS;
	}

	/**
	 * 
	 * @return
	 */
	public List<String> getListTagTypes() {
		List<String> listTagTypes = new ArrayList<String>(0);
		listTagTypes.add(TAG_TYPE_JAVASCRIPT_HEADER);
		listTagTypes.add(TAG_TYPE_JAVASCRIPT);
		listTagTypes.add(TAG_TYPE_IFRAME);
		// listTagTypes.add(TAG_TYPE_NOSCRIPT);
		return listTagTypes;
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
