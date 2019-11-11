package com.example.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PRODUCT")
public class Product {
	@Id
	@Column(name = "PRODUCTID")
	public Integer productId;
	
	@Column(name = "CODE")
	public String code;
	
	@Column(name = "NAME")
	public String name;
	
	@Column(name = "UNITPRICE")
	public BigDecimal unitPrice;
	
	
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}
