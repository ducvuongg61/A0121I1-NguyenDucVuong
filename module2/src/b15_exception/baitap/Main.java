package b15_exception.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1:");
        Double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        Double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        Double side3 = scanner.nextDouble();
        try {
            if (checkSide(side1, side2, side3)){
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println(triangle.toString());
            }
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkSide(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Not the value of the three sides of the triangle ");
        } else {
            return true;
        }

    }
}
