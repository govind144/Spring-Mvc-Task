package com.gkn.springmvctask.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.gkn.springmvctask.entity.BandTable;

@Repository
public class BandDaoImpl implements BandDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BandTable> getBandDetails() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<BandTable> theQuery = currentSession.createQuery("from BandTable", BandTable.class);
		List<BandTable> bands = theQuery.getResultList();

		return bands;	  
	}

}
