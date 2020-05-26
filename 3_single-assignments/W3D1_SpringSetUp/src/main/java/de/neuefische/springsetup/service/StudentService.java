package de.neuefische.springsetup.service;

import de.neuefische.springsetup.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentList = new ArrayList<>(List.of(
        new Student("1", "Trude", 19, "UAM"),
        new Student("2", "Horst", 17, "FOM"),
        new Student("3", "Brigitte", 18, "UOC"),
        new Student("3", "Brigitte", 18, "UOC"),

        new Student("4", "Hermann", 20,"TUD")
    ));

    public StudentService() {
    }

    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public List<Student> findStudentsByUniversity(String universityId) {
      List<Student> result = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getUniversityId().equals(universityId)) {
                result.add(student);
            }
        }
        return result;
    }
}
