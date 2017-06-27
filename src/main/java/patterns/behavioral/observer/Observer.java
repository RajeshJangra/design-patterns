package patterns.behavioral.observer;

interface Observer<T> {
    void update();

    void setSubject(Subject<T> subject);

}
