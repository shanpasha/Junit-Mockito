package com.DAO;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	public void save(Employee employee) {
		hibernateTemplate.save(employee);
		
		System.out.println("Sucess");
	}

	@Override
	public List<Employee> getAll() {
		
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Override
	public Employee getByID(Integer id) {
		
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	public void updateById(Employee employee) {
		 hibernateTemplate.update(employee);
		
	}

	@Override
	public void delete(Integer id) {
		Employee em=new Employee();
		em.setId(id);
		hibernateTemplate.delete(em);		
	}
	

}
