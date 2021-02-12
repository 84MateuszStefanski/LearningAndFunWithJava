package powtorkasda.obiektowe.kompozycja;

public class DyskTwardy {
    private String producent;
    private int megabajtowPamieci;
    private String rodzajDysku;

    public DyskTwardy() {
    }

    public DyskTwardy(String producent, int megabajtowPamieci, String rodzajDysku) {
        this.producent = producent;
        this.megabajtowPamieci = megabajtowPamieci;
        this.rodzajDysku = rodzajDysku;
    }
}
