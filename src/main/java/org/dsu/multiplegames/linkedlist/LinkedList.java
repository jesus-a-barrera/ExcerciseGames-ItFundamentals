package org.dsu.multiplegames.linkedlist;

public class LinkedList {

    private Student root;

    private int lenght = 0;

    public int getLenght() {
        return lenght;
    }

    public LinkedList(){
        root = null;
    }

    public void append(Student st){
        if (root == null){
            root = st;
            lenght++;
            return;
        }

        Student tmp = root;
        while (tmp.getNextStudent() != null) {
            if (st.getName().equalsIgnoreCase(tmp.getName())){
                return;
            }
            tmp = tmp.getNextStudent();
        }
        tmp.setNextStudent(st);
        lenght++;
    }

    public Student[] getListStudents(){
        Student[] result = new Student[lenght];
        Student studentTmp = root;
        int cont = 0;
        while (studentTmp!=null) {
            result[cont]=studentTmp;
            cont++;
            studentTmp = studentTmp.getNextStudent();
        }

        return result;
    }
    
}
