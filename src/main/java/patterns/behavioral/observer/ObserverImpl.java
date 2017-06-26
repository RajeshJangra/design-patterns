package patterns.behavioral.observer;

public class ObserverImpl<T> implements Observer<T> {
    private String name;
    private Subject<T> subject;

    public ObserverImpl(final String name, final Subject<T> subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        final Object update = subject.getUpdate(this);
        final String message = update != null ? name + " received " + update : "No updates";
        System.out.println(message);
    }

    @Override
    public void setSubject(final Subject subject) {
        this.subject = subject;
    }
}
