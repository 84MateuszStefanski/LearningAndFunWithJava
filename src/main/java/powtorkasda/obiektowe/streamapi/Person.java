package powtorkasda.obiektowe.streamapi;

public class Person {
    private String name ;
    private int age ;
    private String nationSymbol;

    public Person(String name, int age, String nationSymbol) {
        this.name = name;
        this.age = age;
        this.nationSymbol = nationSymbol;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationSymbol() {
        return nationSymbol;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationSymbol='" + nationSymbol + '\'' +
                '}';
    }
}

