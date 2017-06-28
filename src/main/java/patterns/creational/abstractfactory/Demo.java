package patterns.creational.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        final Car car = abstractCarFactory.getCar(CarType.SEDAN);
        System.out.println("car.getCarInfo() = " + car.getCarInfo());
    }
}
