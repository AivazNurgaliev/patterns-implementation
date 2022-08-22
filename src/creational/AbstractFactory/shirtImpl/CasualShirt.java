package creational.AbstractFactory.shirtImpl;

import creational.AbstractFactory.interfaces.Shirt;

public class CasualShirt implements Shirt {

    @Override
    public void shirtName() {
        System.out.println("Shirt name: Casual");
    }

    @Override
    public void fabricType() {
        System.out.println("Shirt fabric type: cotton 100%");
    }

    @Override
    public void shirtSize() {
        System.out.println("Shirt size: Normal");
    }
}
