package creational.FactoryMethod.concreteCreators;

import creational.FactoryMethod.concreteProducts.Chicken;
import creational.FactoryMethod.creator.AnimalCreator;
import creational.FactoryMethod.product.Animal;

public class ChickenCreator extends AnimalCreator {

    @Override
    public Animal createAnimal() {
        return new Chicken();
    }
}
