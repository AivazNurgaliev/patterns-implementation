package creational.FactoryMethod.concreteCreators;

import creational.FactoryMethod.concreteProducts.Dog;
import creational.FactoryMethod.creator.AnimalCreator;
import creational.FactoryMethod.product.Animal;

public class DogCreator extends AnimalCreator {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
