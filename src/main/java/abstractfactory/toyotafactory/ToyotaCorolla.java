package abstractfactory.toyotafactory;

import abstractfactory.AbstractCar;

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
