package patterns.abstractfactory;

public class HatchbackFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Hatchback();
    }
}
