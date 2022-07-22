package org.dsu.multiplegames.exampleinterface.mathoperations;

public abstract class Operation {
    protected MathSolver mathSolver;

    public Operation(MathSolver mathSolver){
        this.mathSolver = mathSolver;
    }

    public abstract void obtainValues();
    public abstract void executeOperation();
    public abstract void printResult();
    public abstract void setSolver();
}
