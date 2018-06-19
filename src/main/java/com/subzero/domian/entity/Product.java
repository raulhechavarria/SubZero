package com.subzero.domian.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.subzero.domian.type.EnumMeasurement;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	
	@Column(name = "category_id")
	private Long category;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_price") 
	private Double price;
	
	@Column(name = "product_image")
	private String image;
	
//	@Column(name = "units_of_measurement")
//	private EnumMeasurement unitsMeasurement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	public EnumMeasurement getUnitsMeasurement() {
//		return unitsMeasurement;
//	}
//
//	public void setUnitsMeasurement(EnumMeasurement unitsMeasurement) {
//		this.unitsMeasurement = unitsMeasurement;
//	}
//	
	

}
