package patterns.creational.builder;

import patterns.creational.factory.CarType;

public class Car {

    public Car(CarBuilder builder) {
        this.type = builder.type;
        this.body = builder.body;
        this.wheels = builder.wheels;
        this.engine = builder.engine;
        this.nitro = builder.nitro;
        this.carbonHood = builder.carbonHood;
    }

    CarType type;
    String body;
    String wheels;
    String engine;

    //optionals
    String nitro;
    String carbonHood;

    public CarType getType() {
        return type;
    }

    public void setType(final CarType type) {
        this.type = type;
    }

    public String getCarInfo() {
        return "Its a sedan";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("type=").append(type);
        sb.append(", body='").append(body).append('\'');
        sb.append(", wheels='").append(wheels).append('\'');
        sb.append(", engine='").append(engine).append('\'');
        sb.append(", nitro='").append(nitro).append('\'');
        sb.append(", carbonHood='").append(carbonHood).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
