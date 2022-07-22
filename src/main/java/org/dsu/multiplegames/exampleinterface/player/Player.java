package org.dsu.multiplegames.exampleinterface.player;

import org.dsu.multiplegames.exampleinterface.mathoperations.MathSolver;

public class Player implements MathSolver {
    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + "]";
    }

    @Override
    public int getIntAdd() {
        return 6;
    }

    @Override
    public int getIntSubstract() {
        return 12;
    }

    @Override
    public void processResult(int result) {
        System.out.println("desde player procesando result"+result);        
    }
    
}
