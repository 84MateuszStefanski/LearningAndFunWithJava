package wzorceprojektowe.konstrukcyjne.abstractfactory;

import java.util.Scanner;

public class AbstractFactoryUsage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String userChoice;
        String userChoice2 = null;
        do {
            System.out.println();
            System.out.println("Choose which car you want to create:");
            System.out.println("[1] Audi A4");
            System.out.println("[2] Toyota Corolla");
            System.out.println("[x] Quit");
            userChoice = getUserInput();
            if (userChoice.equals("1")) {
                CarType carType = CarType.AUDI_A4;
                System.out.println("User wants to produce a " + carType);

                CarFactory factory = new FactoryProvider().createFactory(carType);
                System.out.println();
                System.out.println("Choose the body of your car:");
                System.out.println("[1] Sedan");
                System.out.println("[2] Hachback");
                System.out.println("[3] Combi");
                System.out.println("[x] Quit");
                userChoice2 = getUserInput();
                if (userChoice2.equals("1")) {
                    Car car = factory.createSedan();
                    System.out.println("There is your car " + car);
                } else if (userChoice2.equals("2")) {
                    Car car = factory.createHatchback();
                    System.out.println("There is your car " + car);
                } else if (userChoice2.equals("3")) {
                    Car car = factory.createCombi();
                    System.out.println("There is your car " + car);
                }

            } else if (userChoice.equals("2")) {
                CarType carType = CarType.TOYOTA_COROLLA;
                System.out.println("User wants to produce a " + carType);
                CarFactory factory = new FactoryProvider().createFactory(carType);

                System.out.println();
                System.out.println("Choose the body of your car:");
                System.out.println("[1] Sedan");
                System.out.println("[2] Hachback");
                System.out.println("[3] Combi");
                System.out.println("[x] Quit");
                userChoice2 = getUserInput();
                if (userChoice2.equals("1")) {
                    Car car = factory.createSedan();
                    System.out.println("There is your car " + car);
                } else if (userChoice2.equals("2")) {
                    Car car = factory.createHatchback();
                    System.out.println("There is your car " + car);
                } else if (userChoice2.equals("3")) {
                    Car car = factory.createCombi();
                    System.out.println("There is your car " + car);
                }
            }

        } while (!userChoice.equalsIgnoreCase("x") && !userChoice2.equalsIgnoreCase("x"));

    }

    public static String getUserInput() {
        return sc.nextLine().trim();
    }
}
