package patterns.structural.facade;

import static patterns.structural.facade.JourneyMode.AIR;
import static patterns.structural.facade.JourneyMode.ROAD;
import static patterns.structural.facade.JourneyType.ECONOMY;
import static patterns.structural.facade.JourneyType.LUXURY;

public class VehicleFacade {

    public void journey(JourneyType type, JourneyMode mode) {
        if (mode.equals(ROAD)) {
            if (type.equals(LUXURY)) {
                new LuxuryCar().driveLuxury();
            } else if (type.equals(ECONOMY)) {
                new EconomyCar().driveEconomy();
            }
        } else if (mode.equals(AIR)) {
            if (type.equals(LUXURY)) {
                new CharteredFlight().flyLuxury();
            } else if (type.equals(ECONOMY)) {
                new EconomyFlight().flyCoach();
            }
        }

    }
}
