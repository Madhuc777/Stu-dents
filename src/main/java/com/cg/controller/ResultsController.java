package com.cg.controller;

import com.cg.entity.StudentModel;
import com.cg.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("Results")
public class ResultsController {
    @Autowired
    StudentService service;

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody StudentModel results)
    {
        service.saveOrUpdate(results);
        return  results.getName();
    }
    @GetMapping(value = "/getAll")
    public Iterable<StudentModel> getResults()
    {
        return  service.listAll();
    }

    @PutMapping(value = "/edit{id}")
    private StudentModel update(@RequestBody StudentModel students, @PathVariable(name = "name")String name)

    {
       students.setName(name);
       service.saveOrUpdate(students);
       return students;
    }

    @DeleteMapping(value = "delete/{id}")
    public void   deleteResults(@PathVariable(name = "id")String name )
    {
      service.deletestudent(name);
    }



}
