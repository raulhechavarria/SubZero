package com.subzero.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subzero.controller.request.ProductRequest;
import com.subzero.domian.entity.Product;
import com.subzero.repository.ProductRepository;
import com.subzero.service.ProductService;
import com.subzero.service.assembler.ProductAssembler;
import com.subzero.service.dto.GetProductDto;
import com.subzero.service.dto.SaveProductDto;
import com.subzero.service.dto.UpdateProductDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public SaveProductDto saveProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setCategory(productRequest.getCategory());
		product.setImage(productRequest.getImage());
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
//		product.setUnitsMeasurement(productRequest.getUnitsMeasurement());
		productRepository.save(product);

		SaveProductDto saveProductDto = ProductAssembler.saveProduct(product);
		return saveProductDto;
	}

	@Override
	public UpdateProductDto updateProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setId(productRequest.getId());
		product.setCategory(productRequest.getCategory());
		product.setImage(productRequest.getImage());
		product.setName(productRequest.getName());
		product.setPrice(productRequest.getPrice());
//		product.setUnitsMeasurement(productRequest.getUnitsMeasurement());
		productRepository.save(product);

		UpdateProductDto updateProductDto = ProductAssembler.updateProduct(product);
		return updateProductDto;
	}

	@Override
	public GetProductDto getProduct(Long long1) {
		Product product = productRepository.findById(long1).get();
		GetProductDto getProductDto = ProductAssembler.getProductDto(product);
		return getProductDto;
	}

	@Override
	public List<GetProductDto> getProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		List<GetProductDto> getProductDtos = new ArrayList<>(products.size());
		for (Product product : products) {
			GetProductDto getProductDto = ProductAssembler.getProductDto(product);
			getProductDtos.add(getProductDto);
		}
		return getProductDtos;
	}

	@Override
	public boolean deleteProduct(Long id) {
		if (productRepository.findById(id).isPresent()) {
			productRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

}
