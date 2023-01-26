package com.mackito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.DAO.EmployeeDaoImpl;
import com.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDaoTest {

	@Mock
	HibernateTemplate hibernateTemplate;
	@InjectMocks
	EmployeeDaoImpl daoImpl;

	@Before
	public void mockInit() {

		when(hibernateTemplate.get(Employee.class, 200)).thenReturn(new Employee(200, "shan", 20000, "Shan@gmail.com"));
		when(hibernateTemplate.get(Employee.class, 201))
				.thenReturn(new Employee(201, "sriman", 30000, "sriman@gmail.com"));
		when(hibernateTemplate.get(Employee.class, 202))
				.thenReturn(new Employee(202, "mahesh", 22000, "mahesh@gmail.com"));
		when(hibernateTemplate.get(Employee.class, 203)).thenReturn(new Employee(203, "ravi", 20000, "ravi@gmail.com"));
		when(hibernateTemplate.loadAll(Employee.class)).thenReturn(findAll());
	}

	public List<Employee> findAll() {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(200, "shan", 20000, "Shan@gmail.com"));
		emp.add(new Employee(201, "sriman", 30000, "sriman@gmail.com"));
		emp.add(new Employee(202, "mahesh", 22000, "mahesh@gmail.com"));
		emp.add(new Employee(203, "ravi", 20000, "ravi@gmail.com"));

		return emp;
	}

	@Test
	public void save() {
		Employee emp = findAll().get(0);
		daoImpl.save(emp);
		verify(hibernateTemplate).save(emp);

	}

	@Test
	public void getAllTest() {
		assertEquals(4, daoImpl.getAll().size());
	}
	
	@Test
	public void getById() {
		assertEquals("shan", daoImpl.getByID(200).getName());
	}

	@Test
	public void update() {
		Employee emp=daoImpl.getAll().get(0); 
		
		daoImpl.updateById(emp);
		verify(hibernateTemplate).update(emp);
		
		
	}
	@Test
	public void delete() {
		Employee empl=new Employee();
		empl.setId(200);

		daoImpl.delete(empl.getId());
		verify(hibernateTemplate).delete(empl);
		
		
	}
	
	
}
