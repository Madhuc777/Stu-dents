package com.cg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor

@Data
@Document(collection ="Student-details")

public class StudentModel {
     @Id
    private String name;
    private int age;
    private int salary;

    public StudentModel(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name=" + name +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
