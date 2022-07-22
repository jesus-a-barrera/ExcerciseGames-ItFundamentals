package org.dsu.multiplegames.exampleinterface.soldiers;

import org.dsu.multiplegames.exampleinterface.mathoperations.*;;


public class Soldier implements MathSolver {
    private String name;
    private int age;
    private String country;
    
    @Override
    public String toString() {
        return "Soldier [age=" + age + ", country=" + country + ", name=" + name + "]";
    }

    public Soldier(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public int getIntAdd() {
        return 200;
    }

    @Override
    public int getIntSubstract() {
        return 150;
    }

    @Override
    public void processResult(int result) {
        System.out.println("desde soldier procesando result "+ result);
        
    }
    
}
