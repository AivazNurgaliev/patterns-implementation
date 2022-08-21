package AbstractFactory.sneakersImpl;

import AbstractFactory.interfaces.Sneakers;

public class SportSneakers implements Sneakers {

    @Override
    public void sneakersName() {
        System.out.println("Sneakers name: Sports");
    }

    @Override
    public boolean IsImprovedSoleForWorkouts() {
        return true;
    }

    @Override
    public void price() {
        System.out.println("Sneakers price: 200 $");
    }
}
