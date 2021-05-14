package b3_mang_phuongthuc.baitap;

import java.util.Scanner;

public class ThemXoaChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        inputArray(a, sc);
        showArray(a);
//        insertArray(a, sc, n);
//        deleteArray(a,sc,n);
        addArray(a,sc);
    }

    public static void inputArray(int b[], Scanner sc) {
        for (int i = 0; i < b.length; i++) {
            System.out.print("Phan tu thu [" + i + "] la : ");
            b[i] = sc.nextInt();
        }
    }

    public static void showArray(int b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("Phan tu thu [" + i + "] : " + b[i]);
        }
    }

    public static void insertArray(int b[], Scanner sc, int m) {
        int position = 0, num = 0;
        System.out.print("Nhap vi tri can chen : ");
        position = sc.nextInt();
        if (position <= 0 || position >= m) {
            System.out.println("Vi tri chen khong co trong mang!!!");
        } else {
            System.out.print("Nhap so can chen : ");
            num = sc.nextInt();
            for (int i = b.length - 1; i > position; i--) {
                b[i] = b[i - 1];
            }
            b[position] = num;

            System.out.println("Them " + num + " vao vi tri " + position + " la : ");
            for (int i = 0; i < b.length; i++) {
                System.out.println("Phan tu thu [" + i + "] : " + b[i]);
            }
        }
    }

    public static void deleteArray(int b[], Scanner sc, int m) {
        System.out.print("Nhap phan so phan tu can xoa : ");
        int k = sc.nextInt();
        int index;
        for (int i = index = 0; i < m; i++) {
            if (b[i] != k) {
                b[index] = b[i];
                index++;
            }
        }
        m = index;

        System.out.println("Phan tu con lai trong mang khi xoa " + k + " la : ");
        for (int i = 0; i < m; i++) {
            System.out.println("Phan tu thu [" + i + "] la : " + b[i] + "\t");
        }
    }

    public static void addArray(int[] b, Scanner sc) {
        System.out.print("Nhap gia tri can them : ");
        int a = sc.nextInt();
        int[] a2 = new int[b.length + 1];
        for (int i = 0; i < a2.length; i++) {
            if (i == (a2.length - 1)) {
                a2[i] = a;
                break;
            }
            a2[i] = b[i];
        }
        System.out.println("Mang sau khi them ");
        showArray(a2);
    }
}
