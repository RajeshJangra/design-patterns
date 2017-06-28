package patterns.creational.prototype;

public class Demo {

    public static void main(String[] args) {
        Book book = new Book(10.0D, "Programming Pearls");
        System.out.println("Programming Pearls = " + book);
        final Book clone = book.clone();
        clone.setPrice(11.95);
        System.out.println("clone = " + clone);
    }
}
