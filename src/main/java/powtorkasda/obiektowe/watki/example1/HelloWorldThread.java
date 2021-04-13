package powtorkasda.obiektowe.watki.example1;

class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World from another Thread");
        System.out.println(Thread.currentThread().getId());
    }

}
