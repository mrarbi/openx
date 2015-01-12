package com.orbit.openx.vo;

import java.io.Serializable;

/**
 * 
 */
public class TagVO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String idZone;
	
	private String nomZone;
	
	private String position;
	
	private String width;
	
	private String height;

	private String tagValue;

	
	public String getIdZone() {
		return idZone;
	}

	
	public void setIdZone(String idZone) {
		this.idZone = idZone;
	}

	
	public String getNomZone() {
		return nomZone;
	}

	
	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	
	public String getPosition() {
		return position;
	}

	
	public void setPosition(String position) {
		this.position = position;
	}

	
	public String getTagValue() {
		return tagValue;
	}

	
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}


	
	public String getWidth() {
		return width;
	}


	
	public void setWidth(String width) {
		this.width = width;
	}


	
	public String getHeight() {
		return height;
	}


	
	public void setHeight(String height) {
		this.height = height;
	}
	
	
}
