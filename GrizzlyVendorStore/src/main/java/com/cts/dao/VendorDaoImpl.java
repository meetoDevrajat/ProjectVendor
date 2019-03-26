package com.cts.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.cts.entity.Product;
import com.cts.entity.Vendor;
@Repository("vendorDao")
public class VendorDaoImpl implements VendorDao {

	@Autowired
	private SessionFactory sessionFactory;
	




	
	

	@Override
	public List<Vendor> listVendor() {
		// TODO Auto-generated method stub
		Session session  = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Vendor> cq = cb.createQuery(Vendor.class);
		Root<Vendor> root = cq.from(Vendor.class);
		
		cq.select(root);
		Query query  = session.createQuery(cq);
		return  query.getResultList();
	}








	@Override
	public Vendor getVendor(int id) {
		// TODO Auto-generated method stub
		Session session  = sessionFactory.getCurrentSession();
		Vendor thevendor = session.get(Vendor.class, id);
		
		return thevendor;
	}



	

}
