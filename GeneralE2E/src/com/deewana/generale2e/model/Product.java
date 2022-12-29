package com.deewana.generale2e.model;

public class Product {

	int productId;
	String productName;
	String productType;
	String company;

	public Product(int productId, String productName, String productType, String company) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.company = company;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
