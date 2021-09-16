package model.service;

import model.bean.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {

    public ProductService() {
    }

    private String jdbcURL = "jdbc:mysql://localhost:3306/product";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<Product> selectAllProduct() throws SQLException {
        String query = "call selectAllProduct();";
        List<Product> listProduct = new ArrayList<>();
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            System.out.println(callableStatement);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("product_name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                listProduct.add(new Product(id, product_name, price, quantity, color, category));
            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }
        return listProduct;
    }

    @Override
    public Product selectProduct(int id_product) throws SQLException {
        Product product = null;
        String query = "call selectProductByID(?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setInt(1, id_product);
            System.out.println(callableStatement);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                String product_name = rs.getString("product_name");
                Double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                product = new Product(product_name, price, quantity, color, category);
            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }
        return product;
    }

    @Override
    public void insertProduct(Product product) throws SQLException {
        String query = "call insertProduct(?,?,?,?,?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setString(1, product.getProduct_name());
            callableStatement.setDouble(2, product.getPrice());
            callableStatement.setInt(3, product.getQuantity());
            callableStatement.setString(4, product.getColor());
            callableStatement.setString(5, product.getCategory());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        } catch (SQLException exception) {
            printSQLException(exception);
        }
    }

    @Override
    public boolean editProduct(Product product) throws SQLException {
        boolean rowEdit;
        String query = "call editProduct(?,?,?,?,?,?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setString(1, product.getProduct_name());
            callableStatement.setDouble(2, product.getPrice());
            callableStatement.setInt(3, product.getQuantity());
            callableStatement.setString(4, product.getColor());
            callableStatement.setString(5, product.getCategory());
            callableStatement.setInt(6, product.getId());
            rowEdit = callableStatement.executeUpdate() > 0;
        }
        return rowEdit;
    }

    @Override
    public boolean deleteProduct(int id_product) throws SQLException {
        boolean rowDelete;
        String query = "call deleteProduct(?);";
        try (Connection connection = getConnection(); CallableStatement callableStatement = connection.prepareCall(query)) {
            callableStatement.setInt(1, id_product);
            rowDelete = callableStatement.executeUpdate() > 0;
        }
        return rowDelete;
    }

    public List<Product> searchByName(String name) throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        Product product = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM management_product where product_name = ?")) {
            preparedStatement.setString(1, name);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("product_name");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                product = new Product(id, product_name, price, quantity, color, category);
                listProduct.add(product);
            }
        } catch (SQLException exception) {
            printSQLException(exception);
        }
        return listProduct;
    }

    private void printSQLException(SQLException exception) {
        for (Throwable e : exception) {
            if (e instanceof SQLException) {
                System.out.println("SQLState : " + ((SQLException) exception).getSQLState());
                System.out.println("Error Code : " + ((SQLException) exception).getErrorCode());
                System.out.println("Message : " + ((SQLException) exception).getMessage());
                Throwable t = exception.getCause();
                while (t != null) {
                    t = t.getCause();
                }
            }
        }
    }
}
