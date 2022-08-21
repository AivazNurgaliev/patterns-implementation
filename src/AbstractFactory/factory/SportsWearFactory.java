package AbstractFactory.factory;

import AbstractFactory.interfaces.Shirt;
import AbstractFactory.interfaces.Sneakers;
import AbstractFactory.shirtImpl.SportShirt;
import AbstractFactory.sneakersImpl.SportSneakers;

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
