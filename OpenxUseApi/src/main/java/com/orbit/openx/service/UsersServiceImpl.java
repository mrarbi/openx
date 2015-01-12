package com.orbit.openx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orbit.openx.model.dao.IUsersDAO;

/**
 * 
 * @author m.arbi
 *
 */
@Service
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private IUsersDAO usersDAO;
	
	public int getgetAccountIdByUserName(String username){
		return usersDAO.getAccountIdByUserName(username);
	}

}
