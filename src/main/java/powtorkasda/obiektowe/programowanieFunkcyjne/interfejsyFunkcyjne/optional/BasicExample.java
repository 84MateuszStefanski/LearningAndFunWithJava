package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BasicExample {
    private List<Book> books;

    public BasicExample() {
        init();
        System.out.println(books.get(1));
        Optional<Book> book = books.stream()
                .filter(element -> element.getISBN().equals("97821234568055"))
                .findFirst();
        book.ifPresentOrElse(System.out::println, ()-> System.out.println("book doesn't exist"));

    }

    private void init() {
        books = new ArrayList<>();
        books.add(new Book("Książka Spring Boot 2", "9782123456803"));
        books.add(new Book("Aplikcje internetowe", "9782123456804"));
        books.add(new Book("Java dla zaawansowanych", "9782123456805"));
    }

    public static void main(String[] args) {
        new BasicExample();

    }

}
