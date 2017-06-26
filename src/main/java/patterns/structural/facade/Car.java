package patterns.structural.facade;

public abstract class Car implements Vehicle {
    @Override
    public String getDetails() {
        return "Car";
    }

    public void drive() {
        System.out.println("Driving");
    }
}
