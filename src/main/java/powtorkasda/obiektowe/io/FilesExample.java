package powtorkasda.obiektowe.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\data.txt");
        Path pathToCopy = Paths.get("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\data_copy.txt");

        try {
            Files.createFile(path);
            Files.createFile(pathToCopy);
        } catch (FileAlreadyExistsException e){
            System.out.println("File already exist ");
        }

        Files.write(path, "test data\n".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "first line\n".getBytes(), StandardOpenOption.APPEND); // APPEND dodaje tekst do istniejącej zawartości
        Files.write(path, "second line\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "third line\n".getBytes(), StandardOpenOption.APPEND);

        for (String line : Files.readAllLines(path)){
            System.out.println(line);
        }

        //Files.delete(pathToCopy);
        try {
            Files.copy(path, pathToCopy, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }

}
