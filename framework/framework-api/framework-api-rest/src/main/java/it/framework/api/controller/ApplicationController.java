package it.framework.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.framework.api.entity.Employee;
import it.framework.api.service.impl.EmployeeServiceImpl;




@RestController
@RequestMapping("/testPostgresql")
public class ApplicationController {

	@Autowired
	EmployeeServiceImpl employeeService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	
	}
	
	@GetMapping(value = "/employeeById/{id}")
	public Employee getEmployeeById(@PathVariable(required = true) String id) {
		
		return employeeService.finById(id);
	
	}
	@PostMapping(value = "/createEmp")
	public void createEmployee(@RequestBody Employee emp) {
		 employeeService.insertEmployee(emp);
	
	}
	@PutMapping(value = "/updateEmp")
	public void updateEmployee(@RequestBody Employee emp) {
		 employeeService.updateEmployee(emp);
	
	}
	@PutMapping(value = "/executeUpdateEmp")
	public void executeUpdateEmployee(@RequestBody Employee emp) {
		 employeeService.executeUpdateEmployee(emp);
	
	}
	
	@DeleteMapping(value = "/deleteEmpById")
	public void deleteEmployee(@RequestBody Employee emp) {
		 employeeService.deleteEmployee(emp);
	
	}
	
	
}
