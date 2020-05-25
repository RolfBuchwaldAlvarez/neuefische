package de.neuefische.springsetup.utils;

import de.neuefische.springsetup.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")

public class StudentController {

    private final List<Student> studentList = new ArrayList<>();
    public StudentController() {
        studentList.add(new Student("1", "Trude", 19));
        studentList.add(new Student("2", "Horst", 17));
        studentList.add(new Student("3", "Brigitte", 18));
        studentList.add(new Student("4", "Hermann", 20));
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentList;
        }

    @PutMapping
    public Student addStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable String id){
        for (Student student : studentList) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
