package org.dsu.multiplegames.exampleinterface.mathoperations;

public abstract class Operation {
    public abstract void obtainValues();
    public abstract void executeOperation();
    public abstract void printResult();
    public abstract void setSolver(MathSolver mathSolver);
}
