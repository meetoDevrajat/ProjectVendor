package com.cts.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Vendor_table")
public class Vendor {
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	

	@OneToMany(cascade = CascadeType.ALL,mappedBy="vendor_id",fetch=FetchType.EAGER)
	private List<Product> products = new ArrayList<>();
	
	@Id
	@Column(name="vendor_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="VendorName",length=50)
	String name;

	@Column(name="Location",length=50)
	String location;
	
	@Column(name="Contact",length=50)
	String contact;

	public String getLocation() {
		return location;
	}


	public Vendor(List<Product> products, int id, String name, String location, String contact) {
		super();
		this.products = products;
		this.id = id;
		this.name = name;
		this.location = location;
		this.contact = contact;
	}


	public void setLocation(String location) {
		this.location = location;
	}




	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Vendor [products=" + products + ", id=" + id + ", name=" + name + ", location=" + location
				+ ", contact=" + contact + "]";
	}



	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	
}
