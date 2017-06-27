package patterns.behavioral.strategy;

import java.util.Date;

public class StrategyExample {

    public static void main(String[] args) {
        final BankAccountPaymentMethod bankAccountPaymentMethod = new BankAccountPaymentMethod(1, "Harrison Ford", "Branch Id 1");
        Invoice invoice1 = new Invoice(1, 1200.00, new Date(), bankAccountPaymentMethod);
        invoice1.doPayment();

        final CreditCardPaymentMethod creditCardPaymentMethod = new CreditCardPaymentMethod(2, "Robert De Niro", new Date());
        Invoice invoice2 = new Invoice(2, 2500, new Date(), creditCardPaymentMethod);
        invoice2.doPayment();
    }
}
