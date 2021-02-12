package powtorkasda.obiektowe.refleksje;
import java.lang.reflect.Method;
public class CarReflectionInheritance {
    public static void main(String[] args) throws Exception {
        System.out.println("Metody  ");
        System.out.println(" ");
        final Method[] methods = Car.class.getMethods();
        for (final Method method : methods) {
            System.out.println(method);
        }
        System.out.println(" ");
        System.out.println("Metody zadeklarowane ");
        System.out.println(" ");
        final Method[] methods2 = Car.class.getDeclaredMethods();
        for (final Method method2 : methods2) {
            System.out.println(method2);
        }

    }
}
