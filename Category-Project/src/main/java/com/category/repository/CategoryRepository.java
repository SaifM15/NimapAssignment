package com.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.category.entity.Category;

public interface CategoryRepository extends  JpaRepository<Category, Long> {

}
