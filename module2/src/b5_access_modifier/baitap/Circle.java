package b5_access_modifier.baitap;

public class Circle {
    private double radius  = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Radius = " + radius + " ; Area = " + getArea() + "; Color =  " + color ;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getArea());

        Circle c1 = new Circle(6 , "Red");
        System.out.println(c1);
    }
}
