package patterns.structural.bridge;

public class Duffle extends Bag {
    
    public Duffle(final Material material) {
        super(material);
    }

    @Override
    public void make() {
        System.out.println("Making " + getClass().getSimpleName() + " of " + material.getClass().getSimpleName() + " material");
    }
}
