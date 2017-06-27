package patterns.behavioral.visitor;

interface Item {
    double accept(Visitor visitor);
}
