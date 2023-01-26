package com.EmployeeserviceJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Service.EmployeeeService;
import com.model.Employee;

public class EmployeeServiceTest {

	private static EmployeeeService employeeeService = null;
	private static final double DELTA = 1e-15;
	@BeforeClass
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		employeeeService = (EmployeeeService) ac.getBean("employeeServiceImpl");

	}

	@Test
	public void test() {

		assertNotNull(employeeeService);
	}

//	@Test
//	public void save() {
//		Employee em = new Employee();
//		em.setId(111);
//		em.setName("rajitha");
//		em.setEmail("rajitha@gmail.com");
//		em.setSalary(32000);
//		employeeeService.save(em);
//
//	}

	@Test
	public void getByID() {
		Employee em = employeeeService.getByID(111);
		assertEquals(111, em.getId());
		assertEquals("rajitha", em.getName());
		assertEquals("rajitha@gmail.com", em.getEmail());
		assertEquals(32000, em.getSalary(), DELTA);
		
		

	}
}
