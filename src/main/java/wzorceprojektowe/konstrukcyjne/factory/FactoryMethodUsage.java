package wzorceprojektowe.konstrukcyjne.factory;

public class FactoryMethodUsage {
    public static void main(String[] args) {
        final String type = args[0];
        GameFactory gameFactory;
        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);
    }
}
