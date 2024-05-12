package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Product;

public interface ProductInfo extends JpaRepository<Product, Long> {
	
}
