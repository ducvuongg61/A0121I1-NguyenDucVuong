package b16_IO.optional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap duong dan file : ");
        Scanner sc = new Scanner(System.in);
        String pathFile = sc.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(pathFile);
    }
}
