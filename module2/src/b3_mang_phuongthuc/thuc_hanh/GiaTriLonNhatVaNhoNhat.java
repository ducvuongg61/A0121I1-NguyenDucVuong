package b3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class GiaTriLonNhatVaNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        inputArray(a,sc);
        showArray(a);
        System.out.println("Tong cua cac phan tu trong mang la : " + sumArray(a));
        System.out.println("Phan tu lon nhat la : " + maxArray(a));
        System.out.println("Phan tu nho nhat la : " + minArray(a));
    }

    public static void inputArray(int b[], Scanner sc){
        for (int i = 0; i < b.length; i++) {
            System.out.print("Nhap phan tu thu arr[" + i + "]:"  );
            b[i] = sc.nextInt();
        };
    }

    public  static void showArray(int b[]){
        for (int i = 0; i < b.length; i++) {
            System.out.println("arr[" + i + "] : " + b[i]);
        }
    }

    public static int sumArray(int b[]){
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public  static  int maxArray(int b[]){
        int max = b[0];
        for (int i = 0; i < b.length; i++) {
            if(b[i] > max){
                max = b[i];
            }
        }
        return max;
    }

    public static int minArray(int b[]){
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if(b[i] < min){
                min = b[i];
            }
        }
        return min;
    }
}
