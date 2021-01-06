package it.framework.api.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.framework.api.dao.EmployeeDaoImpl;
import it.framework.api.entity.Employee;


@Service
public class EmployeeServiceImpl{
	
	@Autowired
	EmployeeDaoImpl employeeDao;
	
	
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}
	
	public Employee finById(String id) {
		return employeeDao.findById(id);
	}
	
	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
		
	}
	
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}
	
	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		
	}

	
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
		
	}
}
