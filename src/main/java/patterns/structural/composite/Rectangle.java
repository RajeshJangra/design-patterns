package patterns.structural.composite;

public class Rectangle implements Shape {
    private String color;

    @Override
    public void fillWithColor(final String color) {
        this.color = color;
        System.out.println("Rectangle filled with " + color);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
