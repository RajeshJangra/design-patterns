package patterns.behavioral.observer;

interface Subject<T> {

    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers();

    Object getUpdate(Observer obj);

    void setMessage(final T message);
}
