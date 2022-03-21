package com.manytoone.demo.domian.repository;

import com.manytoone.demo.domian.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByCategory(Long categoryId);

    Optional<Product> getProduct(Long productId);

    Product save(Product product);

    void delete(Long productId);
}
