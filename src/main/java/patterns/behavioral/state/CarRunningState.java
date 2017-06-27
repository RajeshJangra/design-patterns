package patterns.behavioral.state;

public class CarRunningState implements State {
    @Override
    public void doAction(final Context context) {
        System.out.println("Car is running");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Running";
    }
}
