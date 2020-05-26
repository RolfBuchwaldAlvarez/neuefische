package de.neuefische.springsetup.controller;

import de.neuefische.springsetup.model.Student;
import de.neuefische.springsetup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents(@RequestParam(name="q", required = false) String query,@RequestParam(name="a", required = false) Integer minage) {
        if (query == null) {
            return
        }
        return service.getStudents();
    }

    @PutMapping
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

 /*   @GetMapping
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

 *//*   @DeleteMapping
    public String deleteStudent(@PathVariable String id){
        return id;
    }

  *//*

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

    }*/
}
