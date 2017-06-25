package patterns.creational.factory;

public class Sedan implements Car {
    CarType type;

    public CarType getType() {
        return type;
    }

    public void setType(final CarType type) {
        this.type = type;
    }

    public String getCarInfo() {
        return "Its a sedan";
    }
}
