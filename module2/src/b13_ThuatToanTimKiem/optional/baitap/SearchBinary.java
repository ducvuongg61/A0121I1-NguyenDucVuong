package b13_ThuatToanTimKiem.optional.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinary {
    public int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, left, mid - 1, value);
            } else {
                return binarySearch(arr, mid + 1, right, value);
            }
        }
    }

    public void binarySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Element in array");

        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        SearchBinary searchBinary = new SearchBinary();
        System.out.print("Search index in array : ");
        int index = sc.nextInt();
        System.out.println("Index " + index + " in array is : " + searchBinary.binarySearch(arr,0,arr.length -1,index ));
        System.out.println("Sort array");
        searchBinary.binarySort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
