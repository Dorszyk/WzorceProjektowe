package strukturalne.bridge;

public class Main {
    public static void main(String[] args) {

        TeaPurchase teaPurchase = new TeaPurchase();
        teaPurchase.buy(12.2);

        CoffeePurchase coffeePurchase= new CoffeePurchase();
        coffeePurchase.buy(15.2);
    }
}
