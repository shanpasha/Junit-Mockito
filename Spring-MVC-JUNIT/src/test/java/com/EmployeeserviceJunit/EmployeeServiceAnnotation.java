package com.EmployeeserviceJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Service.EmployeeeService;
import com.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})
public class EmployeeServiceAnnotation {
	
	@Autowired
	private  EmployeeeService employeeeService;
	private static final double DELTA = 1e-15;
	
	
	
	@Test
	public void test() {

		assertNotNull(employeeeService);
	}

//	@Test
//	public void save() {
//		Employee em = new Employee();
//		em.setId(112);
//		em.setName("suchitra");
//		em.setEmail("suchitra@gmail.com");
//		em.setSalary(42000);
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
	@Test
	public void getAllTest() {
		
		employeeeService.getAll();
		
		
		
	}
	
}
