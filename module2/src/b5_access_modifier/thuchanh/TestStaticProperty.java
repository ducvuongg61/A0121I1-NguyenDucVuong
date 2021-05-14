package b5_access_modifier.thuchanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car c1 = new Car("Mazada","Sakawi 3" );
        System.out.println(Car.numberOfCars);
        Car c2 = new Car("Mazada 6" , "Sakawi 6");
    }
}
