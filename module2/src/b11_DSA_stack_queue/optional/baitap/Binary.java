package b11_DSA_stack_queue.optional.baitap;

import java.util.Stack;

public class Binary {
    public void converseBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 14;
        System.out.print("He nhi phan cua so " + decimalNumber + " la : ");
        new Binary().converseBinary(decimalNumber);
    }
}
