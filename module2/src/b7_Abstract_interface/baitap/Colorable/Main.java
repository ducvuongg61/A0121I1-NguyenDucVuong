package b7_Abstract_interface.baitap.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = getRadomShape();
        }
        Shape.printShape(shapes);
        for (Shape a : shapes) {
            if(a instanceof Colorable){
                ((Colorable) a).howToColor();
            }
        }

    }

    private static Shape getRadomShape() {
        int random = (int) (Math.round(Math.random() * 2));
        switch (random){
            case 0:
                return new Square();
            case 1:
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
