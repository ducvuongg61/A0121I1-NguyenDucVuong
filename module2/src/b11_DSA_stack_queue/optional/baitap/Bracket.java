package b11_DSA_stack_queue.optional.baitap;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
//        String string = "s * (s – a) * (s – b) * (s – c)";
//        String string = "(– b + (b2 – 4*a*c)^0.5) / 2*a  ";
        String string = "s * (s – a) * (s – b * (s – c)";
        for (int i = 0; i < string.length(); i++) {
            char check = string.charAt(i);
            if (check == '(') {
                stack.push(string.charAt(i));
            }
            if (check == ')') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Well");
        } else {
            System.out.println("Not well");
        }
    }
}
