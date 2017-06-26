package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

import static patterns.structural.flyweight.VehicleType.*;

public class VehicleFactory {

    private static final Map<VehicleType, Vehicle> vehicles = new HashMap<>();

    public static Vehicle getVehicle(VehicleType type) {
        Vehicle vehicle = vehicles.get(type);

        if (vehicle == null) {
            switch (type) {
                case CAR:
                    vehicle = new Car();
                    vehicles.put(CAR, vehicle);
                    break;
                case TRUCK:
                    vehicle = new Truck();
                    vehicles.put(TRUCK, vehicle);
                    break;
                case BUS:
                    vehicle = new Bus();
                    vehicles.put(BUS, vehicle);
                    break;
            }
        }
        return vehicle;
    }
}
