package b2_vong_lap.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AutoSoNguyenTo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        int n = 2;
        while (n <= num) {
            if (checkPrime(n)) {
                System.out.print(n + " ");
            }
            n++;
        }

    }

    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
