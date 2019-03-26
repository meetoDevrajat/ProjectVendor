package com.cts.service;

import java.util.List;

import com.cts.entity.Product;
import com.cts.entity.Vendor;


public interface VendorService {

	
	
	List<Vendor> listallVendors();
	public Vendor getVendor(int Id);
	

	
	
}
