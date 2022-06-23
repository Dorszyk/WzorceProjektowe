package strukturalne.bridge;

import static strukturalne.bridge.Taste.BITTER;

public class Coffee implements Drink {

    @Override
    public String getVolume() {
        return "500ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 0;
    }

    @Override
    public Taste getTaste() {
        return BITTER;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
