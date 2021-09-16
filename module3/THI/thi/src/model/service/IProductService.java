package model.service;

import model.bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    public List<Product> selectAllProduct() throws SQLException;

    public Product selectProduct(int id_product) throws SQLException;

    public void insertProduct(Product product) throws SQLException;

    public boolean editProduct(Product product) throws SQLException;

    public boolean deleteProduct(int id_product) throws SQLException;
}
