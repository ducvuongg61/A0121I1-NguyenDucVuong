package b11_DSA_stack_queue.optional.baitap;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        String reverseString = "";

        while (!stack.isEmpty()) {
//            reverseString += reverseString + stack.pop();
            reverseString = String.format("%s%s", reverseString, stack.pop());
        }
        if (string.equals(reverseString))
            System.out.println("Day la chuoi doi xung");
        else
            System.out.println("Day la chuoi khong doi xung");
    }
}

