package creational.AbstractFactory.app;

import creational.AbstractFactory.factory.WearFactory;
import creational.AbstractFactory.interfaces.Shirt;
import creational.AbstractFactory.interfaces.Sneakers;

public class Application {

    private WearFactory wearFactory;
    private Shirt shirt;
    private Sneakers sneakers;

    Application(WearFactory wearFactory) {
        this.wearFactory = wearFactory;
    }

    public void createWearForPerson() {
        this.shirt = wearFactory.createShirt();
        this.sneakers = wearFactory.createSneakers();
    }

    public void printSelectedWear() {
        System.out.println("You selected: ");
        shirt.shirtName();
        shirt.fabricType();
        shirt.shirtSize();
        System.out.println("And: ");
        sneakers.sneakersName();
        sneakers.price();
        System.out.println("Is sole better for workouts: " + sneakers.IsImprovedSoleForWorkouts());
        System.out.println("Thanks for buying!");
    }
}
