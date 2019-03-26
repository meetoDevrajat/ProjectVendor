package com.cts.dao;

import java.util.List;

import com.cts.entity.Product;
import com.cts.entity.Vendor;

public interface VendorDao {
	
	


	List<Vendor> listVendor();

	Vendor getVendor(int id);
	

}
