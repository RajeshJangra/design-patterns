package patterns.behavioral.visitor;

public class Grapes implements Item {
    private String name;
    private int pricePerKg;
    private int quantity;

    public Grapes(final String name, final int pricePerKg, final int quantity) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(final int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double accept(final Visitor visitor) {
        return visitor.visit(this);
    }
}
