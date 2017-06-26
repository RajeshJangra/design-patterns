package patterns.structural.decorator;

public class Onion extends Condiment {
    public Onion(final Pizza pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        addOnions();
    }

    private void addOnions() {
        System.out.println("Onions added");
    }
}
