package b19_String_Regex.baitap.phoneNumber;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumberValidation = "\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";
        System.out.println("Enter phone number (xx)-(0xxxxxxxxx) x is a number : ");
        String phoneNumber = sc.nextLine();

        if (phoneNumber.matches(phoneNumberValidation)) {
            System.out.println(phoneNumber + " is valid : true");
        } else {
            System.out.println(phoneNumber + " is valid : false");
        }
    }
}
