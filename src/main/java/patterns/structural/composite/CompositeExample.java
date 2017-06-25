package patterns.structural.composite;

public class CompositeExample {
    public static void main(String[] args) {
        Picture picture = new Picture();
        final Rectangle rectangle = new Rectangle();
        rectangle.fillWithColor("Red");
        picture.add(rectangle);
        final Triangle triangle = new Triangle();
        triangle.fillWithColor("Blue");
        picture.add(triangle);

        System.out.println("picture = " + picture);

        picture.fillWithColor("Green");

        System.out.println("picture = " + picture);
    }
}
