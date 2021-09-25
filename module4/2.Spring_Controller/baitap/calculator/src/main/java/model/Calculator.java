package model;

public class Calculator {
    private double numberA;
    private double numberB;
    private String operator;

    public Calculator() {
    }

    public Calculator(double numberA, double numberB, String operator) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.operator = operator;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double result() {
        double result = 0;
        switch (operator) {
            case "Addition(+)":
                result = this.numberA + this.numberB;
                break;
            case "Subtraction(-)":
                result = this.numberA - this.numberB;
                break;
            case "Multiplication(+)":
                result = this.numberA * this.numberB;
                break;
            case "Division(/)":
                result = this.numberA / this.numberB;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(1 , 2 ,"Addition(+)");
        System.out.println(calculator.result());
    }
}
