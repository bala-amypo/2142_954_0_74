package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity;
import com.example.demo.service.StudentServices;
@RestController
public class Studclt{
    @Autowired
    private StudentServices ser;
    @PostMapping("/Postadd")
    public Studententity saveData(@RequestBody Studententity st){
        return ser.saveData(st);
    }
    @GetMapping("/Getadd/{id}")
    public Studententity getStudent(@PathVariable int id){
        return ser.getStudent(id);
    }
    @GetMapping("/GetAll")
    public List<Studententity> getAllStudents(){
        return ser.getStudents();
    }
    @putMapping("/Update/{id}")
    public Studententity updateStudent(@PathVariable int id,@RequestBody Studententity st){
        return ser.update
    }
}