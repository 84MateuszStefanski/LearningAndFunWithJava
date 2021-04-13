package powtorkasda.obiektowe.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        pierwszy sposób tworzenia strumienia i jego wyświetlenie w nieskonczonosc
//        Stream<Integer> iterate = Stream.iterate(1, n -> n + 1);
//        iterate.forEach(n -> System.out.println(n));

        //tworzenie strumienia z istniejącej kolekcji
        List<String> names = Arrays.asList("Dorota","Zofia", "Paweł","Dorota", "Wojtek", "Karolina");
        Stream<String> stream1 = names.stream();
        // klasa anonimowa zapisana lambdą która sortuje imiona kończące się na a
        Stream<String> stream2 = stream1.filter(s -> s.endsWith("a"));
        stream2.forEach(n -> System.out.println(n));

        // to samo co wyżej zapisane krócej wywołane na liscie names
        names.stream()
                .filter(s -> s.endsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out :: println);

        // przekształcenie strumieniem listy stringów na liste User
        List<User> users = names.stream()
                .filter(s -> s.endsWith("a"))
                .map(string -> new User(string,new Random().nextInt(45)))
                .sorted(Comparator.comparing(User ::getName))
                .sorted(Comparator.comparing(User :: getAge))
                .collect(Collectors.toList());
        System.out.println(users);




    }
}

class User {
    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
