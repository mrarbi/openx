package com.orbit.openx.model;

// Generated 25 f�vr. 2014 12:11:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * AccountUserAssoc generated by hbm2java
 */
public class AccountUserAssoc implements java.io.Serializable {

	private AccountUserAssocId id;

	private Date linked;

	public AccountUserAssoc() {
	}

	public AccountUserAssoc(AccountUserAssocId id, Date linked) {
		this.id = id;
		this.linked = linked;
	}

	public AccountUserAssocId getId() {
		return this.id;
	}

	public void setId(AccountUserAssocId id) {
		this.id = id;
	}

	public Date getLinked() {
		return this.linked;
	}

	public void setLinked(Date linked) {
		this.linked = linked;
	}

}
