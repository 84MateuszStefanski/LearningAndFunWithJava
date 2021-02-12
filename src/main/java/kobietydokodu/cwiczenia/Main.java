package kobietydokodu.cwiczenia;

import java.util.Scanner;

public class Main {


    public String getUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Wpisz swój tekst");
        System.out.println(m.getUserInput());
    }
}
