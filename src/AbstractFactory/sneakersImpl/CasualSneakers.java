package AbstractFactory.sneakersImpl;

import AbstractFactory.interfaces.Sneakers;

public class CasualSneakers implements Sneakers {

    @Override
    public void sneakersName() {
        System.out.println("Sneakers name: Casual");
    }


    @Override
    public boolean IsImprovedSoleForWorkouts() {
        return false;
    }

    @Override
    public void price() {
        System.out.println("Sneakers price: 50 $");
    }
}
