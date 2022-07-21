package org.dsu.multiplegames.exampleinterface.mathoperations.substract;

import org.dsu.multiplegames.exampleinterface.mathoperations.MathSolver;
import org.dsu.multiplegames.exampleinterface.mathoperations.Operation;

public class Substract extends Operation {
    private Substractor substractor;
    private int value1;
    private int value2;
    private int result;

    public Substract(MathSolver mathSolver){
        super(mathSolver);
    }

    @Override
    public void obtainValues() {
        System.out.println("obtain substract values");
        value1 = substractor.getIntSubstract();
        value2 = substractor.getIntSubstract();
        
    }

    @Override
    public void executeOperation() {
        System.out.println("executing substract");
        result = value1 - value2;
    }

    @Override
    public void printResult() {
        System.out.println("user: "+substractor.toString()+" substract: "+value1+"-"+value2+"="+result);
        mathSolver.processResult(result);
    }

    @Override
    public void setSolver() {
        substractor = (Substractor)this.mathSolver;
        
    }
    
}
