package creational.AbstractFactory.factory;

import creational.AbstractFactory.interfaces.Shirt;
import creational.AbstractFactory.interfaces.Sneakers;

public interface WearFactory {

    Shirt createShirt();
    Sneakers createSneakers();

}
