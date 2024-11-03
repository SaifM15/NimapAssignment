package com.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.category.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
