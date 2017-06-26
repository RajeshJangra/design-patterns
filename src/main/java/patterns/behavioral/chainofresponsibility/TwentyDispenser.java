package patterns.behavioral.chainofresponsibility;

public class TwentyDispenser implements Dispenser {
    final int DENOMINATION = 20;

    private Dispenser dispenser;

    @Override
    public void dispense(final Currency currency) {
        final int amount = currency.getAmount();

        if (amount >= DENOMINATION) {
            currency.setAmount(amount % DENOMINATION);
        }
        System.out.println("Dispensed " + amount / DENOMINATION + " Twenty rupees notes");
        if (dispenser != null) dispenser.dispense(currency);

    }

    @Override
    public Dispenser addDispenser(final Dispenser dispenser) {
        this.dispenser = dispenser;
        return this;
    }
}
