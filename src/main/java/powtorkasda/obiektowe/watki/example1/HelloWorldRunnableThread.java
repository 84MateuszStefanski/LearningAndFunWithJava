package powtorkasda.obiektowe.watki.example1;

class HelloWorldRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World from another Runnable Thread");
    }
}
