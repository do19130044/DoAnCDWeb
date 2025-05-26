package com.tandat.webdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
	@Id
	@Column(name = "ProductID")
	Integer productID;
	@Column(name = "product_name")
	String productName;
	@Column(name = "categoryid")
	Integer categoryID;
	@Column(name = "Description")
	String description;
	@Column(name = "price")
	Integer price;
	@Column(name = "stockQuantity")
	Integer stockQuantity;
	@Column(name = "unit_price")
	String unit_price;
	@Column(name = "imgpath")
	String imgPath;
	@Column(name = "color")
	String color;

	public Integer getProductID() {
		return productID;
	}

	public void setProductID(Integer productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", categoryID=" + categoryID
				+ ", description=" + description + ", price=" + price + ", stockQuantity=" + stockQuantity
				+ ", unit_price=" + unit_price + ", imgPath=" + imgPath + "]";
	}

}