package powtorkasda.obiektowe.interfejsy;

public class KlasaImplementujacaInterfejs implements Interfejs {
    @Override
    public void metoda1() {
        System.out.println("Metoda interfejsu użyta w klasie");
    }

    public static void metoda2() {
        System.out.println("Metoda statyczna  interfejsu użyta w klasie" + " " + przykladowyString);
    }

}
