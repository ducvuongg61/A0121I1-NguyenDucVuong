package Demo;

import java.util.Scanner;

public class Array {
    public static int search(int n, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                n = i;
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao so luong mang : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Nhap phan tu can tim : ");
        int b = sc.nextInt();

        System.out.println(search(b,arr));
    }
}
