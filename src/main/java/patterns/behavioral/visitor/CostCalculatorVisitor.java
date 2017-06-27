package patterns.behavioral.visitor;

public class CostCalculatorVisitor implements Visitor {
    @Override
    public double visit(final Mobile mobile) {
        if (mobile.getType().equals("REFURBISHED")) {
            return mobile.getPrice() * (.8);
        }
        return mobile.getPrice();
    }

    @Override
    public double visit(final Grapes grapes) {
        return grapes.getQuantity() * grapes.getPricePerKg();
    }
}
