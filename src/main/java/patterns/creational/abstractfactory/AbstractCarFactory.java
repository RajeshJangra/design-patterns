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
                throw new InputMismatchException("Invalid Car Type");
        }
        return car;
    }

    public static void main(String[] args) {
         AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        final Car car = abstractCarFactory.getCar(CarType.SEDAN);
        System.out.println("car.getCarInfo() = " + car.getCarInfo());
    }
}
