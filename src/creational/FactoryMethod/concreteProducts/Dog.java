package creational.FactoryMethod.concreteProducts;

import creational.FactoryMethod.product.Animal;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Bark... Bark Bark... Bark");
    }

    @Override
    public void numberOfPaws() {
        System.out.println("Dog has 4 paws");
    }
}
