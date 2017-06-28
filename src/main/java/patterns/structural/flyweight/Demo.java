package patterns.structural.flyweight;

import static patterns.structural.flyweight.VehicleType.BUS;
import static patterns.structural.flyweight.VehicleType.CAR;

public class Demo {
    public static void main(String[] args) {
        final Vehicle car = VehicleFactory.getVehicle(CAR);
        System.out.println("car.getDetails() = " + car.getDetails());

        final Vehicle bus = VehicleFactory.getVehicle(BUS);
        System.out.println("bus.getDetails() = " + bus.getDetails());

        //Will be fetched from cache
        final Vehicle car2 = VehicleFactory.getVehicle(CAR);
        System.out.println("car.getDetails() = " + car2.getDetails());
    }
}
