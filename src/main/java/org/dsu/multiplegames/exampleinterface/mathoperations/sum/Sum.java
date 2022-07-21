package org.dsu.multiplegames.exampleinterface.mathoperations.sum;

import org.dsu.multiplegames.exampleinterface.mathoperations.*;

public class Sum extends Operation {
    private Adder adder;
    private int value1;
    private int value2;
    private int result;

    public Sum(MathSolver mathSolver){
        super(mathSolver);
    }

    @Override
    public void obtainValues() {
        System.out.println("obtainin sum values");
        value1 = adder.getIntAdd();
        value2 = adder.getIntAdd();
    }

    @Override
    public void executeOperation() {
        System.out.println("execute sum");
        result = value1 + value2;
        
    }

    @Override
    public void printResult() {
        System.out.println("user: "+adder.toString()+" sum: "+value1+"+"+value2+"="+result);
        mathSolver.processResult(result);
        
    }

    @Override
    public void setSolver() {
        adder = (Adder) this.mathSolver;
        
        
    }

 
}
