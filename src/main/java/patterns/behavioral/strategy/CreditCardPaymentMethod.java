package patterns.behavioral.strategy;

import java.util.Date;

public class CreditCardPaymentMethod implements PaymentMethod {

    private int credirCardNo;
    private String name;
    private Date expiryDate;

    public CreditCardPaymentMethod(final int credirCardNo, final String name, final Date expiryDate) {
        this.credirCardNo = credirCardNo;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(final double amount) {
        System.out.println("Paid: " + amount + " with Credit Card: " + this);
    }

    public int getCredirCardNo() {
        return credirCardNo;
    }

    public String getName() {
        return name;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    //Don't do it in actual systems
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditCardPaymentMethod{");
        sb.append("credirCardNo=").append(credirCardNo);
        sb.append(", name='").append(name).append('\'');
        sb.append(", expiryDate=").append(expiryDate);
        sb.append('}');
        return sb.toString();
    }
}
