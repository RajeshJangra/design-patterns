package patterns.structural.facade;

import static patterns.structural.facade.JourneyMode.AIR;
import static patterns.structural.facade.JourneyMode.ROAD;
import static patterns.structural.facade.JourneyType.ECONOMY;
import static patterns.structural.facade.JourneyType.LUXURY;

public class FacadeExample {

    public static void main(String[] args) {
        VehicleFacade facade = new VehicleFacade();
        facade.journey(LUXURY, AIR);
        facade.journey(ECONOMY, AIR);
        facade.journey(LUXURY, ROAD);
        facade.journey(ECONOMY, ROAD);
    }
}
