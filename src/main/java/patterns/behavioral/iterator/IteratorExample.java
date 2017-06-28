package patterns.behavioral.iterator;

public class IteratorExample {

    public static void main(String[] args) {
        Population population = getPopulation();
        Iterator<Person> iterator = population.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static Population getPopulation() {
        Population population = new Population();
        population.addPerson(new Person(1, "A", 12));
        population.addPerson(new Person(2, "B", 21));
        population.addPerson(new Person(3, "C", 17));
        population.addPerson(new Person(4, "D", 35));
        population.addPerson(new Person(5, "E", 15));
        population.addPerson(new Person(6, "F", 29));

        return population;
    }
}
