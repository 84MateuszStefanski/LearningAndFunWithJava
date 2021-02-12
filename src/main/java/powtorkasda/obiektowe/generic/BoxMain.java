package powtorkasda.obiektowe.generic;

import java.util.ArrayList;

public class BoxMain {
    public static void main(String[] args) {

        new Box<Integer>();
        Box<Integer> numberBox = new Box<Integer>(); // T zastąpione przez Integer
        Box<Integer> numberBox2 = new Box<>(); // <> wymagane
        var intList = new ArrayList<Integer>();
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        numberBox.setItem(a);
        numberBox2.setItem(b);
        numberBox.setItem(c);
        intList.add(d);
        System.out.println(intList);



        Pair<String, Float> pair = new Pair<String, Float>();
        pair.setKey("The key ");
        pair.setValue(100.00F);
        System.out.println(pair);


        System.out.println("The result of tuple.Pair.of : " + org.apache.commons.lang3.tuple.Pair.of(numberBox, numberBox2));

    }
}
