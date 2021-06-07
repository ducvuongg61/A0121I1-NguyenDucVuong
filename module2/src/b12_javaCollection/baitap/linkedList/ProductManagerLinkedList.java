package b12_javaCollection.baitap.linkedList;

import b12_javaCollection.baitap.arrayList.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerLinkedList {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new LinkedList<>();

    static {
        productList.add(new Product(1, "Iphone", 12221, "Good"));
        productList.add(new Product(2, "SamSung", 36646, "Quite"));
        productList.add(new Product(3, "Nokia", 46998, "Not Good"));
        productList.add(new Product(4, "MacBook", 98874, "Very Good"));
        productList.add(new Product(5, "Dell", 11258, "Good"));
    }

    public static void menu() {
        int choice = -1;
        do {
            System.out.print("1.Add new product " +
                    "\n2.Show all product " +
                    "\n3.Edit product" +
                    "\n4.Delete product " +
                    "\n5.Search product " +
                    "\n6.Sort product " +
                    "\n7.Exit " +
                    "\nPlease enter choice : "
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }

    public static void addProduct() {
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
        System.out.print("Please enter nameProduct : ");
        String nameProduct = sc.nextLine();
        System.out.print("Please enter price : ");
        Double price = Double.parseDouble(sc.nextLine());
        System.out.print("Please enter description : ");
        String desc = sc.nextLine();

    }

    public static void showProduct() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
}
