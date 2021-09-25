package com.product.service;

import com.product.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static HashMap<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone", 42000000, "Smart Phone"));
        products.put(2, new Product(2, "Xiaomi", 25525551, "Smart Phone"));
        products.put(3, new Product(3, "Samsung", 15000000, "Smart Phone"));
        products.put(4, new Product(4, "Nokia", 3696000, "Smart Phone"));
        products.put(5, new Product(5, "Op", 12000000, "Smart Phone"));
        products.put(6, new Product(6, "Red mi", 36222200, "Smart Phone"));
    }

    @Override
    public List<Product> findAllProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
