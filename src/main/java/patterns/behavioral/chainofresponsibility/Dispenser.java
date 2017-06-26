package patterns.behavioral.chainofresponsibility;

interface Dispenser {

    void dispense(Currency currency);

    Dispenser addDispenser(Dispenser dispenser);
}
