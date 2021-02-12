package powtorkasda.obiektowe.klasylokalne;

import java.util.List;

public class KlasaZawierajacaKlaseLokalna {
    public static void main(String[] args) {
        final List<String> names = List.of("Kasia", "Magda", "Gosia");
        final List<String> surnames = List.of("Piszczyk", "Olszańska", "Budrzeńska");
        final int someVariable = 3; // zmienna do zaprezentowania dostępu zmiennych z klas lokalnych

        class Name { // stworzenie definicji klasy lokalnej, bez modyfikatora dostępu
            private final String firstName;
            private final String lastName;

            public Name(final String firstName, final String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }

            public String getReadableName() {
                System.out.println("Hey I can use outer variable " + someVariable);
                return firstName + " " + lastName;
            }
        }

        for (int idx = 0; idx < names.size(); idx++) {
            final Name name = new Name(names.get(idx), surnames.get(idx)); // wykorzystanie klasy lokalnej
            System.out.println(name.getReadableName());
        }
    }
}
