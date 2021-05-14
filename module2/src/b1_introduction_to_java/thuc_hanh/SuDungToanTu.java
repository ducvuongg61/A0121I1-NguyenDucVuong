package b1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float height;
        float width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");
        height = sc.nextFloat();

        System.out.print("Enter width: ");
        width = sc.nextFloat();

        float area = height * width;
        System.out.print("Area is : " + area);
    }
}
