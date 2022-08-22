package creational.AbstractFactory.shirtImpl;

import creational.AbstractFactory.interfaces.Shirt;

public class SportShirt implements Shirt {

    @Override
    public void shirtName() {
        System.out.println("Shirt name: Sports");
    }

    @Override
    public void fabricType() {
        System.out.println("Shirt fabric type: polyester 100%");
    }

    @Override
    public void shirtSize() {
        System.out.println("Shirt size: More than normal");
    }
}
