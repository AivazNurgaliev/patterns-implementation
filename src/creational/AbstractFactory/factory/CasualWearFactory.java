package creational.AbstractFactory.factory;

import creational.AbstractFactory.interfaces.Shirt;
import creational.AbstractFactory.interfaces.Sneakers;
import creational.AbstractFactory.shirtImpl.CasualShirt;
import creational.AbstractFactory.sneakersImpl.CasualSneakers;

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
