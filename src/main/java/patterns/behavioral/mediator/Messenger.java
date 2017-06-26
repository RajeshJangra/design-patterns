package patterns.behavioral.mediator;

interface Messenger {
    
    void sendMessage(User sender, String message);

    void addUser(User user);
}
