package konstrukcyjne.abstractfactory.audifactory;

import konstrukcyjne.abstractfactory.Car;
import konstrukcyjne.abstractfactory.CarFactory;

public class AudiA4Factory implements CarFactory {

    @Override
    public Car createSedan() {
        return new AudiA4Sedan();
    }

    @Override
    public Car createCombi() {
        return new AudiA4Combi();
    }

    @Override
    public Car createHatchback() {
        return new AudiA4Hatchback();
    }
}
