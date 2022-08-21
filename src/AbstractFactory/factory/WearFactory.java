package AbstractFactory.factory;

import AbstractFactory.interfaces.Shirt;
import AbstractFactory.interfaces.Sneakers;

public interface WearFactory {

    Shirt createShirt();
    Sneakers createSneakers();

}
