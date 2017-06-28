package patterns.behavioral.chainofresponsibility;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Dispensing 180 rupees");
        new FiftyDispenser().addDispenser(new TwentyDispenser().addDispenser(new TenDispenser())).dispense(new Currency(180));

        System.out.println("\nDispensing 380 rupees");
        new HundredDispenser().addDispenser(new FiftyDispenser().addDispenser(new TwentyDispenser().addDispenser(new TenDispenser()))).dispense(new Currency(380));

    }
}
