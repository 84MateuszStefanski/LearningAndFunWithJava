package powtorkasda.obiektowe.polimorfizm;

public class DefaultPlayer extends VodPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing " + title + " default player");
    }
}
