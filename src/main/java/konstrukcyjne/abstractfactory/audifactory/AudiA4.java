package konstrukcyjne.abstractfactory.audifactory;

import konstrukcyjne.abstractfactory.AbstractCar;

public abstract class AudiA4 extends AbstractCar {
    @Override
    public String getModelName() {
        return "A4";
    }

    @Override
    public String getProducer() {
        return "Audi";
    }
}
