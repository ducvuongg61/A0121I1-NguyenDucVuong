package b6_kethua.baitap.Circle;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return (getArea() * this.height);
    }

    @Override
    public String toString() {
        return "Area = " + getArea() + " Height = " + getHeight() + " Volume = " + getVolume();
    }
}
