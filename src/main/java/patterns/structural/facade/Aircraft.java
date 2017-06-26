package patterns.structural.facade;

public abstract class Aircraft implements Vehicle {
    @Override
    public String getDetails() {
        return "Aircraft";
    }

    public void fly() {
        System.out.println("Flying");
    }
}
