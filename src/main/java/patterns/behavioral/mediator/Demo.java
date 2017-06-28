package patterns.behavioral.mediator;

public class Demo {

    public static void main(String[] args) {
        final MessengerImpl messenger = new MessengerImpl();
        User user1 = new UserImpl("A", messenger);
        User user2 = new UserImpl("B", messenger);
        User user3 = new UserImpl("C", messenger);
        messenger.addUser(user1);
        messenger.addUser(user2);
        messenger.addUser(user3);
        user1.send("Hello");
    }
}
