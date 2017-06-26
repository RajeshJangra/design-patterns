package patterns.behavioral.chainofresponsibility;

public class HundredDispenser implements Dispenser {
    final int DENOMINATION = 100;

    private Dispenser dispenser;

    @Override
    public void dispense(final Currency currency) {
        final int amount = currency.getAmount();

        if (amount >= DENOMINATION) {
            currency.setAmount(amount % DENOMINATION);
        }
        System.out.println("Dispensed " + amount / DENOMINATION + " Hundred rupees notes");
        if (dispenser != null) {
            dispenser.dispense(currency);
        }

    }

    @Override
    public Dispenser addDispenser(final Dispenser dispenser) {
        this.dispenser = dispenser;
        return this;
    }
}
