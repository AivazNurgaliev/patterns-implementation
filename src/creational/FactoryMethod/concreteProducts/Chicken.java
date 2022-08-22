package creational.FactoryMethod.concreteProducts;

import creational.FactoryMethod.product.Animal;

public class Chicken implements Animal {

    @Override
    public void voice() {
        System.out.println("Cluck... Cluck Cluck... Cluck");
    }

    @Override
    public void numberOfPaws() {
        System.out.println("Chicken has 2 paws");
    }
}
