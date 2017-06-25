package patterns.structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter {

    @Override
    public Voltage getIndiaSocket() {
        return getVoltage();
    }

    @Override
    public Voltage getJapanSocket() {
        Voltage voltage = getVoltage();
        return convertVoltage(voltage, 4);
    }

    @Override
    public Voltage getUSSocket() {
        Voltage voltage = getVoltage();
        return convertVoltage(voltage, 2);
    }

    private Voltage convertVoltage(Voltage voltage, int i) {
        return new Voltage(voltage.getVoltage() / i);
    }

}
