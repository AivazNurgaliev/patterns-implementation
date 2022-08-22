package creational.AbstractFactory.factory;

import creational.AbstractFactory.interfaces.Shirt;
import creational.AbstractFactory.interfaces.Sneakers;
import creational.AbstractFactory.shirtImpl.SportShirt;
import creational.AbstractFactory.sneakersImpl.SportSneakers;

public class SportsWearFactory implements WearFactory {

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Sneakers createSneakers() {
        return new SportSneakers();
    }
}
