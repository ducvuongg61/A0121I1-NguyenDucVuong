package b2_vong_lap.thuchanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so nguyen : ");
        n = sc.nextInt();
        if(n < 2){
            System.out.print(n + " khong phai la so nguyen to.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.print(n + " la so nguyen to.");
            } else {
                System.out.print(n + " khong phai la so nguyen to.");
            }
        }
    }
}
