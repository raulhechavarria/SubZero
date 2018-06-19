package com.subzero.service.assembler;

import com.subzero.domian.entity.Product;
import com.subzero.service.dto.GetProductDto;
import com.subzero.service.dto.SaveProductDto;
import com.subzero.service.dto.UpdateProductDto;

public class ProductAssembler {

	public static SaveProductDto saveProduct(Product product) { ///  that  is aged
		SaveProductDto saveProductDto = new SaveProductDto();
		saveProductDto.setId(product.getId());
		saveProductDto.setName(product.getName());
		saveProductDto.setCategory(product.getCategory());
		saveProductDto.setImage(product.getImage());
		saveProductDto.setPrice(product.getPrice());
//		saveProductDto.setUnitsMeasurement(product.getUnitsMeasurement());
		return saveProductDto;
	}

	public static UpdateProductDto updateProduct(Product product) {
		UpdateProductDto updateProductDto = new UpdateProductDto();
		updateProductDto.setId(product.getId());
		updateProductDto.setName(product.getName());
		updateProductDto.setCategory(product.getCategory());
		updateProductDto.setImage(product.getImage());
		updateProductDto.setPrice(product.getPrice());
//		updateProductDto.setUnitsMeasurement(product.getUnitsMeasurement());
		return updateProductDto;
	}

	public static GetProductDto getProductDto(Product product) {
		GetProductDto getProductDto = new GetProductDto();
		getProductDto.setId(product.getId());
		getProductDto.setName(product.getName());
		getProductDto.setCategory(product.getCategory());
		getProductDto.setImage(product.getImage());
		getProductDto.setPrice(product.getPrice());
//		getProductDto.setUnitsMeasurement(product.getUnitsMeasurement());
		
		return getProductDto;
	}
}
