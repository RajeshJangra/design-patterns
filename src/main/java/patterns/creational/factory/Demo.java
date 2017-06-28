package patterns.creational.factory;

public class Demo {
    public static void main(String[] args) {
        final Car sedan = CarFactory.getCar(CarType.SEDAN);
        System.out.println(sedan.getCarInfo());

        final Car hatchback = CarFactory.getCar(CarType.HATCHBACK);
        System.out.println(hatchback.getCarInfo());
    }
}
