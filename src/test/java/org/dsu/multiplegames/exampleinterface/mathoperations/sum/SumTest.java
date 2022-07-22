package org.dsu.multiplegames.exampleinterface.mathoperations.sum;

import static org.junit.Assert.assertEquals;

import org.dsu.multiplegames.exampleinterface.mathoperations.*;
import org.dsu.multiplegames.exampleinterface.player.Player;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    Dummy tmp ;

    @Before
    public void initDumm(){
        tmp = new Dummy(15);
    }

    @Test
    public void testExecuteOperation() {

    }

    @Test
    public void testObtainValues() {
        Dummy dummy1 = new Dummy(10);

        Sum sum = new Sum(dummy1);
        sum.obtainValues();
        assertEquals(dummy1.value, sum.getValue1());
        assertEquals(dummy1.value, sum.getValue2());

    }

    @Test
    public void testPrintResult() {

    }

    @Test
    public void testSetSolver() {

    }
}

class Dummy implements MathSolver{
    public int value;

    public Dummy(int value){
        this.value = value;
    }

    @Override
    public int getIntAdd() {
        return value;
    }

    @Override
    public int getIntSubstract() {
        return 15;
    }

    @Override
    public void processResult(int result) { 
    }

}
