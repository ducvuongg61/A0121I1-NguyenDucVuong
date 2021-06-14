package b15_exception.thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolvers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter b : ");
        double b = Double.parseDouble(sc.nextLine());

        if(a != 0){
            double solution = (-b)/a;
            System.out.println("The solution is : " + solution);
        }
        else {
            if(b == 0){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.print("No solution!");
            }
        }
    }
}
