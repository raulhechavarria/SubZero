package com.subzero.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.subzero.controller.request.ProductRequest;
import com.subzero.service.ProductService;
import com.subzero.service.dto.GetProductDto;
import com.subzero.service.dto.SaveProductDto;
import com.subzero.service.dto.UpdateProductDto;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product", method = RequestMethod.POST) /// todo este metodo es un endpoint
	public @ResponseBody SaveProductDto saveProduct(@RequestBody ProductRequest productRequest) {
		return productService.saveProduct(productRequest);
		
	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	private UpdateProductDto updateProduct(@RequestBody ProductRequest productRequest) {
		return productService.updateProduct(productRequest);
	}
	
///	@RequestParam esperandno un parametro pero  a lo mejor en el body 
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	private GetProductDto getProduct(@PathVariable Integer id) {
		Long long1 = new Long(id);
		return productService.getProduct(long1);
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	private @ResponseBody List<GetProductDto> getProducts() {
		return productService.getProducts();
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteProduct(@PathVariable Long id) {
		return productService.deleteProduct(id);
	}

}
