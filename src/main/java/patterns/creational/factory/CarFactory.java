package patterns.creational.factory;

import java.util.InputMismatchException;

public class CarFactory {

    public static Car getCar(CarType type) {
        Car car;
        switch (type) {
            case SEDAN: {
                car = new Sedan();
                break;
            }
            case HATCHBACK: {
                car = new Hatchback();
                break;
            }
            default:
                //can not happen since input is enum, added as does not want to initialize car with null
                throw new InputMismatchException("Invalid EconomyCar Type");
        }
        return car;
    }
}
