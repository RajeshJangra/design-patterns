package patterns.behavioral.state;

public class StateExample {

    public static void main(String[] args) {
        Context context = new Context();

        final CarParkedState parkedState = new CarParkedState();
        parkedState.doAction(context);
        System.out.println(context.getState());

        final CarRunningState runningState = new CarRunningState();
        runningState.doAction(context);
        System.out.println(context.getState());
    }
}
