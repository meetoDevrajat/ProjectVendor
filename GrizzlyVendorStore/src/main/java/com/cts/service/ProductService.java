package com.cts.service;

import java.util.List;

import com.cts.entity.Product;


public interface ProductService {

	
	void saveProduct(Product product);
	List<Product> listallProducts();
	public Product getProduct(int theId);
	public void deleteProduct(int theId);

	
}
