package b15_exception.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class CreateRandom {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] integers = new Integer[100];
        System.out.println("DANH SACH PHAN TU CUA MANG :");
        for (int i = 0; i < 100; i++) {
            integers[i] = random.nextInt(100);
            System.out.println(integers[i] + " ");
        }
        return integers;
    }

    public static void main(String[] args) {
        CreateRandom arrExample = new CreateRandom();
        Integer[] arr = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
