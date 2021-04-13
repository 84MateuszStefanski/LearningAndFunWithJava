package powtorkasda.obiektowe.streamapi.moje;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exrc {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aasdfsd ", "vxxdas", "sdfsdaa", "ppppppp", "abc", "azdsfsd");
        Stream<String> stringStream = names.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.endsWith("d"));
        stringStream.forEach(System.out::println);

    }
}
