package b7_Abstract_interface.baitap.Colorable;

public class Circle extends Shape implements Colorable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius =  " + getRadius() + " and Area = " + getArea() + ", which is subclass of " + super.toString();
    }


    @Override
    public void howToColor() {
        System.out.println("Hinh tron : to het hinh tron");
    }
}
