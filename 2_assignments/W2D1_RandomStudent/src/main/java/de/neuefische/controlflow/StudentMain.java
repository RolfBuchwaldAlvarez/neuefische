package de.neuefische.controlflow;

import de.neuefische.controlflow.model.Student;
import de.neuefische.controlflow.model.StudentDB;

public class StudentMain {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        Student student1 = new Student("Jan", 12345, "Biology");
        Student student2 = new Student("Carlos", 12346, "History");
        Student student3 = new Student("Maria", 12343, "Chemistry");
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;

        StudentDB studentDB1 = new StudentDB(studentArray);
        studentDB1.randomStudent();
    }
}
