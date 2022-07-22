package org.dsu.multiplegames;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.text.html.HTMLDocument.RunElement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    boolean result;
    
    @BeforeClass
    public static void beforeClass(){
        System.out.println("preparando context todo ");
    }


    @Before
    public void beforeEach(){
        System.out.println("before");
        result = true;
    }

    @After
    public void afterEach(){
        System.out.println("after");
    }

   
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("test1");
        assertTrue( result );
    }

    @Ignore
    @Test
    public void shouldAnswerWithFalse()
    {
        System.out.println("test2");
        assertFalse(false);
    }



    @AfterClass
    public static void afterClass(){
        System.out.println("cerrando todo ");
    }
}
