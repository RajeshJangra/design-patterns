package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl<T> implements Subject<T> {

    private List<Observer> observers = new ArrayList<>();
    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(final T message) {
        this.message = message;
    }

    @Override
    public void register(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public T getUpdate(final Observer observer) {
        return message;
    }
}
