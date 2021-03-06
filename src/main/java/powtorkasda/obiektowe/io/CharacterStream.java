package powtorkasda.obiektowe.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\user.txt");
            out = new FileWriter("D:\\Programowanie\\Java.Workplace\\Algorytmy\\src\\main\\java\\powtorkasda\\obiektowe\\io\\user_output.txt");

            int c;
            int nextChar;
            while ((nextChar = in.read()) != -1) {
                out.append((char) nextChar);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
