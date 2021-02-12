package powtorkasda.obiektowe.refleksje;

import java.lang.reflect.Field;

public class CarReflectionField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        Field field = Car.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(car, "test");
        Field modelField = Car.class.getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(car, "BMW");
        System.out.println("Set field using reflection: " + car);

        Car car2 = new Car();
        Field field1 = Car.class.getDeclaredField("isPrototype");
        field1.setAccessible(true);
        field1.set(car2, false);
        car2.setModel("Golf");
        Field field3 = Car.class.getDeclaredField("name");
        field3.setAccessible(true);
        field3.set(car2,"trójka");
        System.out.println(car2);
    }
}
