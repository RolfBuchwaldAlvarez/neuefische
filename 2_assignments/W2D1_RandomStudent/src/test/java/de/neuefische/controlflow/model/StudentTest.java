package de.neuefische.controlflow.model;

import de.neuefische.controlflow.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void ifNamePeterRabbit() {
        //GIVEN
        String name = "Peter Rabbit";
        //WHEN
        Student testStudent = new Student();
        testStudent.setName(name);
        //THEN
        assertEquals("Peter Rabbit", testStudent.getName());
    }

    @Test
    public void ifDegreeProgramComputerScience() {
        //GIVEN
        String degreeProgram = "Computer Science";
        //WHEN
        Student testStudent = new Student();
        testStudent.setDegreeProgram(degreeProgram);
        //THEN
        assertEquals("Computer Science", testStudent.getDegreeProgram());
    }
}