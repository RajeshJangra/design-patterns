package patterns.behavioral.memento;

import java.util.Stack;

public class Originator {
    private String state;

    private Stack<Memento> mementos;

    public Originator() {
        mementos = new Stack<>();
    }

    public void setState(String state) {
        mementos.push(new Memento(state));
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String undo() {
        return mementos.size() > 0 ? mementos.pop().getState() : null;
    }
}
