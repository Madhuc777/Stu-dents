package com.cg.repository;

import com.cg.entity.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentModel,String> {
    void deleteByName(String name);
}
