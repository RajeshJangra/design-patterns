package patterns.behavioral.state;

public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
