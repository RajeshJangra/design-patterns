package patterns.prototype;

public class Journal implements Literature {
    private String title;
    private double price;

    public Journal(final double price, final String title) {
        this.price = price;
        this.title = title;
    }

    @Override
    public Journal clone() {
        return new Journal(price, title);
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Journal{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
