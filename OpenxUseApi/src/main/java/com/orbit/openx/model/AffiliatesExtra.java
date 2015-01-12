package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

/**
 * AffiliatesExtra generated by hbm2java
 */
public class AffiliatesExtra implements java.io.Serializable {

	private int affiliateid;

	private String address;

	private String city;

	private String postcode;

	private String country;

	private String phone;

	private String fax;

	private String accountContact;

	private String payeeName;

	private String taxId;

	private String modeOfPayment;

	private String currency;

	private Integer uniqueUsers;

	private Integer uniqueViews;

	private Integer pageRank;

	private String category;

	private String helpFile;

	public AffiliatesExtra() {
	}

	public AffiliatesExtra(int affiliateid) {
		this.affiliateid = affiliateid;
	}

	public AffiliatesExtra(int affiliateid, String address, String city, String postcode, String country, String phone, String fax, String accountContact, String payeeName, String taxId,
			String modeOfPayment, String currency, Integer uniqueUsers, Integer uniqueViews, Integer pageRank, String category, String helpFile) {
		this.affiliateid = affiliateid;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.accountContact = accountContact;
		this.payeeName = payeeName;
		this.taxId = taxId;
		this.modeOfPayment = modeOfPayment;
		this.currency = currency;
		this.uniqueUsers = uniqueUsers;
		this.uniqueViews = uniqueViews;
		this.pageRank = pageRank;
		this.category = category;
		this.helpFile = helpFile;
	}

	public int getAffiliateid() {
		return this.affiliateid;
	}

	public void setAffiliateid(int affiliateid) {
		this.affiliateid = affiliateid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAccountContact() {
		return this.accountContact;
	}

	public void setAccountContact(String accountContact) {
		this.accountContact = accountContact;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getModeOfPayment() {
		return this.modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getUniqueUsers() {
		return this.uniqueUsers;
	}

	public void setUniqueUsers(Integer uniqueUsers) {
		this.uniqueUsers = uniqueUsers;
	}

	public Integer getUniqueViews() {
		return this.uniqueViews;
	}

	public void setUniqueViews(Integer uniqueViews) {
		this.uniqueViews = uniqueViews;
	}

	public Integer getPageRank() {
		return this.pageRank;
	}

	public void setPageRank(Integer pageRank) {
		this.pageRank = pageRank;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getHelpFile() {
		return this.helpFile;
	}

	public void setHelpFile(String helpFile) {
		this.helpFile = helpFile;
	}

}