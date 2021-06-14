package b12_javaCollection.baitap.arrayList;

import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int id;
    private String nameProduct;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String description) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID : " + id + " , NameProduct : " + nameProduct + " , Price : " + price + " , Description : " + description;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
