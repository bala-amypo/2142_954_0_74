// package com.example.demo.controller;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import com.example.demo.entity.Studententity;
// import com.example.demo.service.Studentservice;
// @RestController
// public class Studentcontroller{
//     @Autowired
//     private Studentservice ser;
//     @PostMapping("/Postadd")
//     public Studententity saveData(@RequestBody Studententity st){
//         return ser.saveData(st);
//     }
//     @GetMapping("/Getadd/{id}")
//     public Studententity getStudent(@PathVariable int id){
//         return ser.getStudent(id);
//     }
//     @GetMapping("/GetAll")
//     public List<Studententity> getAllStudents(){
//         return ser.getStudents();
//     }
//     @PutMapping("/Update/{id}")
//     public Studententity updateStudent(@PathVariable int id,@RequestBody Studententity st){
//         return ser.updateStudent(id,st);
//     }
// }

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    @Autowired
    private Studentservice ser;

    @PostMapping
    public Studententity addStudent(@RequestBody Studententity st) {
        return ser.saveData(st);
    }

    @GetMapping
    public List<Studententity> getAll() {
        return ser.getStudents();
    }

    @GetMapping("/{id}")
    public Studententity getOne(@PathVariable int id) {
        return ser.getStudent(id);
    }

    @PutMapping("/{id}")
    public Studententity update(@PathVariable int id, @RequestBody Studententity st) {
        return ser.updateStudent(id, st);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        ser.deleteStudent(id);
    }
}
