package strukturalne.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeePurchase implements DrinkPurchase {

    @Override
    public Drink buy(final Double cost) {
        log.info("Buying a a coffee for {}", cost);
        return new Coffee();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}