package b2_vong_lap.baitap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while(choice != 0){
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("0.Exit");
            System.out.println("Enter a number : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    for(int i = 0 ; i < 4; i++){
                        for (int j = 0; j < 6; j++){
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for(int i = 7; i >= 1; i--){
                        for(int j = 1 ; j <= i ; j++){
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    for(int i = 1; i <= 7 ; i++){
                        for(int j = 1 ; j <= i ; j++){
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error Number!!!");
                    break;
            }
        }
    }
}
