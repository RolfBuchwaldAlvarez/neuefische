package de.neuefische.controlflow.model;

public class StudentDB {

    private Student[] students;
    private String name;
    private int studentId;

    public StudentDB(Student[] students) {
        this.students = students;
    }



    public String toString() {
        String list = "";
        for(int i = 0; i < students.length; i++) {
                list += students[i] + " ";
        }
        System.out.println(list);
        return list;
    }

    public Student randomStudent() {
        int randomGuy = (int)(Math.random() * students.length);
        System.out.println(students[randomGuy]);
        return students[randomGuy];
    }

}
