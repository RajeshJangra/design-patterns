package patterns.structural.adapter;

public class Socket {

    public Voltage getVoltage() {
        return new Voltage(220);
    }
}
