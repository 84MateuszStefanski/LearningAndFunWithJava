package powtorkasda.obiektowe.refleksje;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CarReflectionClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> carClass = Class.forName("powtorkasda.obiektowe.refleksje.Car");
        Method[] methods = carClass.getDeclaredMethods();
        Field[] fields = carClass.getDeclaredFields();
        System.out.println("Available methods: ");
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("Available fields: ");
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
