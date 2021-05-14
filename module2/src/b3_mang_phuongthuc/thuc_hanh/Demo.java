package b3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        inputArray(arr, sc);
        showArray(arr);
        System.out.println("Max is : " + maxArray(arr));
        System.out.println("Sum is : " + sumArray(arr));
    }

    static void inputArray(int a[], Scanner sc) {
        System.out.println("Import elements into array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("arr[%d] : ", i);
            a[i] = sc.nextInt();
        }
    }

    static void showArray(int b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, b[i]);
        }
    }

    public static int maxArray(int c[]) {
        int max = c[0];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }
        return max;
    }

    public static int sumArray(int d[]) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum;
    }
}
