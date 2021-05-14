package b6_kethua.baitap.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle cr = new Circle();
//        System.out.println(cr); //Chua gan gia tri cho no nen gia tri bang 0 trong class Circle

        cr = new Circle(3.5,"RED");
        System.out.println(cr);

        Cylinder cy = new Cylinder();
//        System.out.println(cy); //Chua gan gia tri cho no nen gia tri bang 0 trong class Cylinder

        cy = new Cylinder(3.5 , "Red" , 6);
        System.out.println(cy);
    }
}
