package patterns.structural.decorator;

public class Demo {

    public static void main(String[] args) {
        new Capsicum(new Onion(new Mushroom(new Margarita()))).prepare();
    }
}
