package b7_Abstract_interface.baitap.Colorable;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double size) {
        this.side = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.side = size;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with Side = " + getSide() + " and Area = " + getArea() + ", which is subclass of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Hinh vuong : to 4 canh");
    }
}
