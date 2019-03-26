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
@Repository("ProductDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		System.out.println("Hello"+sessionFactory);
		System.out.println("From Dao List");
		
		Session session  = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		
		cq.select(root);
		Query query  = session.createQuery(cq);
		return  query.getResultList();
		
		

		
	}

	@Override

	public void saveProduct(Product product) {
		System.out.println("ID IN SAVE UPDATE "+product.getId());
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("Data Saved");
		
	}

	@Override
	public void deleteProduct(int id) {
		Session session  = sessionFactory.getCurrentSession();
		Product theproduct = session.get(Product.class, id);
		session.delete(theproduct);

		
	}
	
	@Override
	public Product getProduct(int id){
		Session session  = sessionFactory.getCurrentSession();
		Product theproduct = session.get(Product.class, id);
		
		return theproduct;
	}

	

	

}
