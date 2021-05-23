package b7_Abstract_interface.baitap.Resizeable;

import b6_kethua.thuchanh.Circle;
import b6_kethua.thuchanh.Rectangle;
import b6_kethua.thuchanh.Shape;
import b6_kethua.thuchanh.Square;

public class Run {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x,"yellow" ,false);
        shapes[1] = new Rectangle(x,x,"Blue",false);
        shapes[2] = new Square(x,"Red",true);
        for (Shape a : shapes) {
            System.out.println(a);
        }

        for (Shape a : shapes) {
            a.resize(Math.random()* 100);
        }

        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
