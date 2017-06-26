package patterns.structural.bridge;

public class Suitcase extends Bag {

    public Suitcase(final Material material) {
        super(material);
    }

    @Override
    public void make() {
        System.out.println("Making " + getClass().getSimpleName() + " of " + material.getClass().getSimpleName() + " material");
    }
}
