package com.Service;

import java.util.List;

import com.model.Employee;

public interface EmployeeeService {

	public void save(Employee employee);
	public List<Employee>getAll();
	  public Employee getByID(Integer id);
	  public void updateById(Employee employee);
	  
	  public void delete(Integer id);
	  
}
