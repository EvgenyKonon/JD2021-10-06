package by.it.astapchik.calc.model;

import by.it.astapchik.calc.exception.CalcException;

public abstract class Var implements Operation {

    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException("Operation %s + %s unsupported%n", this, other);
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException("Operation %s - %s unsupported%n", this, other);
    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException("Operation %s * %s unsupported%n", this, other);
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException("Operation %s / %s unsupported%n", this, other);
    }

    @Override
    public String toString() {
    return " unknown variable (abstract stub)";
}
}
