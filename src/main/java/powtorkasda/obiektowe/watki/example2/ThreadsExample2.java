package powtorkasda.obiektowe.watki.example2;

import powtorkasda.obiektowe.watki.example2.SleepingThread;

public class ThreadsExample2 {
    public static void main(String[] args) {
        final Thread sleepingThread = new Thread(new SleepingThread());
        sleepingThread.start();
        sleepingThread.interrupt(); // wysłanie prośby o zatrzymanie
    }
}
