package com.manytoone.demo.domian.service;

import com.manytoone.demo.domian.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    Optional<List<Product>> getByCategory(Long categoryId);

    Optional<Product> getProduct(Long productId);

    Product save(Product product);

    Boolean delete(Long productId);
}
