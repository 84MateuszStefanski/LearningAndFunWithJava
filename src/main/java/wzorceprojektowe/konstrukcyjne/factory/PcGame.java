package wzorceprojektowe.konstrukcyjne.factory;

public class PcGame implements Game{
    private final String name;
    private final String type;
    private final int minNumberOfPlayers;
    private final int maxNumberOfPlayers;
    private final boolean isOnline;

    public PcGame(final String name, final String type, final int minNumberOfPlayers, final int maxNumberOfPlayers, final boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.isOnline = isOnline;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minNumberOfPlayers=" + minNumberOfPlayers +
                ", maxNumberOfPlayers=" + maxNumberOfPlayers +
                ", isOnline=" + isOnline +
                '}';
    }
}
