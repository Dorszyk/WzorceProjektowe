package konstrukcyjne.abstractfactory.toyotafactory;

import konstrukcyjne.abstractfactory.Car;
import konstrukcyjne.abstractfactory.CarFactory;

public class ToyotaCorollaFactory implements CarFactory {

    @Override
    public Car createSedan() {
        return new ToyotaCorollaSedan();
    }

    @Override
    public Car createCombi() {
        return new ToyotaCorollaCombi();
    }

    @Override
    public Car createHatchback() {
        return new ToyotaCorollaHatchback();
    }
}
