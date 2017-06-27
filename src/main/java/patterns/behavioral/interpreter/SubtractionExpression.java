package patterns.behavioral.interpreter;

public class SubtractionExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public SubtractionExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return expression1.interpret() - expression2.interpret();
    }
}
