package creational.FactoryMethod;

import creational.FactoryMethod.concreteCreators.ChickenCreator;
import creational.FactoryMethod.concreteCreators.DogCreator;
import creational.FactoryMethod.creator.AnimalCreator;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        AnimalCreator animalCreator;
        if ("dog".equalsIgnoreCase(input)) {
            animalCreator = new DogCreator();
        } else if ("chicken".equalsIgnoreCase(input)) {
            animalCreator = new ChickenCreator();
        } else {
            throw new NoSuchElementException("Error! No such animal!");
        }

        animalCreator.feedAnimal();
    }
}
