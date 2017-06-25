package patterns.prototype;

public class Book implements Literature {
    private String title;
    private double price;

    public Book(final double price, final String title) {
        this.price = price;
        this.title = title;
    }

    @Override
    public Book clone() {
        return new Book(price, title);
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
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

