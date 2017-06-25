package patterns.creational.builder;

import patterns.creational.factory.CarType;

public class CarBuilder {

    CarType type;
    String body;
    String wheels;
    String engine;

    //optionals
    String nitro;
    String carbonHood;

    public CarBuilder() {
    }

    public CarBuilder setType(final CarType type) {
        this.type = type;
        return this;
    }

    public CarBuilder setBody(final String body) {
        this.body = body;
        return this;
    }

    public CarBuilder setWheels(final String wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setEngine(final String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setNitro(final String nitro) {
        this.nitro = nitro;
        return this;
    }

    public CarBuilder setCarbonHood(final String carbonHood) {
        this.carbonHood = carbonHood;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}
