package powtorkasda.obiektowe.refleksje;

public class CarReflectionConstructor {
    public static void main(String[] args) throws Exception{
        Car car = Car.class.getConstructor(String.class, String.class).newInstance("param1", "param2");
        System.out.println("Create object using reflection: " + car);
        Car car1 = Car.class.getConstructor(String.class, String.class).newInstance("Fiat",
                "126p");
        System.out.println("Second object created by reflection is : " + car1);
    }
}
