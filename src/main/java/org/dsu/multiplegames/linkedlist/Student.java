package org.dsu.multiplegames.linkedlist;

public class Student {
    private String name;
    private int id;
    private Student nextStudent;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name==null)||(name.trim().isBlank()))
            return;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public Student getNextStudent() {
        return nextStudent;
    }
    public void setNextStudent(Student nextStudent) {
        this.nextStudent = nextStudent;
    }
    
}
