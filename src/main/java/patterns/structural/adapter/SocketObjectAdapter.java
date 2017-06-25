package patterns.structural.adapter;

public class SocketObjectAdapter implements SocketAdapter {

    Socket socket = new Socket();


    @Override
    public Voltage getIndiaSocket() {
        return socket.getVoltage();
    }

    @Override
    public Voltage getJapanSocket() {
        Voltage voltage = socket.getVoltage();
        return convertVoltage(voltage, 4);
    }

    @Override
    public Voltage getUSSocket() {
        Voltage voltage = socket.getVoltage();
        return convertVoltage(voltage, 2);
    }

    private Voltage convertVoltage(Voltage voltage, int i) {
        return new Voltage(voltage.getVoltage() / i);
    }

}
