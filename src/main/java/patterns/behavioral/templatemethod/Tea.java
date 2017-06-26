package patterns.behavioral.templatemethod;

public class Tea extends WarmBeverage {
    @Override
    void startAppliance() {
        System.out.println("Light Gas Stove and put teapot");
    }

    @Override
    void addBeverage() {
        System.out.println("Add tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Add honey");
    }
}
