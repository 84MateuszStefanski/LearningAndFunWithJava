package powtorkasda.obiektowe.programowanieFunkcyjne.interfejsyFunkcyjne.SAM;

@FunctionalInterface
public interface Executor {
    void executor(int x);
    default void executor(int x, int y) {
        // I have a body I am a default method
    }
}


  //  W celu łatwiejszej identyfikacji interfejsów funkcyjnych, w Javie wprowadzona została adnotacja @FunctionalInterface,
//  która informuje programistę, że wskazany interfejs ma być z założenia interfejsem funkcyjnym