package b1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        a = sc.nextDouble();

        System.out.println("Nhap b : ");
        b = sc.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double c = -(b/a);
            System.out.println("Phuong trinh co 1 nghiem la : " + c);
        }
    }
}
