package Demo.tryCatch;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int side1 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b : ");
        int side2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap c : ");
        int side3 = Integer.parseInt(sc.nextLine());

//        if ((side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)) {
//            System.out.println("Day la mot hinh tam giac");
//        }
//        throw new IllegalTriangleException("Day khong phai la tam giac");

    }


}
