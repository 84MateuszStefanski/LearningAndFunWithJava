package powtorkasda.obiektowe.watki.bykowskiu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlusMinus {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();


        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(() -> plus(2, 3));
        service.submit(() -> minus(5,3));
        service.shutdown();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " == ");

    }

    public static int plus(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static int minus(int a, int b){
        System.out.println(a-b);
        return a-b;
    }
}
