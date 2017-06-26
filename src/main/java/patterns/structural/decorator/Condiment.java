package patterns.structural.decorator;

public abstract class Condiment implements Pizza {

    protected Pizza pizza;

    public Condiment(final Pizza pizza) {
        this.pizza = pizza;
    }

    public void prepare() {
        pizza.prepare();
    }
}
