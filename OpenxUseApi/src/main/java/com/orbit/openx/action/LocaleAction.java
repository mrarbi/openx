package com.orbit.openx.action;

import com.opensymphony.xwork2.ActionSupport;
import com.orbit.openx.utils.Constants;

/**
 * 
 */
public class LocaleAction extends ActionSupport implements Constants {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//business logic
	public String execute() {
		
//		System.out.println(getLocale());
		
		return "SUCCESS";
	}
}
