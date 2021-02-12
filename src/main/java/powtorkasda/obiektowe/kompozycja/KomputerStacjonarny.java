package powtorkasda.obiektowe.kompozycja;

public class KomputerStacjonarny {
    private Obudowa obudowa;
    private PłytaGłówna płytaGłówna;
    private Procesor procesor;
    private Ram ram;
    private DyskTwardy dyskTwardy;
    private KartaDzwiekowa kartaDzwiekowa;
    private KartaGraficzna kartaGraficzna;

    public KomputerStacjonarny(Obudowa obudowa, PłytaGłówna płytaGłówna,
                               Procesor procesor, Ram ram, DyskTwardy dyskTwardy,
                               KartaDzwiekowa kartaDzwiekowa, KartaGraficzna kartaGraficzna) {
        this.obudowa = obudowa;
        this.płytaGłówna = płytaGłówna;
        this.procesor = procesor;
        this.ram = ram;
        this.dyskTwardy = dyskTwardy;
        this.kartaDzwiekowa = kartaDzwiekowa;
        this.kartaGraficzna = kartaGraficzna;
    }
}
