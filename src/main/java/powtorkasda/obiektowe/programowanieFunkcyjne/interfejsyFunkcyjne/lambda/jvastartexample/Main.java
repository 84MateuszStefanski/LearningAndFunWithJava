package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.lambda.jvastartexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Dorota ");
        names.add("Jacek ");
        names.add("Kasia ");
        names.add("Max ");
        names.add("Robert ");
        names.add("Damian ");
        names.add("Jarosław ");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println();
        System.out.println("Pełna klasa anonimowa  i Comparator" + names);

        System.out.println(" ");
        System.out.println("===================================================================== ");
        System.out.println("===================================================================== ");
        System.out.println(" ");


        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println("Najkrótsza lambda " + names);

        System.out.println(" ");
        System.out.println("===================================================================== ");
        System.out.println("===================================================================== ");
        System.out.println(" ");

        names.sort((o1, o2) -> {
            System.out.println(o1 + " " + o2);
            return Integer.compare(o1.length(), o2.length());
        });
        System.out.println("lambda z klamrami " + names);

        System.out.println(" ");
        System.out.println("===================================================================== ");
        System.out.println("===================================================================== ");
        System.out.println(" ");

        names.sort(Comparator.comparingInt(String::length));
        System.out.println("Comparator.comparingInt " + names);

        System.out.println(" ");
        System.out.println("===================================================================== ");
        System.out.println("===================================================================== ");
        System.out.println(" ");



    }
}
