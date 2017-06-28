package patterns.behavioral.memento;

public class Caretaker {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("State 1");
        originator.setState("State 2");
        originator.setState("State 3");
        String previoudState = null;
        while ((previoudState = originator.undo()) != null) {
            System.out.println("previoudState = " + previoudState);
        }
    }
}
