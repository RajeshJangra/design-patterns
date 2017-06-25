package patterns.structural.composite;

public class Triangle implements Shape {
    private String color;

    @Override
    public void fillWithColor(final String color) {
        this.color = color;
        System.out.println("Triangle filled with " + color);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
