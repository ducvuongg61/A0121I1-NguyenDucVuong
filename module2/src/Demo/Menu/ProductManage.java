package Demo.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    static List<Product> productList;
    static Scanner scanner = new Scanner(System.in); //static tao bien , phuong thuc , khoi , va class

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone", 100, "ABC"));
        productList.add(new Product(2, "SamSung", 100, "ABC"));
        productList.add(new Product(3, "Nokia", 100, "ABC"));
        productList.add(new Product(4, "MacBook", 100, "ABC"));
    }

    public static void menu() {
        int choice = -1;
        do {
            System.out.print("\n 1.Show all product " +
                    "\n 2.Add new product " +
                    "\n 3.Edit product " +
                    "\n 4.Search product " +
                    "\n 5.Delete product " +
                    "\n 6.Exit " +
                    "\n Please enter choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    break;
                case 5:
                    deleteProductById();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }

    public static void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void addProduct() {
//        System.out.println("Please enter id : ");
//        int id = scanner.nextInt();
        int id = -1;
        if (productList.isEmpty()) {
            id = 1;
        } else {
            id = productList.get(productList.size() - 1).getId() + 1;
        }
//        scanner.skip("\\R");
        System.out.println("Please enter name product : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Please enter price : ");
        double price = scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("Please enter description : ");
        String description = scanner.nextLine();
        Product product = new Product(id, nameProduct, price, description);
        productList.add(product);
    }

    public static void deleteProductById() {
        System.out.println("Please enter id product : ");
        int id = scanner.nextInt();
        scanner.skip("\\R"); //Tim hieu ham skip
        //xoa va them k nen dung foreach
        //Kiem tra xem id co trong list chua -> chua hien thi ra loi
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(id).getId()) { //ngang toi day giong ham EDIT // Hoi ban muon edit cai gi
                productList.remove(i);
                break;
            }
        }
    }

    public static void editProduct() {
        System.out.println("Please enter id product : ");
        int id = scanner.nextInt();
        scanner.skip("\\R");
        int choice = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(id).getId()) {
                System.out.println("Please enter property edit : " +
                        "\n 1. Name : " +
                        "\n 2. Price : " +
                        "\n 3. Description : " +
                        "\n 4. Back to menu : ");
                choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 1:
                        System.out.println("Please enter name : ");
                        String name = scanner.nextLine();
                        productList.get(i).setNameProduct(name);
                        break;
                    case 4:
                        menu();
                        break;
                    default:
                        System.out.println("Please again enter");
                }
            }
        }
    }
}