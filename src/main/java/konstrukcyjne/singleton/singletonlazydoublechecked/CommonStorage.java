package konstrukcyjne.singleton.singletonlazydoublechecked;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    private static CommonStorage instance;

    public static CommonStorage getInstance() {
        if (instance == null) { // (1)
            synchronized (CommonStorage.class) {
                if (instance == null) { // (2)
                    instance = new CommonStorage();
                }
            }
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
