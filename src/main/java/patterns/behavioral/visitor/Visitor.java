package patterns.behavioral.visitor;

interface Visitor {
    double visit(final Mobile mobile);

    double visit(final Grapes grapes);
}
