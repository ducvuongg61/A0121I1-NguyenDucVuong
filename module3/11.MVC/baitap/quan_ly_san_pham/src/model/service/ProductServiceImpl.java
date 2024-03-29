package model.service;

import model.bean.Product;
import model.repository.IProductRepository;
import model.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService {

    private IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void view(int id) {
        productRepository.view(id);
    }
}
