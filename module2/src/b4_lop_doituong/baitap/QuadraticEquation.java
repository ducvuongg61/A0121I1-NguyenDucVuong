package b4_lop_doituong.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a ,b, c;

    public QuadraticEquation(int a, int b, int c) {
    }

    public QuadraticEquation(double a, double b, double c, double discriminant, double root1, double root2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return (float) (2 * b - 4 * a * c);
    }

    public double getR1(){
        return ((-this.getB())+(Math.sqrt(this.getB()*this.getB() + 4 *this.getA() * this.getC())) / (2 * this.getA()));
    }

    public double getR2(){
        return ((-b)-(Math.sqrt(b*b + 4 *a * c)) / (2 * a));
    }

    public double getN1(){
        return (-b/(2*a));
    }

    public double getRoot1(){
        if(this.getDiscriminant() > 0){
            System.out.println("Phuong trinh co 2 nghiem la : " + (double)this.getR1() + " va " + (double)this.getR2()); // NaN vs NaN
        }
        else if(this.getDiscriminant() == 0){
            System.out.println("Phuong trinh co 1 nghiem la : " + this.getN1());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
        return this.getDiscriminant();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac so");
        System.out.print("Nhap a : ");
        int a =  Integer.parseInt(sc.nextLine());
        System.out.print("Nhap b : ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap c : ");
        int c = Integer.parseInt(sc.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        System.out.println(equation.getDiscriminant());
    }
}
