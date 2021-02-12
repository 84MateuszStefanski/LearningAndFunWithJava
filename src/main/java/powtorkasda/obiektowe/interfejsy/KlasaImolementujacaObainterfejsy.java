package powtorkasda.obiektowe.interfejsy;

public class KlasaImolementujacaObainterfejsy implements Interfejs, InterfejsDrugi{
    @Override
    public void metoda1() {
        System.out.println("Implementacja w klasie z dwoma interfejsami");
    }

    public static void metoda2(){
        System.out.println("metoda statyczna w klasie z dwoma interfejsami ");
    }

    @Override
    public String metoda3(String mojString) {
        return mojString;
    }
}
