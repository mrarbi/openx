package com.orbit.openx.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author m.arbi
 * 
 */
@Repository
@Transactional
public class UsersDAOImpl implements IUsersDAO {

	@Autowired
	SessionFactory sesFactory;
	
	public int getAccountIdByUserName(String username) {
		Integer idAccount = (Integer) sesFactory.getCurrentSession().createQuery("select defaultAccountId from Users where username = :username").setParameter("username", username).uniqueResult();
		if (null == idAccount) {
			return 0;
		} else {
			return idAccount.intValue();
		}
	}
}
