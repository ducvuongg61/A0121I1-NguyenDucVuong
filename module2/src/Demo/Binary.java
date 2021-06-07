package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {
    public int binarySort(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySort(arr, left, mid - 1, value);
            } else {
                return binarySort(arr, mid + 1, right, value);
            }
        }
    }

    public void sortArray(int[] arr) {
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
        System.out.println("Enter element array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Binary binary = new Binary();

        System.out.print("Search index in array : " );
        int number = sc.nextInt();
        System.out.println(binary.binarySort(arr,0,arr.length - 1,number));

        System.out.println("Sort array : ");
        binary.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
