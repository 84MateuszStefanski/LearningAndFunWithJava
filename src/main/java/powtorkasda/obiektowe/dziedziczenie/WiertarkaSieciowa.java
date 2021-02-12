package powtorkasda.obiektowe.dziedziczenie;

public class WiertarkaSieciowa {
    private String marka;
    private int dolnyZakresWiercenia;
    private int gornyZakresWiercenia;
    private int maksymalneObrotyNaMinute;

    public WiertarkaSieciowa(String marka, int dolnyZakresWiercenia, int gornyZakresWiercenia, int maksymalneObrotyNaMinute) {
        this.marka = marka;
        this.dolnyZakresWiercenia = dolnyZakresWiercenia;
        this.gornyZakresWiercenia = gornyZakresWiercenia;
        this.maksymalneObrotyNaMinute = maksymalneObrotyNaMinute;
    }

    public void wybierzKierunekwiercenia() {
        System.out.println("Wiercenie");
    }


}
