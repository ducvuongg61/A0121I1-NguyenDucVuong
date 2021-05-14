package b3_mang_phuongthuc.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student : ");
        String input_name = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(input_name)){ //Ham equals() dung de kiem tra 2 toan hang co bang nhau hay k
                System.out.println("Position of the students in the list " + input_name + " is : " + (i +1));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
