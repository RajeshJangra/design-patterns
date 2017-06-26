package patterns.structural.decorator;

public class Margarita implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Started making pizza");
        addBase();
        addTomatoSauce();
        sprinkleCheese();
    }

    private void addBase() {
        System.out.println("Base prepared");
    }

    private void addTomatoSauce() {
        System.out.println("Tomato sauce added");
    }

    private void sprinkleCheese() {
        System.out.println("Cheese Sprinkled");
    }
}
