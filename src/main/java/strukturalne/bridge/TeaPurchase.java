package strukturalne.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeaPurchase implements DrinkPurchase {

    private String tea;

    @Override
    public Drink buy(final Double cost) {
        log.info("Buying a a tea for {}", cost);
        return new Tea();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
