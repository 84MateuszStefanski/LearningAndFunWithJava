package powtorkasda.obiektowe.streamapi;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerator {


    public static void main(String[] args) throws IOException {
        Stream<Integer> streamOfInts = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        Stream<String> streamOfStrings = Set.of("one", "two", "three").stream();
        Stream<Map.Entry<String, Integer>> stream = Map.of("someKeyA", 1, "someKeyB", 2).entrySet().stream();
        IntStream arraysStream = Arrays.stream(new int[]{1, 2, 3});
        Stream<Double> ofStream = Stream.of(1.1, 2.2, 3.3);
        Stream<Integer> generateStream = Stream.generate(() -> new Random().nextInt());

        try {
            Stream<String> fileLinesStream = Files.lines(Path.of("/tmp/1.txt"));
        }catch (NoSuchFileException e){
            System.out.println("No such file");
        }

        System.out.println(streamOfInts.count());


        System.out.println("--------------------moje wypociny-------------------------");

        List<Integer> streamOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        streamOfIntegers.stream()
                .filter(i -> i%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("--------------------moje wypociny-------------------------");

        streamOfIntegers.stream()
                .filter(i -> i%3==0)
                .collect(Collectors.toList())//opakowuje odfiltrowane dane w listę
                .forEach(System.out::println);

        System.out.println("--------------------moje wypociny-------------------------");

        streamOfIntegers.stream()//tworzy strumien z listy liczb
                .map(i -> i+3) // dodaje 3 do kazdego elementu listy
                .filter(i -> i%4==0)// odsortowuje tylko liczby z listy ktore sa podzielne przez 4
                .forEach(System.out::println);//drukuje strumien listy po wykonaniu powyzszych operacji
                    // nie zmieniajac listy wejsciowej


        System.out.println("--------------------moje wypociny-------------------------");

        List.of("kto", "będzie", "pierwszym", "elementem ", "tego", "strumienia").stream()
                .sorted()
                .findFirst() // zwraca Optional
                .ifPresent(System.out::println); // wyświetli słowo "będzie"

        System.out.println("--------------------moje wypociny-------------------------");

        final List<String> result = Arrays.asList("Ala ma kota o imieniu Kotosław".split(" ")).parallelStream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.stream().sequential().forEach(System.out::println);

        List<String> personNames = Arrays.asList("Janek", "Ania", "Bartek");
        List<Integer> persomAge = Arrays.asList(23, 26, 36);
        List<String> personNationality = Arrays.asList("PL", "PL", "PL");

        // klasa person jest narazie nie wykorzystana , użyj jej do dalszych ćwiczeń na strumieniach







    }
}
