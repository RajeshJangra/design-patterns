package patterns.behavioral.chainofresponsibility;

public class Currency {
    private int amount;

    public Currency(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }
}
