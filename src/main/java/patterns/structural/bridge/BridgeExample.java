package patterns.structural.bridge;

public class BridgeExample {
    public static void main(String[] args) {
        Bag bag1 = new Duffle(new Leather());
        bag1.make();

        Bag bag2 = new Suitcase(new Synthetic());
        bag2.make();
    }
}
