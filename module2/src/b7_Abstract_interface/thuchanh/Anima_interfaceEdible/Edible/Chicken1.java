package b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Edible;

import b7_Abstract_interface.thuchanh.Anima_interfaceEdible.Animal.Animal;

public class Chicken1 extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck !";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
