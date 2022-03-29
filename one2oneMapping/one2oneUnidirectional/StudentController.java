package com.example.one2oneUnidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping
	public ResponseEntity<Student> save (@RequestBody Student student)
	{
		studentRepository.save(student);
		return ResponseEntity.ok(student);
	}
}
