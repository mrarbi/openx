package com.orbit.openx.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orbit.openx.model.Affiliates;

@Repository
@Transactional
public class AffiliatesDAOImpl implements IAffiliatesDAO {

	@Autowired
	SessionFactory sesFactory;

	@Override
	public List<Affiliates> getAffiliatesByPublisher(Integer idPub) {
		return sesFactory.getCurrentSession().createQuery("from Affiliates").list();
	}

	@Override
	public Affiliates getAffiliatesById(Integer id) {
		return (Affiliates) sesFactory.getCurrentSession().get(Affiliates.class, id);
	}

	@Override
	public List<Affiliates> getAffiliatesByUser(int id) {
		List<Integer> idsAccounts = sesFactory.getCurrentSession().createQuery("select accUse.id.accountId from AccountUserAssoc accUse where accUse.id.userId = :id").setParameter("id", id).list();
		return sesFactory.getCurrentSession().createQuery("from Affiliates a where exists (select 1 from Agency ag where a.agencyid = ag.agencyid and ag.accountId in (:ids))")
				.setParameterList("ids", idsAccounts).list();
	}

	@Override
	public int saveOrUpdateAffiliates(Affiliates affiliates) {
		sesFactory.getCurrentSession().saveOrUpdate(affiliates);
		if (null != affiliates) {
			return affiliates.getAffiliateid();
		}
		return 0;
	}
}
