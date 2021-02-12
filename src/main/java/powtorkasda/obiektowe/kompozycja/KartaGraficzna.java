package powtorkasda.obiektowe.kompozycja;

public class KartaGraficzna {
    private String producent;
    private float czestotliwosc;
    private float iloscPamieci;
    private int iloscRdzeni;

    public KartaGraficzna() {
    }

    public KartaGraficzna(String producent, float czestotliwosc, float iloscPamieci, int iloscRdzeni) {
        this.producent = producent;
        this.czestotliwosc = czestotliwosc;
        this.iloscPamieci = iloscPamieci;
        this.iloscRdzeni = iloscRdzeni;
    }
}
