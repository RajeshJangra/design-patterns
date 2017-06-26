package patterns.structural.decorator;

public class Capsicum extends Condiment {
    public Capsicum(final Pizza pizza) {
        super(pizza);
    }

    public void prepare() {
        super.prepare();
        addCapsicum();
    }

    private void addCapsicum() {
        System.out.println("Capsicum added");
    }
}
