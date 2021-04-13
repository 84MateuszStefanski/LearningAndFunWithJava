package powtorkasda.obiektowe.watki.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SleepingThread implements Runnable {
    @Override
    public void run() {
        final List<Integer> ints = new ArrayList<>();
        for (int idx = 0; idx < 1000; idx++) {
            ints.add(new Random().nextInt());
        }
        if (Thread.currentThread().isInterrupted()) { // lub zresetowanie statusu Thread.interrupted()
            System.out.println("I was interrupted...");
            return;
        }
        final int sum = ints.stream().mapToInt(value -> value).sum();
        System.out.println("Sum is " + sum);
    }
}
