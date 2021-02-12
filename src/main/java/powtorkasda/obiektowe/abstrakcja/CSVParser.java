package powtorkasda.obiektowe.abstrakcja;

public class CSVParser extends DataParser {
    @Override
    public Data parse() {
        validateData();
        String[] splitData = data.split(",");
        return new Data(splitData[0], Integer.valueOf(splitData[1]));
    }
}
