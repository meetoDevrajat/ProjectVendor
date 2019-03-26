package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.ProductDao;

import com.cts.entity.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	

	
	//Saving the product
	@Override
	@Transactional
	public void saveProduct(Product product) { 
	
		productDao.saveProduct(product);

	}

	//Fetching the list of products
	@Override
	@Transactional
	public List<Product> listallProducts() {
		
		
		
		return productDao.listProduct();
	}

	//Getting the  product using its Id
	@Override
	@Transactional
	public Product getProduct(int theId) {
		Product product=productDao.getProduct(theId);
		return product;
	}
	
	//Deleting the Products its Id
	@Override
	@Transactional
	public void deleteProduct(int theId) {
		
		productDao.deleteProduct(theId);
	}

	
	





}
