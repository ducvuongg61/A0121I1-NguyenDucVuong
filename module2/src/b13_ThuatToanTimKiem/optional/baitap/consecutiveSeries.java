package b13_ThuatToanTimKiem.optional.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class consecutiveSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<Character>();
        LinkedList<Character> list = new LinkedList<Character>();

        //Prompt the user to enter a string
        System.out.print("Enter a string : ");
        String string = sc.nextLine();

        //Find the maximum consecutive increasingly ordered substring
        for (int i = 0; i < string.length(); i++) {
            if(list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){
                list.clear(); //Simple statement
            }

            list.add(string.charAt(i)); //Simple statement

            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        //Display the maximum consecutive
        //Increasingly ordered substring

        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
