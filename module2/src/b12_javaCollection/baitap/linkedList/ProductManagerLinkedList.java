package b12_javaCollection.baitap.linkedList;

import b12_javaCollection.baitap.arrayList.Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerLinkedList {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new LinkedList<Product>();

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
                    editProductById();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProduct();
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
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Please enter description : ");
        String desc = sc.nextLine();
        Product product = new Product(id, nameProduct, price, desc);
        productList.add(product);
    }

    public static void showProduct() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static boolean checkId(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void editProductById() {
        System.out.print("Please enter id product : ");
        int id = Integer.parseInt(sc.nextLine());
        int choice = -1;
        if (checkId(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    System.out.print("1.Edit nameProduct" +
                            "\n2.Edit Price" +
                            "\n3.Edit Description" +
                            "\n4.Back to menu");
                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new nameProduct : ");
                            String nameProduct = sc.nextLine();
                            productList.get(i).setNameProduct(nameProduct);
                            break;
                        case 2:
                            System.out.println("Enter new Price : ");
                            double price = sc.nextDouble();
                            productList.get(i).setPrice(price);
                            break;
                        case 3:
                            System.out.print("Enter new description : ");
                            String des = sc.nextLine();
                            productList.get(i).setDescription(des);
                            break;
                        case 4:
                            menu();
                            break;
                        default:
                            System.out.println("Please choice again");
                    }
                }
            }
        } else {
            System.out.println("Element not found");
            editProductById();
        }
    }

    public static void searchProduct() {
        System.out.print("Enter id you need search : ");
        int id = Integer.parseInt(sc.nextLine());
        if (checkId(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    System.out.println(productList.get(i).toString());
                    break;
                }
            }
        } else {
            System.out.println("Element not found id!!!");
            menu();
        }
    }

    public static void deleteProduct() {
        System.out.print("Enter id you need delete : ");
        int id = Integer.parseInt(sc.nextLine());
        if (checkId(id)) {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()) {
                    productList.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("Not found id!!!!");
            menu();
        }
    }

    public static void sortProduct() {
        Product product = new Product();
        productList.sort(product);
        for (Product product1 : productList) {
            System.out.println(product1.toString());
        }
    }
}
