package powtorkasda.obiektowe.watki.example1;

public class ThreadsExample {
    public static void main(String[] args) {
        new HelloWorldThread().start();
        System.out.println(Thread.currentThread().getId());

        new Thread(new HelloWorldRunnableThread()).start();
        new Thread(() -> System.out.println("Hello from another thread implemented with lambda")).start();
    }

}
