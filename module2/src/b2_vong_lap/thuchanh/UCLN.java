package b2_vong_lap.thuchanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        a = Math.abs(a); // Su dung ham abs() de tra ve gia tri tuyet doi
        b = Math.abs(b); // Su dung ham abs() de tra ve gia tri tuyet doi
        if(a == 0 || b == 0){
            System.out.println("No greatest common factor");
        }
        while(a != b){
            if( a > b){
                a = a -b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor : " + a);
    }
}
