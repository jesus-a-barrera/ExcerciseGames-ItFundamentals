package org.dsu.multiplegames.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student student ;
    String studentName = "olIveR";

    @Before
    public void initStudentObject(){
        student = new Student(studentName, 23);
    }

    @Test
    public void testGetName() {
        assertEquals(studentName, student.getName());
    }


    @Test
    public void shouldNameNotBeNUll(){
        student.setName(null);
        assertNotNull(student.getName());
    }

    @Test 
    public void shouldNameNotAccpetEmptyStrings(){
        String nameBefore = student.getName();
        student.setName("   ");
        assertEquals(nameBefore, student.getName());
    }

    @Test
    public void shouldSetNextStudentNull(){
        student.setNextStudent(null);
        assertNull(student.getNextStudent());
    }

    @Test 
    public void shouldSetNextStudentCorrectly(){
        Student tmpStudent = new Student("pancho", 35);
        student.setNextStudent(tmpStudent);
        assertEquals(tmpStudent, student.getNextStudent());
    }
}
