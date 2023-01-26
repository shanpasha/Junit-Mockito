package com.mackito;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Service.EmployeeeService;
import com.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeController {
	
	@Mock
	EmployeeeService employeeeService;
	
	@InjectMocks
	EmployeeController controller;
	
	
	@Before
	
	public void Mockinit() {
		when(employeeeService.getByID(1)).thenReturn(new Employee(1, "shan", 80800, "shan@gmail.com"));
		when(employeeeService.getByID(2)).thenReturn(new Employee(2, "sriman", 90800, "sriman@gmail.com"));
		when(employeeeService.getByID(3)).thenReturn(new Employee(3, "puja", 70800, "puja@gmail.com"));
		when(employeeeService.getByID(4)).thenReturn(new Employee(4, "ramya", 75800, "ramya@gmail.com"));
		when(employeeeService.getAll()).thenReturn(getAllEmps());
		
	}
public List<Employee> getAllEmps(){
	List<Employee> employees=new ArrayList<Employee>();
	
	employees.add(new Employee(1, "shan", 80800, "shan@gmail.com"));
	employees.add(new Employee(2, "sriman", 90800, "sriman@gmail.com"));
	employees.add(new Employee(3, "puja", 70800, "puja@gmail.com"));
	employees.add(new Employee(4, "ramya", 75800, "ramya@gmail.com"));
	return employees;
	
}

@Test
public void save() {
	
	controller.save();
	
	
}













}
