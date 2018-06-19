package com.subzero.service;

import java.util.List;

import com.subzero.controller.request.ProductRequest;
import com.subzero.service.dto.GetProductDto;
import com.subzero.service.dto.SaveProductDto;
import com.subzero.service.dto.UpdateProductDto;

public interface ProductService {

	SaveProductDto saveProduct(ProductRequest productRequest);

	UpdateProductDto updateProduct(ProductRequest productRequest);

	GetProductDto getProduct(Long long1);

	List<GetProductDto> getProducts();

	boolean deleteProduct(Long id);

}
