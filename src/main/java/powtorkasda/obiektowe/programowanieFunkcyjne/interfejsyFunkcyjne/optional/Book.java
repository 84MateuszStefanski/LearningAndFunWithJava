package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.optional;

public class Book {
    String title;
    String ISBN;

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
