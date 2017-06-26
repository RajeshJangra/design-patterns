package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessengerImpl implements Messenger {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(final User sender, final String message) {
        users.stream().filter(user -> !user.equals(sender)).forEach(user -> user.receive(message));
    }

    @Override
    public void addUser(final User user) {
        users.add(user);
    }
}
