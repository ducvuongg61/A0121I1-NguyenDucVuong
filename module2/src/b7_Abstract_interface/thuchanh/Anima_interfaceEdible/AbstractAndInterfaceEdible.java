package b7_Abstract_interface.thuchanh.Anima_interfaceEdible;

import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Animal.Animal;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Animal.Chicken;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Animal.Tiger;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Edible.Chicken1;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Edible.Edible;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Fruit.Apple;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Fruit.Fruit;
import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Fruit.Orange;

public class AbstractAndInterfaceEdible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken1){
                Edible edible = (Chicken1) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
