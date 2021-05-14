package b3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class DemSVThiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        int n;
        do{
            System.out.println("Nhap so luong sinh vien : ");
            n = sc.nextInt();
            if(n > 30){
                System.out.print("So luong phai nho hon 30 sinh vien!!!");
            }
        } while(n > 30);

        a = new int[n];
        int i = 0;
        while(i <  a.length){
            System.out.print("Nhap diem cho sinh vien " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            i++;

            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] >= 5 && a[j] <= 10){
                    count++;
                }
            }
            System.out.println("So luong sinh vien do ky thi la  : " + count);
        }
    }
}

