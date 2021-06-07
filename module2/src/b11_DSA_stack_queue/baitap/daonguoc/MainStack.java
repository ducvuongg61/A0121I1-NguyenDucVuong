package b11_DSA_stack_queue.baitap.daonguoc;

import java.util.Scanner;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element a[" + i + "] : ");
            arr[i] = sc.nextInt();
            stack.push(arr[i]);
        }

        System.out.print("Reverse number is : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }


        System.out.println();

        sc.nextLine();
        System.out.print("Enter string: ");
        String mWord = sc.nextLine();

        Stack<Character> wStack = new Stack<>();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));

        }

        System.out.print("Reverse string is : ");
        while (!wStack.isEmpty()) {
            System.out.print(wStack.pop());
        }
    }
}
