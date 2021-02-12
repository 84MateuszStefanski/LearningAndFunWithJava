package powtorkasda.obiektowe.refleksje;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CarReflectionMethod {
    public static void main(String[] args) throws ClassNotFoundException,InstantiationException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        Class<?> carClass = Class.forName("powtorkasda.obiektowe.refleksje.Car");                        // pobranie obiektu Class dla klasy Car
        Car car = (Car) carClass.newInstance();                                       // (1)
        Method setNameMethod = carClass.getDeclaredMethod("setName", String.class);   // (2)
        Method setModelMethod = carClass.getDeclaredMethod("setModel", String.class); // (3)
        Method getNameMethod = carClass.getDeclaredMethod("getName");                 // (4)
        setNameMethod.invoke(car, "Porsche");                                         // (5)
        setModelMethod.invoke(car, "K1");                                             // (6)
        System.out.println("Get name: " + getNameMethod.invoke(car));                 // (7)
        System.out.println("Use method using reflection: ");                          // (8)
        System.out.println(car);                                                      // (9)

    }
}
