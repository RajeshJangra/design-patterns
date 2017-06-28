package patterns.behavioral.iterator;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\n\tid=" + id +
                ", \n\tname='" + name + '\'' +
                ", \n\tage=" + age +
                '}';
    }
}
