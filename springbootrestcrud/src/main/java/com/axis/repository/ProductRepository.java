package com.axis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	Optional<Product> findbyName(String name);
	List<Product> findbycategory(String category);

}
