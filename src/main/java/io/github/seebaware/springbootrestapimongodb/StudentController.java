package io.github.seebaware.springbootrestapimongodb;


import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(
            "/findAll"
    )
    public List<Student> fetchAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping(
            path="/create"
    )
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

}
