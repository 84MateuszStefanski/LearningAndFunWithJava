package powtorkasda.obiektowe.klasyanonimowe;

public interface Click {
    public abstract void turnON();
}

class UIComponents {

    // implementacja klasy anonimowej z wykorzystaniem słowa kluczowego new
    void showComponents() {
        Click click = new Click() {
            @Override
            public void turnON() {
                System.out.println("The system turn on");
            }
        };
        click.turnON();
    }

    // implementacja klasy anonimowej z wykorzystaniem lambdy
    void setClick1() {
        Click click1 = () -> System.out.println("The system turn on by powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.lambda");
        click1.turnON();
    }
}
class UIComponents2 {
    void showComponentsV2() {
        Click click2 = new Click() {

            private String name; // pole w klasie anonimowej
            private static final String BUTTON_CLICK_MESSAGE = "On Button click the system turn on!";
            // pole statyczne w klasie anonimowej

            public void sayHello() { // implementacja metody w klasie anonimowej
                System.out.println("I am new method in anonymous class");
            }

            @Override
            public void turnON() {
                sayHello();
                System.out.println(BUTTON_CLICK_MESSAGE);
            }
        };
    }
}

