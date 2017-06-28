package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Population {

    private List<Person> people;

    public Population() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Iterator<Person> getIterator() {
        return new SuffrageIterator();
    }

    @Override
    public String toString() {
        return "Population{" +
                "people=" + people +
                '}';
    }

    class SuffrageIterator implements Iterator<Person> {

        int current = 0;

        @Override
        public boolean hasNext() {
            for (int counter = current; counter < people.size(); counter++) {
                if (people.get(counter).getAge() >= 18) {
                    return true;
                }
                current++;
            }
            return false;
        }

        @Override
        public Person next() {
            return people.get(current++);
        }
    }
}
