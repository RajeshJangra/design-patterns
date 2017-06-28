package patterns.creational.abstractfactory;

import java.util.InputMismatchException;

public class AbstractCarFactory {
    public Car getCar(CarType type) {
        Car car;
        switch (type) {
            case SEDAN: {
                car = new SedanFactory().getCar();
                break;
            }
            case HATCHBACK: {
                car = new HatchbackFactory().getCar();
                break;
            }
            default:
                //can not happen since input is enum, added as does not want to initialize car with null
                throw new InputMismatchException("Invalid EconomyCar Type");
        }
        return car;
    }
}
