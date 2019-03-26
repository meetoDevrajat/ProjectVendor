package com.cts.entity;




import javax.persistence.*;




@Entity
@Table(name="ProductVendor_table")
public class Product {
	public Product() {
		super();
	}



	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="name",length=50)
	String name;

	@Column(name="Category",length=50)
	String category;
	
	@Column(name="Description",length=50)
	String description;
	
	@Column(name="rating",length=50)
	float rating;

	@Column(name="price",length=50)
	float price;
	
	@Column(name="brand",length=50)
	String brand;
	
	@Column(name="image",length=50)
	String image;

	@Column(name="Vendor_Id",length=50)
	int vendor_id;
	
	
	public Product(int id, String name, String category, String description, float rating, float price, String brand,
			String image, int vendor_id) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.brand = brand;
		this.image = image;
		this.vendor_id = vendor_id;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", rating=" + rating + ", price=" + price + ", brand=" + brand + ", image=" + image + ", vendor_id="
				+ vendor_id + "]";
	}

	public Product(int id, String name, String category, String description, float rating, float price, String brand,
			String image) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.brand = brand;
		this.image = image;
	}


	

}
