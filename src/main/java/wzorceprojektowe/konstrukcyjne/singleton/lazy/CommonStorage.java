package wzorceprojektowe.konstrukcyjne.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    private static CommonStorage instance;

    public static CommonStorage getInstance() {
        if (instance == null) {
            instance = new CommonStorage();
        }
        return instance;
    }

    private List<Integer> values = new ArrayList<>();

    private CommonStorage() {
    }

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}
