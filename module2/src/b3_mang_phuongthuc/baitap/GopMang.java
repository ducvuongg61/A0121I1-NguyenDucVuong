package b3_mang_phuongthuc.baitap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int lenght = arr1.length + arr2.length;
        int [] result = new int [lenght];
        int pos = 0;
        for (int n : arr1) {
            result[pos] = n;
            pos++;
        }
        for (int n : arr2) {
            result[pos] = n;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
