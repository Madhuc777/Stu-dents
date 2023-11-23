package com.cg.universityresults;

import com.cg.entity.StudentModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UniversityResultsApplicationTests {

	@Test
	void contextLoads() {
		String name = "Reddy";
		int age = 23;
		int salary = 50000;

		StudentModel student = new StudentModel();
		student.setName(name);
		student.setAge(age);
		student.setSalary(salary);

		assertEquals(name, student.getName());
		assertEquals(age, student.getAge());
		assertEquals(salary, student.getSalary());
	}

	}


