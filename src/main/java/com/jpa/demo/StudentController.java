package com.jpa.demo;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repo;

    @GetMapping(value = "/student")
    public String welcome() {
        return "Welcome To Students Controller";
    }
      // http://localhost:8083/get
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Iterable<Student> getStudent() {
        return repo.findAll();
    } 
     // http://localhost:8083/{id}
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable int id) {
        return repo.findById(id);
    }
      // http://localhost:8083/add
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Student getStudent(@RequestBody Student stud) {
        return repo.save(stud);
    }
    // http://localhost:8083/delete/{id}
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delStudent(@PathVariable int id) {
        repo.deleteById(id);
    }
      // http://localhost:8083/update/{id}
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Student update(@PathVariable int id, @RequestBody Student student) {
        
        Student studentToUpdate = repo.findById(id).get();
        studentToUpdate.setfirst_name(student.getfirst_name());
        studentToUpdate.setlast_name(student.getlast_name());
        studentToUpdate.setage(student.getage());
         return repo.save(studentToUpdate);
        }

   


    
}