package powtorkasda.obiektowe.streamapi;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamGenerator {


    public static void main(String[] args) throws IOException {
        Stream<Integer> streamOfInts = Arrays.asList(1, 2, 3).stream();
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


    }
}
