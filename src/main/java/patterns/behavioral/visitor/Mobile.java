package patterns.behavioral.visitor;

public class Mobile implements Item {
    private int sku;
    private String name;
    private int price;
    private String type;

    public Mobile(final int sku, final String name, final int price, final String type) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(final int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public double accept(final Visitor visitor) {
        return visitor.visit(this);
    }
}
