package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.VendorDao;

import com.cts.entity.Product;
import com.cts.entity.Vendor;

@Service("vendorService")
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDao vendorDao;

	


	@Override
	@Transactional
	public List<Vendor> listallVendors() {
		// TODO Auto-generated method stub
		
		System.out.println("I m In book service");
		return vendorDao.listVendor();
	}




	@Override
	@Transactional
	public Vendor getVendor(int Id) {
		// TODO Auto-generated method stub
		Vendor vendor=vendorDao.getVendor(Id);
		return vendor;
	}





}
