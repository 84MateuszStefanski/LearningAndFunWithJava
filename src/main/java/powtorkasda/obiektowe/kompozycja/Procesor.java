package powtorkasda.obiektowe.kompozycja;

public class Procesor {
    private String producent;
    private float czestotliwosc;
    private int iloscRdzeni;

    public Procesor() {
    }

    public Procesor(String producent, float czestotliwosc, int iloscRdzeni) {
        this.producent = producent;
        this.czestotliwosc = czestotliwosc;
        this.iloscRdzeni = iloscRdzeni;
    }
}
