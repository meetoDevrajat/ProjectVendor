package com.cts.dao;

import java.util.List;

import com.cts.entity.Product;

public interface ProductDao {
	
	List<Product> listProduct();
	public void saveProduct(Product product);
	public void deleteProduct(int id);
	Product getProduct(int id);
	

	
	

}
