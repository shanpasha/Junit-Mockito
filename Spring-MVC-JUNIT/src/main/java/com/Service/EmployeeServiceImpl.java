package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.DAO.EmployeeDAO;
import com.DAO.EmployeeDaoImpl;
import com.model.Employee;

@Service

@EnableTransactionManagement
public class EmployeeServiceImpl implements EmployeeeService {

	@Autowired
	EmployeeDAO em;

	public void save(Employee employee) {
		em.save(employee);

	}

	@Override
	public List<Employee> getAll() {

		return em.getAll();
	}

	@Override
	public Employee getByID(Integer id) {

		return em.getByID(id);
	}

	@Override
	public void updateById(Employee employee) {
		em.updateById(employee);

	}

	@Override
	public void delete(Integer id) {
		em.delete(id);

	}

//	public static void main(String[] args) {
//		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
//		EmployeeDaoImpl em=(EmployeeDaoImpl) app.getBean("employeeDaoImpl");
//		Employee emp=new Employee(55, "srk", 456000, "srk@gmail.com");
//		em.save(emp);
//	}

}
