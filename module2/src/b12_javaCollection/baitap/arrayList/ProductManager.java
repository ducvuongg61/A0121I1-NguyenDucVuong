package b12_javaCollection.baitap.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Product> productList;
    static Scanner sc = new Scanner(System.in);

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone", 125520, "ABC"));
        productList.add(new Product(2, "Nokia", 136625, "BCA"));
        productList.add(new Product(3, "SamSung", 360021, "CBA"));
        productList.add(new Product(4, "Xiaomi", 450012, "KAK"));
        productList.add(new Product(5, "RedMi", 12551, "MNA"));
    }

    public static void menu() {
        int choice = -1;
        do {
            System.out.print("1.Add new product " +
                    "\n 2.Show all product " +
                    "\n 3.Edit product " +
                    "\n 4.Delete product " +
                    "\n 5.Search product " +
                    "\n 6.Sort product " +
                    "\n 7.Exit " +
                    "\n Please enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    sortProductByPrice();
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
        System.out.print("Please enter name product : ");
        String nameProduct = sc.nextLine();
        System.out.print("Please enter price product : ");
        double price = sc.nextDouble();
        sc.skip("\\R");
        System.out.print("Please enter description : ");
        String description = sc.nextLine();
        Product product = new Product(id, nameProduct, price, description);
        productList.add(product);
    }

    public static void showProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void editProduct() {
        System.out.print("Please enter id : ");
        int id = sc.nextInt();
        sc.skip("\\R");
        int choice = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(id).getId()) {
                System.out.println("Please enter property edit : " +
                        "\n 1.NameProduct" +
                        "\n 2.Price" +
                        "\n 3.Description" +
                        "\n 4.Back to menu"
                );
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter new nameProduct : ");
                        String nameProduct = sc.nextLine();
                        productList.get(i).setNameProduct(nameProduct);
                        break;
                    case 2:
                        System.out.print("Enter new price : ");
                        double price = Double.parseDouble(sc.nextLine());
                        productList.get(i).setPrice(price);
                        break;
                    case 3:
                        System.out.println("Enter new description : ");
                        String des = sc.nextLine();
                        productList.get(i).setDescription(des);
                        break;
                    case 4:
                        menu();
                        break;
                }
            }
        }
    }

    public static void deleteProduct() {
        System.out.print("Enter id you need delete : ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(id).getId()) {
                productList.remove(i);
                break;
            }
        }
    }

    public static void searchProduct() {
        System.out.print("Enter id you need search : ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println(productList.get(i).toString());
                break;
            }
        }
    }

    public static void sortProductByPrice() {
        Product product = new Product();
        productList.sort(product);
        for (Product pt : productList) {
            System.out.println(pt.toString());
        }
    }
}
