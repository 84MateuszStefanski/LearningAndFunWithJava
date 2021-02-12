package powtorkasda.obiektowe.klasylokalne;

import java.util.List;

public class MojaProba {
    public static void main(String[] args) {
        List<String> druzyny = List.of("Legia", "Lech", "Wisla");
        List<String> miasta = List.of("Warszawa", "Poznań", "Kraków");
        List<Integer> iloscPilkarzy = List.of(23, 24, 27);

        for (int i = 0; i < druzyny.size(); i++) {
            System.out.println(druzyny.get(i) + " " + miasta.get(i) + " " + iloscPilkarzy.get(i));
        }
    }
}
