package com.cg.controller;

import com.cg.entity.StudentModel;
import com.cg.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
@RequestMapping("Results")
public class StudentController {

Logger logger= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    StudentService service;

    @PostMapping(value = "/save")
    public String saveStudent(@RequestBody StudentModel results)
    {
        service.saveOrUpdate(results);

        return  results.getName();
    }
    @GetMapping(value = "/getAll")
    public Iterable<StudentModel> getStudents()

    {
        logger.info("[getStudents] info message");
        logger.warn("[getStudents] warn message");
        logger.error("[getStudents] error message");
        logger.debug("[getStudents] debug message");
        logger.trace("[getStudents] trace message");
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
