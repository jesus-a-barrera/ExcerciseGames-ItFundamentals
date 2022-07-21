package org.dsu.multiplegames.exampleinterface;

import org.dsu.multiplegames.exampleinterface.mathoperations.MathSolver;
import org.dsu.multiplegames.exampleinterface.mathoperations.Operation;
import org.dsu.multiplegames.exampleinterface.mathoperations.substract.Substract;
import org.dsu.multiplegames.exampleinterface.mathoperations.sum.Sum;
import org.dsu.multiplegames.exampleinterface.player.Player;

public class ExampleInterface {
    
    public ExampleInterface(){
        Player player1 = new Player("Oliver");
        executeOperation(new Sum(), player1);
        executeOperation(new Substract(), player1);

    }

    public void executeOperation(Operation operation, MathSolver solver){
        operation.setSolver(solver);
        operation.obtainValues();
        operation.executeOperation();
        operation.printResult();
    }
}
