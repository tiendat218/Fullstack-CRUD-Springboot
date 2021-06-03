package com.example.fullstackcrudspringboot.service;

import com.example.fullstackcrudspringboot.jpa.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class ProductService {
    private final ProductService productService;


    public ProductService(ProductService productService) {
        this.productService = productService;
    }
    public List<Product> findAll(){return productService.findAll();}
    public Optional<Product> findById(Long id) {return productService.findById(id);}
    public Product save(Product stock){return productService.save(stock);}
    public void deleteById(Long id){productService.deleteById(id);}
}
