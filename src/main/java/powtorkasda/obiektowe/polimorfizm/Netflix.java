package powtorkasda.obiektowe.polimorfizm;

public class Netflix extends VodPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing " + title + " on Netflix");
    }
}
