package b3_mang_phuongthuc.baitap;

import java.util.Scanner;

public class Tong1Cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua mang : ");
        int d = sc.nextInt();
        System.out.print("Nhap so cot cua mang : ");
        int c = sc.nextInt();
        int [][] arr1 = new int[d][c];

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Nhap phan tu thu arr[" + i + "][" + j + "] : ");
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Phan tu thu arr[" + i + "][" + j + "] : " + arr1[i][j]);
            }
        }
        
        System.out.println("Nhap so cot can tinh tong : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i][a];
            }
        System.out.println("Tong cac so o cot " + a + " la : " + sum );
        }
    }

