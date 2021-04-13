package powtorkasda.obiektowe.watki.synchronizacja;

public class ThreadsExample {
    public static void main(String[] args) {
        final Pair pair = new Pair(0, 0);
        new Thread(new DummyPairIncrementer(pair)).start();
        new Thread(new DummyPairIncrementer(pair)).start();
    }
}
