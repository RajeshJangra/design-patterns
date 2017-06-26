package patterns.behavioral.mediator;

public class UserImpl extends User {

    public UserImpl(final String name, final Messenger messenger) {
        super(name, messenger);
    }

    @Override
    public void send(final String message) {
        messenger.sendMessage(this, message);
    }

    @Override
    public void receive(final String message) {
        System.out.println(name +  " received a message: " + message);
    }
}
