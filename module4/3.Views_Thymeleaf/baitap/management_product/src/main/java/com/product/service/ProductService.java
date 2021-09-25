package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    void save(Product product);

    Product findById(int id);

    void update(int id ,Product product);

    void delete(int id);
}
