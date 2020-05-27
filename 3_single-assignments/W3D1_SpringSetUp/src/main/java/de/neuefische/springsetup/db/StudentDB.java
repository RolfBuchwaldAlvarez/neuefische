package de.neuefische.springsetup.db;

import de.neuefische.springsetup.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDB {
    private final List<Student> students = new ArrayList<>(List.of(
            new Student("1", "Trude", 19, "UAM"),
            new Student("2", "Horst", 17, "FOM"),
            new Student("3", "Brigitte", 18, "UOC"),
            new Student("4", "Gert", 21, "UOC"),
            new Student("5", "Hermann", 20,"TUD")
    ));

    public List<Student> getStudents(){
        return students;
    }

    public void add(Student student) {
        this.students.add(student);
    }
}
