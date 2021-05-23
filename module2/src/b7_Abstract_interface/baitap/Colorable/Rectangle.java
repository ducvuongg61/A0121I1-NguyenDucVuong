package b7_Abstract_interface.baitap.Colorable;

public class Rectangle extends  Shape {
    private double height = 1.0;
    private double width = 1.0;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * this.getHeight();
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and Height = " + getHeight() + " and Area = " + getArea() + ", which is subclass of " + super.toString();
    }
}
