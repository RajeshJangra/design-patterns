package patterns.behavioral.templatemethod;

public class Coffee extends WarmBeverage {
    @Override
    void startAppliance() {
        System.out.println("Starting coffee machine");
    }

    @Override
    void addBeverage() {
        System.out.println("Add coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar");
    }
}
