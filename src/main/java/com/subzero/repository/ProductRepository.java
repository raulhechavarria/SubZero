package com.subzero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.subzero.domian.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	
}
