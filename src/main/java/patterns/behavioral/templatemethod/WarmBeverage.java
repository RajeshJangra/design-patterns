package patterns.behavioral.templatemethod;

public abstract class WarmBeverage {

    public void prepare() {
        System.out.println("Started");
        addWater();
        addBeverage();
        startAppliance();
        brew();
        pour();
        addCondiments();
        System.out.println("Done. Enjoy your " + getClass().getSimpleName());
    }

    abstract void startAppliance();

    private void addWater() {
        System.out.println("Added water to utensil");
    }

    abstract void addBeverage();

    private void brew() {
        System.out.println("Brewing");
    }

    private void pour() {
        System.out.println("Pouring");
    }

    abstract void addCondiments();
}
