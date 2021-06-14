package Demo;

import java.util.Arrays;

public class Sort1 {
    static void sort(int[] arr) { //sx noi bot
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    static void sort2(int[] arr) { // sx chon
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void sort3(int[] arr) { //sx chen
        for (int i = 1; i < arr.length; i++) {
            int insertion = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > insertion; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = insertion;
        }
    }

    static void sort4(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertion = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] < insertion; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = insertion;
        }
    }

    static void print(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] array = {6, 2, 9, 5, 3, 4, 7};
//        sort(array);
//        sort2(array);
//        sort3(array);
        sort4(array);
        print(array);
    }
}
