package com.example.fullstackcrudspringboot.repository;

import com.example.fullstackcrudspringboot.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
