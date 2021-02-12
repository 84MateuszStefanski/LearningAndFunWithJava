package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.lambda.jvastartexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.run();


    }

    private void run() {
        List<String> names = new ArrayList<>();
        names.add("Dorota ");
        names.add("Jacek ");
        names.add("Kasia ");
        names.add("Max ");
        names.add("Robert ");
        names.add("Damian ");
        names.add("Jarosław ");

        names.stream()
                .filter(s -> s.trim().endsWith("a"))
                .map(name -> name + "??")
                .forEach(System.out::println);

        System.out.println(" ");
        System.out.println("===================================================================== ");
        System.out.println("===================================================================== ");
        System.out.println(" ");


        names = filter(names, input -> input.trim().endsWith("a"));

        modifyAndDisplay(names,s -> s + " " + new Random().nextInt(11) );
        modifyAndDisplay(names,s -> s + " " + "!!!" );
        modifyAndDisplay(names,s -> s + " " + "oddawaj pieniądze\t");
    }

    private List<String> filter(List<String> input, Filter filter){
        List<String> resultList = new ArrayList<>();
        for (String name : input){
            if(filter.filter(name)){
                resultList.add(name);
            }
        }

        return resultList;
    }


    private void modifyAndDisplay(List<String> names, Modifier modifier){
        List<String> modifiedNames = new ArrayList<>();

        for (String name : names) {
            String modifiedName = modifiy(name,modifier);
            modifiedNames.add(modifiedName);
        }
        System.out.println(modifiedNames);
    }

    private String modifiy(String string, Modifier modifier) {
        return modifier.modify(string);
    }
}
