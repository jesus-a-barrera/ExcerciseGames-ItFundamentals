package org.dsu.multiplegames.exampleinterface;

import org.dsu.multiplegames.exampleinterface.mathoperations.Operation;
import org.dsu.multiplegames.exampleinterface.mathoperations.substract.Substract;
import org.dsu.multiplegames.exampleinterface.mathoperations.sum.Sum;
import org.dsu.multiplegames.exampleinterface.player.Player;
import org.dsu.multiplegames.exampleinterface.soldiers.Soldier;

public class ExampleInterface {
    public ExampleInterface(){
        Player player1 = new Player("Oliver");
        executeOperation(new Sum(player1) );
        executeOperation(new Substract(player1) );
        System.out.println("/n/n soldado /n/n");
        Soldier soldier1 = new Soldier("goku", 40, "dragon ball Z");
        executeOperation(new Sum(soldier1) );
        executeOperation(new Substract(soldier1) );
    }

    public void executeOperation(Operation operation){
        operation.setSolver();
        operation.obtainValues();
        operation.executeOperation();
        operation.printResult();
    }
    
    /*
    public ExampleInterface(){
        Player player1 = new Player("Oliver");
        executeOperation(new Sum(), player1);
        executeOperation(new Substract(), player1);
        System.out.println("/n/n soldado /n/n");
        Soldier soldier1 = new Soldier("goku", 40, "dragon ball Z");
        executeOperation(new Sum(), soldier1);
        executeOperation(new Substract(), soldier1);
    }

    public void executeOperation(Operation operation){
        operation.setSolver();
        operation.obtainValues();
        operation.executeOperation();
        operation.printResult();
    }

     */
}
