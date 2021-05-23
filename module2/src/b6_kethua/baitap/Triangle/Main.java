package b6_kethua.baitap.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap side 1 : ");
        double side1 = sc.nextDouble();

        System.out.print("Nhap side 2 : ");
        double side2 = sc.nextDouble();

        System.out.print("Nhap side 3 : ");
        double side3 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Nhap mau : ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(side1 ,side2 ,side3);
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}
