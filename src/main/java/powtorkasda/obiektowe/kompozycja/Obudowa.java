package powtorkasda.obiektowe.kompozycja;

public class Obudowa {
    private String rozmiarObudowy;
    private boolean podświetlenie;
    private String producent;

    public Obudowa() {
    }

    public Obudowa(String rozmiarObudowy, boolean podświetlenie, String producent) {
        this.rozmiarObudowy = rozmiarObudowy;
        this.podświetlenie = podświetlenie;
        this.producent = producent;
    }
}
