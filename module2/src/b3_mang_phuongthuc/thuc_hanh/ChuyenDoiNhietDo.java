package b3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int choice = -1;
        double f;
        double c;
        while (choice != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit : ");
                    f = sc.nextDouble();
                    System.out.println("Celsius is : " + fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    c = sc.nextDouble();
                    System.out.println("Fahrenheit is : " + celsiusToFahrenheit(c));;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
                    break;
            }
        }
    }

    public static double celsiusToFahrenheit(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double fahrenheitToCelsius(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
