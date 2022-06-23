package abstractfactory;

import java.util.Scanner;

public class AbstractFactoryUsage {

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        CarType carType = CarType.valueOf(keyboard.nextLine()); // np. AUDI_A4
        System.out.println("User wants to produce a " + carType); // User wants to produce a AUDI_A4

        CarFactory factory = new FactoryProvider().createFactory(carType);
        Car combi = factory.createCombi();

        CarFactory factory1 = new FactoryProvider().createFactory(carType);
        Car hatchback = factory.createHatchback();

        CarFactory factory2 = new FactoryProvider().createFactory(carType);
        Car sedan = factory.createSedan();

        System.out.println("There is your combi " + combi);
        System.out.println("There is your hatchback " + hatchback);
        System.out.println("There is your sedan " + sedan);
    }
}
