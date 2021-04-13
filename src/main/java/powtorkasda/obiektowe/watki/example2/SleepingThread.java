package powtorkasda.obiektowe.watki.example2;

class SleepingThread implements Runnable {

    @Override
    public void run() {
        System.out.println("I will go to sleep");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) { // złapanie wyjątku InterruptedException, jeżeli sygnał interrupt został wysłany w trakcie wykonywania metody sleep
            System.out.println("I was interrupted during sleep");
        }
        System.out.println("I am exiting");
    }

}
