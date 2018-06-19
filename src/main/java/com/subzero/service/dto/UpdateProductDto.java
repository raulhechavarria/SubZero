package com.subzero.service.dto;

import com.subzero.domian.type.EnumMeasurement;

public class UpdateProductDto {
	private Long id;

	private Long category;

	private String name;

	private Double price;

	private String image;

	private EnumMeasurement unitsMeasurement;

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

	public EnumMeasurement getUnitsMeasurement() {
		return unitsMeasurement;
	}

	public void setUnitsMeasurement(EnumMeasurement unitsMeasurement) {
		this.unitsMeasurement = unitsMeasurement;
	}

}