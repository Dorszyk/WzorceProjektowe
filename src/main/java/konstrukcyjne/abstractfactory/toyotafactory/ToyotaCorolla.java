package konstrukcyjne.abstractfactory.toyotafactory;

import konstrukcyjne.abstractfactory.AbstractCar;

public abstract class ToyotaCorolla extends AbstractCar {
    @Override
    public String getModelName() {
        return "Corolla";
    }

    @Override
    public String getProducer() {
        return "Toyota";
    }
}
