package powtorkasda.obiektowe.watki.bykowskiu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 99; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 99; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });

        thread1.setName(" 1 wątek ");
        thread2.setName(" 2 wątek ");
        thread1.setPriority(1);
        thread2.setPriority(1);
        // thread1.run();  run uruchamia w wątku głównym
        thread1.start();    // start uruchamia jako osobny wątek
        thread2.start();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() ->numbers());
        executorService.shutdown();
        //executorService.shutdownNow();  shutdown zamyka wątki po ich zakończeniu a shutdownnow stara się to zrobić od razu

    }

    private static void numbers(){
        for (int i = 0; i < 99; i++) {
            System.out.println(Thread.currentThread().getName() + " " + "numbers" + " " + i);
        }
    }
}
