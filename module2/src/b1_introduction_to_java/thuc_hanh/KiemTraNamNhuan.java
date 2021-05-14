package b1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam : ");
        year = sc.nextInt();

        if(((year % 100 == 0) &&(year % 400 == 0)) || ((year % 4 == 0) && (year % 100 != 0)) ){
            System.out.println("Nam " + year + " la nam nhuan.");
        } else {
            System.out.println("Khong phai nam nhuan.");
        }
    }
}
