package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.SAM;

public class RunnableUse implements Runnable {

    @Override
    public void run() {
        Runnable runnableExample = () -> {
            System.out.println("Hello from runnable");
            System.out.println("{ and } cannot be omitted");
        };
    }
}
