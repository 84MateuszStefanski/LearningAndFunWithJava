package lombok;

public class HumanCreator {
    public static void main(String[] args) {

        //tworzenie obiektu builderem z lomboka
        Human human1 = Human.builder()
                .name("Andrju")
                .age(24)
                .nationality("Polska")
                .build();
        System.out.println(human1.getName() + " " + human1.getAge());

        //tworzenie obiektu przy pomocy konstruktora generowanego z lomboka
        Human human2 = new Human("Janusz", 33, "Cebulak");
        System.out.println(human2.getName());
        System.out.println(human1.toString());
    }
}
