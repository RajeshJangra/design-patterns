package patterns.abstractfactory;

public class SedanFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Sedan();
    }
}
