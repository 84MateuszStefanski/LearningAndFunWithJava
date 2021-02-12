package powtorkasda.obiektowe.polimorfizm;

public class AndroidTV {
    public static void main(String[] args) {
        final String player = args[0];
        VodPlayer vodPlayer = null;
        if (player.equals("Netflix")) {
            vodPlayer = new Netflix();
        } else if (player.equals("HBO")) {
            vodPlayer = new Hbo();
        } else {
            vodPlayer = new DefaultPlayer();
        }
        playEpisode(vodPlayer, "GOT_S1E1");
    }
    static void playEpisode(VodPlayer vodPlayer, String title) {
        vodPlayer.play(title);
    }

}
