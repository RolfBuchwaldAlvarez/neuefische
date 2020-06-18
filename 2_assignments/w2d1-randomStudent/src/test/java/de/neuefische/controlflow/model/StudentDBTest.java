package de.neuefische.controlflow.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    public void ifStudentIndexIs2ShouldReturnPeter() {
        Student[] studentArray = new Student[3];
        Student student1 = new Student("Jan", 12345, "Biology");
        Student student2 = new Student("Carlos", 12346, "History");
        Student student3 = new Student("Maria", 12343, "Chemistry");
    studentArray[0] = student1;
    studentArray[1] = student2;
    studentArray[2] = student3;
    StudentDB testDB = new StudentDB(studentArray);

    String result = testDB.toString();
    assertEquals("The student Jan with the ID 12345 is participating in the degree program Biology. The student Carlos with the ID 12346 is participating in the degree program History. The student Maria with the ID 12343 is participating in the degree program Chemistry. ", result);

    }

    /*@Test
    public void printStudentList() {
        String[] studentArray = new String[5];
        studentArray[0] = "Jan";
        studentArray[1] = "Paul";
        studentArray[2] = "Peter";
        studentArray[3] = "Horst";
        studentArray[4] = "Elke";
        StudentDB testDB = new StudentDB(studentArray);

        String result = testDB.printStudents();
        assertEquals("Jan Paul Peter Horst Elke ", result);

    }*/

}