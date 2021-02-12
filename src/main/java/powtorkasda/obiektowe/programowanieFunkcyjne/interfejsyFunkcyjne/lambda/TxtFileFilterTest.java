package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TxtFileFilterTest {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek", "Kazik");
        //sortowanie aldabetyczne z uwzględnieniem wielkości liter
        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //metoda dorEach od Jav8 8 daje możliwości jak pętla for-each
        //oczekuje argumentu typu java.util.function.Consumer, czyli
        // (arg) -> void
        names.forEach(arg -> System.out.println(arg));
    }
}
