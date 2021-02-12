package powtorkasda.obiektowe.dziedziczenie;

public class WkretarkaAkumulatorowa extends WiertarkaSieciowa{
    private float pojemnoscBaterii;
    private String rodzajBaterii;

    public WkretarkaAkumulatorowa(String marka, int dolnyZakresWiercenia, int gornyZakresWiercenia,
                                  int maksymalneObrotyNaMinute, float pojemnoscBaterii, String rodzajBaterii) {
        super(marka, dolnyZakresWiercenia, gornyZakresWiercenia, maksymalneObrotyNaMinute);
        this.pojemnoscBaterii = pojemnoscBaterii;
        this.rodzajBaterii = rodzajBaterii;
    }

    @Override
    public void wybierzKierunekwiercenia() {
        super.wybierzKierunekwiercenia();
    }

}
