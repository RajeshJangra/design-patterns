package patterns.structural.adapter;

public class Voltage {
    private int voltage;

    public Voltage(int v) {
        this.voltage = v;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int volts) {
        this.voltage = volts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voltage{");
        sb.append("voltage=").append(voltage);
        sb.append('}');
        return sb.toString();
    }
}
