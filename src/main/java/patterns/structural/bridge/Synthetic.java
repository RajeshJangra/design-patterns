package patterns.structural.bridge;

public class Synthetic implements Material {
    @Override
    public void useMaterial() {
        useSynthetic();
    }

    public void useSynthetic() {

    }
}
