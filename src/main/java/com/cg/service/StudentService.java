package com.cg.service;

import com.cg.entity.StudentModel;
import com.cg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
@Autowired
StudentRepository repo;

public  void saveOrUpdate(StudentModel students){

    repo.save(students);
}

    public Iterable<StudentModel> listAll() {
   return  this.repo.findAll();

    }

    public void deletestudent(String name) {
    repo.deleteByName(name);

    }



}
