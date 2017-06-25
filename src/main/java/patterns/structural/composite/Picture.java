package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void fillWithColor(final String color) {
        shapes.forEach(shape -> shape.fillWithColor(color));
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Picture{");
        sb.append("shapes=").append(shapes);
        sb.append('}');
        return sb.toString();
    }
}
