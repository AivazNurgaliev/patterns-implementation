package creational.FactoryMethod.creator;

import creational.FactoryMethod.product.Animal;

public abstract class AnimalCreator {

    public abstract Animal createAnimal();

    public void feedAnimal() {
        Animal animal = createAnimal();
        animal.voice();
        System.out.println("Yummy!");
        animal.numberOfPaws();
    }
}
