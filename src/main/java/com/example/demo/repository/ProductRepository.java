package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

/**
 *
 * @author rajko
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
