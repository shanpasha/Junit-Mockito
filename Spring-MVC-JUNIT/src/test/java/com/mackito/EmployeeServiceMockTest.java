package com.mackito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
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
import com.DAO.EmployeeDAO;
import com.Service.EmployeeServiceImpl;
import com.model.Employee;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceMockTest {

	@Mock
	private EmployeeDAO employeeDAO;
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;

	@Before
	public void mockInit() {
		when(employeeDAO.getByID(1)).thenReturn(new Employee(1, "shan", 80800, "shan@gmail.com"));
		when(employeeDAO.getByID(2)).thenReturn(new Employee(2, "sriman", 90800, "sriman@gmail.com"));
		when(employeeDAO.getByID(3)).thenReturn(new Employee(3, "puja", 70800, "puja@gmail.com"));
		when(employeeDAO.getByID(4)).thenReturn(new Employee(4, "ramya", 75800, "ramya@gmail.com"));
		when(employeeDAO.getAll()).thenReturn(FindAll());
	}

	public static List<Employee> FindAll() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "shan", 80800, "shan@gmail.com"));
		employees.add(new Employee(2, "sriman", 90800, "sriman@gmail.com"));
		employees.add(new Employee(3, "puja", 70800, "puja@gmail.com"));
		employees.add(new Employee(4, "ramya", 75800, "ramya@gmail.com"));
		return employees;

	}

	@Test
	public void findAll() {
		assertEquals(4, employeeServiceImpl.getAll().size());

	}

	@Test
	public void getByIdTest() {

		assertEquals("shan", employeeServiceImpl.getByID(1).getName());

	}

	@Test
	public void save() {
		Employee employee = FindAll().get(0);
		employeeServiceImpl.save(employee);
		verify(employeeDAO, times(1)).save(employee);

	}

	@Test
	public void updateTest() {
		Employee employee = FindAll().get(1);
		System.out.println(employee);
		employeeServiceImpl.updateById(employee);
		verify(employeeDAO, times(1)).updateById(employee);

	}

	@Test
	public void DeleteTest() {

		employeeServiceImpl.delete(1);
		verify(employeeDAO, times(1)).delete(1);

	}

}
