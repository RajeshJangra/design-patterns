package patterns.structural.bridge;

public abstract class Bag {

    protected Material material;

    public Bag(final Material material) {
        this.material = material;
    }

    public abstract void make();
}
