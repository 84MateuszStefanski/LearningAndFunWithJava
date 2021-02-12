package kobietydokodu.cwiczenia.kot;

import java.util.Scanner;

public class Interfejs {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Podaj imię kota ");
        Scanner sc = new Scanner(System.in);
        cat.setName(sc.nextLine());
        System.out.println("Podaj imie opiekuna ");
        cat.setOwner(sc.nextLine());
        System.out.println("Kot ma na imię " + cat.getName() + " a jego właścicielem jest " + cat.getOwner());

    }
}
