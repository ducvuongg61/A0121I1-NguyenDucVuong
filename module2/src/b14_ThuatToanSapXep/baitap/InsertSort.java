package b14_ThuatToanSapXep.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void insertSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertSort = arr[i];
            int j = i -1;
            for (; j >= 0 && arr[j] >  insertSort ; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = insertSort;
        }
    }

    public static void printArray(int [] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array : ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        insertSort(arr);
        printArray(arr);
    }
}
