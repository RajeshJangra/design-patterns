package patterns.factory;

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
                throw new InputMismatchException("Invalid Car Type");
        }
        return car;
    }

    public static void main(String[] args) {
        final Car sedan = CarFactory.getCar(CarType.SEDAN);
        System.out.println(sedan.getCarInfo());

        final Car hatchback = CarFactory.getCar(CarType.HATCHBACK);
        System.out.println(hatchback.getCarInfo());
    }
}
