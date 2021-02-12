package wzorceprojektowe.konstrukcyjne.factory;

public class ValorantGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new PcGame("Valorant", "FPS", 4, 10, true);
    }
}
