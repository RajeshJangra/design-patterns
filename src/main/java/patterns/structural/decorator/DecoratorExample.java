package patterns.structural.decorator;

public class DecoratorExample {

    public static void main(String[] args) {
        new Capsicum(new Onion(new Mushroom(new Margarita()))).prepare();
    }
}
