package patterns.behavioral.visitor;

public class Demo {

    public static void main(String[] args) {
        final CostCalculatorVisitor visitor = new CostCalculatorVisitor();
        Item refurbishedMobile = new Mobile(123, "Samsung S8", 58000, "REFURBISHED");
        System.out.println(refurbishedMobile.accept(visitor));

        Item newMobile = new Mobile(123, "Samsung S8", 58000, "NEW");
        System.out.println(newMobile.accept(visitor));

        Item seedlessGrapes = new Grapes("Seedless", 200, 3);
        System.out.println(seedlessGrapes.accept(visitor));
    }
}
