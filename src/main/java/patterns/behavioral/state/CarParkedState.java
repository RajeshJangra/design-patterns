package patterns.behavioral.state;

public class CarParkedState implements State {
    @Override
    public void doAction(final Context context) {
        System.out.println("Car is parked");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Parked";
    }
}
