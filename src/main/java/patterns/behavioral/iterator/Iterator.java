package patterns.behavioral.iterator;

interface Iterator<T> {
    boolean hasNext();

    T next();
}
