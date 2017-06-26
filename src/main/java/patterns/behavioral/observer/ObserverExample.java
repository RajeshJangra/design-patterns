package patterns.behavioral.observer;

public class ObserverExample {

    public static void main(String[] args) {
        Subject<String> subject = new SubjectImpl<>();

        Observer<String> observer1 = new ObserverImpl<>("Observer1", subject);
        Observer<String> observer2 = new ObserverImpl<>("Observer2", subject);
        Observer<String> observer3 = new ObserverImpl<>("Observer3", subject);

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        //no updated yet
        observer1.update();

        subject.setMessage("New Message");

        subject.notifyObservers();

    }
}
