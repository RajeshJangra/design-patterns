package patterns.behavioral.strategy;

import java.util.Date;

public class Invoice {
    private int id;
    private double amount;
    private Date date;
    private PaymentMethod paymentMethod;
    private boolean isPaid;

    public Invoice(final int id, final double amount, final Date date, final PaymentMethod paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Invoice{");
        sb.append("id=").append(id);
        sb.append(", amount=").append(amount);
        sb.append(", date=").append(date);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append('}');
        return sb.toString();
    }

    public void doPayment() {
        if(!isPaid) {
            paymentMethod.pay(amount);
        } else {
            System.out.println("Already Paid");
        }
    }
}
