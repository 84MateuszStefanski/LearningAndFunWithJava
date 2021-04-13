package powtorkasda.obiektowe.watki.example3;

public class ThreadsExample {
    public static void main(String[] args) {
        final Thread sleepingThread = new Thread(new SleepingThread());
        sleepingThread.start();
        sleepingThread.interrupt();  // gdy wyłączymy tą linię program poda sumę liczb
    }
}
