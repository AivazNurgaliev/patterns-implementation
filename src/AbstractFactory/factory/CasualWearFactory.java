package AbstractFactory.factory;

import AbstractFactory.interfaces.Shirt;
import AbstractFactory.interfaces.Sneakers;
import AbstractFactory.shirtImpl.CasualShirt;
import AbstractFactory.sneakersImpl.CasualSneakers;

public class CasualWearFactory implements WearFactory {

    @Override
    public Shirt createShirt() {
        return new CasualShirt();
    }

    @Override
    public Sneakers createSneakers() {
        return new CasualSneakers();
    }
}
