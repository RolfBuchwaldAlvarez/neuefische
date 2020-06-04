package de.neuefische.controlflow.model;

public class Student {


    private String name;
    private int studentId;
    private String degreeProgram;

    //Constructor
    public Student(String name, int studentId, String degreeProgram) {
        this.name = name;
        this.studentId = studentId;
        this.degreeProgram = degreeProgram;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }



    public String toString() {
        String result = "The student "+name+" with the ID "+studentId+
                " is participating in the degree program "+degreeProgram+".";
        return result;
    }

}
