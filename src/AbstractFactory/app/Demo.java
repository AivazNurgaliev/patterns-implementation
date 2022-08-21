package AbstractFactory.app;

import AbstractFactory.factory.CasualWearFactory;
import AbstractFactory.factory.SportsWearFactory;
import AbstractFactory.factory.WearFactory;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        System.out.println("What type of wear do you want to buy?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        WearFactory wearFactory;
        if ("Casual".equalsIgnoreCase(input)) {
            wearFactory = new CasualWearFactory();
        } else if ("Sports".equalsIgnoreCase(input)) {
            wearFactory = new SportsWearFactory();
        } else {
            throw new NoSuchElementException("Error! No such Wear.");
        }

        Application application = new Application(wearFactory);
        application.createWearForPerson();
        application.printSelectedWear();
    }
}
