package b3_mang_phuongthuc.baitap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dong va cot : ");
        int dc = sc.nextInt();
        int [][] arr = new int[dc][dc];
        int sum = 0;

        System.out.println("NHAP CAC PHAN TU TRONG MA TRAN MANG 2 CHIEU");
        for (int i = 0; i < dc; i++) {
            for (int j = 0; j < dc; j++) {
                System.out.print("A[" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("CAC PHAN TU TRONG MANG 2 CHIEU LA :");
        for (int i = 0; i < dc; i++) {
            for (int j = 0; j < dc; j++) {
                System.out.println("A[" + i + "][" + j + "] : " + arr[i][j]);
            }
        }

        for (int i = 0; i < dc; i++) {
            for (int j = 0; j < dc; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.print("Tong cac phan tu nam tren duong cheo la : " + sum);
    }
}
