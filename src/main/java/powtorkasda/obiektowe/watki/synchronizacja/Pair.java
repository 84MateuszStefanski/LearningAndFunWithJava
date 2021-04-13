package powtorkasda.obiektowe.watki.synchronizacja;

class Pair {
    private Integer left;
    private Integer right;

    public Pair(final Integer left, final Integer right) {
        this.left = left;
        this.right = right;
    }

    public synchronized void incrementLeft() { // do metody void dodajemy słówko kluczowe synchronized aby zsynchronizować metody
        left++;
    }
//    Synchronizacja metody polega na tym, że wątek, który ją wywołuje, ma do niej wyłączny dostęp do czasu jej zakończenia.

    public synchronized void incrementRight() {
        right++;
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }
}
