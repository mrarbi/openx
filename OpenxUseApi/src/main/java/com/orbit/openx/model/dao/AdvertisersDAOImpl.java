package com.orbit.openx.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orbit.openx.model.Clients;

/**
 * 
 *
 */
@Repository
@Transactional
public class AdvertisersDAOImpl implements IAdvertisersDAO {
	
	@Autowired
	SessionFactory sesFactory;
	
	@Override
	@Transactional
	public List<Clients> getListAdvertisers(int agenceId) throws Exception {
		return sesFactory.getCurrentSession().createQuery("select clientid as clientid, clientname as clientname, contact as contact, email as email from Clients where agencyid = :id")
				.setParameter("id", agenceId).setResultTransformer(Transformers.aliasToBean(Clients.class)).list();
//		return sesFactory.getCurrentSession().createQuery("from Clients where agencyid = :id")
//				.setParameter("id", agenceId).list();
	}

}
