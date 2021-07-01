package THI.main;

import THI.product.ExportProducts;
import THI.product.ImportedProducts;
import THI.product.Product;
import THI.writeCSV.Comma;
import THI.writeCSV.WriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainControllers {
    static Scanner sc = new Scanner(System.in);
    public static final String ExportProducts = "ExportProducts";
    public static final String ImportedProducts = "ImportedProducts";

    public static void main(String[] args) {
        MainControllers.displayMenu();
    }


    private static void displayMenu() {
        int choice = -1;
        do {
            System.out.println("1.Add new" +
                    "\n2.Delete" +
                    "\n3.View product list" +
                    "\n4.Search" +
                    "\n5.Exit");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    viewProduct();
                    break;
                case 4:
                    searchProduct();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayMenu();
            }
        } while (true);
    }

    private static void searchProduct() {

    }

    private static void viewProduct() {
        int choice = -1;
        do {
            System.out.println("1.Show ExportProduct" +
                    "\n2.Show ImportedProduct" +
                    "\n3.Exit");
            System.out.print("Please enter your choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showAllProduct(ExportProducts);
                    displayMenu();
                    break;
                case 2:
                    showAllProduct(ImportedProducts);
                    displayMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Fail !! You must choice again..");
                    sc.nextLine();
                    addNewProduct();
            }
        } while (true);
    }

    private static void showAllProduct(String fileName) {
        System.out.println("---------------------------------");
        System.out.println("List Product : ");
        List<Product> listOfProduct = readAllProduct(fileName);
        Product product = null;

        for (int i = 0; i < listOfProduct.size(); i++) {
            product = listOfProduct.get(i);
            product.showInfo();
        }
    }

    private static void deleteProduct() {
    }

    private static void addNewProduct() {
        int choice = -1;
        do {
            System.out.println("1.Add new ExportProducts" +
                    "\n2.Add new ImportedProducts" +
                    "\n3.Exit");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addAllNewProduct(ExportProducts);
                    displayMenu();
                    break;
                case 2:
                    addAllNewProduct(ImportedProducts);
                    displayMenu();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.print("Fail!! You can choice again... : ");
                    sc.nextInt();
                    displayMenu();
            }
        } while (true);
    }

    private static void addAllNewProduct(String fileName) {
        System.out.print("Enter id product : ");
        String idProduct = sc.nextLine();

        System.out.print("Enter code product : ");
        String codeProduct = sc.nextLine();


        System.out.print("Enter name product : ");
        String nameProduct = sc.nextLine();

        System.out.print("Enter price : ");
        String price = sc.nextLine();

        System.out.print("Enter amount : ");
        int amount = Integer.parseInt(sc.nextLine());

        System.out.print("Enter producer : ");
        String producer = sc.nextLine();

        WriteCSV.setFullPathFile(fileName);

        if (fileName.equals(ImportedProducts)) {
            System.out.print("Enter importPrices ");
            double importPrices = Double.parseDouble(sc.nextLine());

            System.out.print("Enter importProvince : ");
            String importProvince = sc.nextLine();

            System.out.print("Enter importTax : ");
            double importTax = Double.parseDouble(sc.nextLine());

            WriteCSV.writeFile(new String[]{idProduct, codeProduct, nameProduct, String.valueOf(price), String.valueOf(amount), producer, String.valueOf(importPrices), importProvince, String.valueOf(importTax)});
        } else if (fileName.equals(ExportProducts)) {
            System.out.print("Enter exportPrice : ");
            double exportPrice = Double.parseDouble(sc.nextLine());

            System.out.print("Enter countryOfEntry : ");
            String countryOfEntry = sc.nextLine();
            WriteCSV.writeFile(new String[]{idProduct, codeProduct, nameProduct, String.valueOf(price), String.valueOf(amount), producer, String.valueOf(exportPrice), countryOfEntry});
        }
    }

    public static List<Product> readAllProduct(String fileName) {
        WriteCSV.setFullPathFile(fileName);
        List<String> propertiesProduct = WriteCSV.readFile();
        List<Product> listOfProduct = new ArrayList<>();

        String[] propertiesElement = null;
        Product product = null;

        for (String properties : propertiesProduct) {
            propertiesElement = properties.split(Comma.COMMA);

            if (fileName.equals(ExportProducts)) {
                product = new ExportProducts();

                ((ExportProducts) product).setExportPrice(Double.parseDouble(propertiesElement[6]));
                ((ExportProducts) product).setCountryOfEntry(propertiesElement[7]);

            } else if (fileName.equals(ImportedProducts)) {
                product = new ImportedProducts();
                ((ImportedProducts) product).setImportPrices(Double.parseDouble(propertiesElement[6]));
                ((ImportedProducts) product).setImportProvince(propertiesElement[7]);
                ((ImportedProducts) product).setImportTax(Double.parseDouble(propertiesElement[8]));
            }

            product.setIdProduct(propertiesElement[0]);
            product.setCodeProduct(propertiesElement[1]);
            product.setNameProduct(propertiesElement[2]);
            product.setPrice(Double.parseDouble(propertiesElement[3]));
            product.setAmount(Integer.parseInt(propertiesElement[4]));
            product.setProducer(propertiesElement[5]);

            listOfProduct.add(product);
        }
        return listOfProduct;
    }

}
