package com.example.one2oneBidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee)
	{
		employee.getAddress().setEmployee(employee);
		employeeRepository.save(employee);
		return ResponseEntity.ok(employee);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> save(@PathVariable Integer id)
	{
		Employee employee = employeeRepository.findById(id).get();
		return ResponseEntity.ok(employee);
	}
	
}
