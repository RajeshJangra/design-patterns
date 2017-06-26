package patterns.structural.decorator;

public class Mushroom extends Condiment {
    public Mushroom(final Pizza pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        addMushroom();
    }

    private void addMushroom() {
        System.out.println("Mushroom added");
    }
}
