package org.dsu.multiplegames.linkedlist;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    Student st1;
    Student st2;
    LinkedList list;

    @Before
    public void init(){
        st1 = new Student("st1", 1);
        st2 = new Student("st2", 2);
        list = new LinkedList();
    }


    @Test
    public void shuldAppendOneStudent(){
        list.append(st1);
        assertEquals(1, list.getLenght());
    }

    @Test
    public void shuldAppendTwoStudent(){
        list.append(st1);
        list.append(st2);
        assertEquals(2, list.getLenght());
    }

    @Test
    public void shuldNotAppendRepatedStudents(){
        list.append(st1);
        list.append(st2);
        list.append(st2);
        assertEquals(2, list.getLenght());
    }

    @Test 
    public void shouldAppearAllEnteredStudents(){
        list.append(st1);
        list.append(st2);
        assertArrayEquals(new Student[]{st1, st2}, list.getListStudents());
    }
}
