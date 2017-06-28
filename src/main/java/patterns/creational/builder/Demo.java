package patterns.creational.builder;

import patterns.creational.factory.CarType;

public class Demo {

    public static void main(String[] args) {
        final Car car = new CarBuilder().setBody("Magnesium Body").setEngine("2000CC").setType(CarType.SEDAN).setWheels("Alloy Wheels").setCarbonHood("Carbon Hood").build();

        System.out.println("car = " + car);
    }
}
