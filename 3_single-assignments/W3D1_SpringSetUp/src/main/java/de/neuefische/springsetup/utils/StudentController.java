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
    public List<Student> getStudent(@RequestParam(name="q", required = false) String query,@RequestParam(required = false) Integer minage) {
        if (query == null) {
            return studentList;
        }
        ArrayList<Student> matchingStudents = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getAge() > minage) {
                matchingStudents.add(student);
            }
        }
        return matchingStudents;
    }

    @PutMapping
    public Student addStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }

 /*   @DeleteMapping
    public String deleteStudent(@PathVariable String id){
        return id;
    }

  */

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable String id){
        for (Student student : studentList) {
            if(student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    private boolean studentMatchQuery(Student student, String query, Integer minage){
        if(student.getAge() < minage) {
            return false;
        }
        
    }
}
