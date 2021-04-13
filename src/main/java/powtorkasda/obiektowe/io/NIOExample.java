package powtorkasda.obiektowe.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOExample {
    private static Object FileAttribute;

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\user.txt", "r");
        FileChannel fileChannel = file.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        while (fileChannel.read(byteBuffer) > 0) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();
        }
        file.close();

        Path p1 = Paths.get("/nio/example/path");
        Path p2 = Paths.get(URI.create("file:///nio/example/FileTest.java"));
        Path p3 = Path.of("/tmp", "dir_a", "dir_b");

        System.out.println("");
        System.out.println("tu cos powiinno byc" + p1.getFileName());
        System.out.println("");

        //sprawdzanie czy plik jest wykonywalny
        if (Files.isExecutable(Path.of("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\user.txt"))) {
            System.out.println("File is exectable ");
        } else {
            System.out.println("File is NOT exectable ");
        }

        //tworzenie nowego pliku lub wyrzucenie wyjątku o istnieniu pliku
        try {
            Files.createFile(Path.of("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src" +
                    "\\main\\java\\powtorkasda\\obiektowe\\io\\user_output.txt"));
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exist");
        }
    }
}
