package patterns.behavioral.interpreter;

public class InterpreterExample {
    public static void main(String[] args) {

        //14 -8 +10
        AdditionExpression additionExpression = new AdditionExpression(new SubtractionExpression(new TerminalExpression(14), new TerminalExpression(8)), new TerminalExpression(10));

        System.out.println(additionExpression.interpret());
    }
}
