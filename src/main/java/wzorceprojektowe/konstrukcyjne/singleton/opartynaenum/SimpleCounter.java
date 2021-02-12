package wzorceprojektowe.konstrukcyjne.singleton.opartynaenum;

public enum SimpleCounter {
    INSTANCE;
    private int currentCount = 0;

    public int getCurrentCount() {
        return currentCount;
    }
    public void increment(){
        currentCount++;
    }
}
