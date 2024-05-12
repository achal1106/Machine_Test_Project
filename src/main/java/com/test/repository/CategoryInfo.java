package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Category;

public interface CategoryInfo extends JpaRepository<Category, Long> {
	
}
