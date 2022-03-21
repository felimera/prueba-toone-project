package com.manytoone.demo.domian.service;

import com.manytoone.demo.domian.Product;
import com.manytoone.demo.domian.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Optional<List<Product>> getByCategory(Long categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    @Override
    public Optional<Product> getProduct(Long productId) {
        return productRepository.getProduct(productId);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Boolean delete(Long productId) {
        return getProduct(productId).map(product -> {
            productRepository.delete(productId);
            return Boolean.TRUE;
        }).orElse(Boolean.FALSE);
    }
}
