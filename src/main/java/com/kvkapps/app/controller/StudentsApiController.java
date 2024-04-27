package com.kvkapps.app.controller;

import com.kvkapps.app.domain.Student;
import com.kvkapps.app.service.StudentsService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/students")
@AllArgsConstructor
public class StudentsApiController {

    final StudentsService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> list(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> get(@PathVariable("id") Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student){
        return ResponseEntity.ok(studentService.add(student));
    }

    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student){
        return ResponseEntity.ok(studentService.add(student));
    }
}
