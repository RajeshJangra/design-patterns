package patterns.behavioral.mediator;

public abstract class User {
    protected Messenger messenger;
    protected String name;


    public User(final String name, final Messenger messenger) {
        this.name = name;
        this.messenger = messenger;
    }

    public abstract void send(final String message);

    public abstract void receive(final String message);
}
