package de.neuefische.springsetup.controller;


import de.neuefische.springsetup.model.Student;
import de.neuefische.springsetup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("university")
public class UniversityController {

    private final StudentService service;

    @Autowired
    public UniversityController(StudentService service) {
        this.service = service;
    }

    @GetMapping("{universityId}")
    public List<Student> getStudents(@PathVariable String universityId) {
        return service.findStudentsByUniversity(universityId);
    }

}
