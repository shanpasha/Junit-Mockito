package com.hamcrest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.model.Employee;

public class Hamcrest {

	@Test
	public void given2Strings_whenEqual_thenCorrect() {
		String a = "foo";
		String b = "FOO";
		assertThat(a, equalToIgnoringCase(b));
	}

	// Object Matcher
	@Test
	public void compareObjectAndToString() {

		Employee employee = new Employee(256, "shan", 75000, "shan@gmail.com");

		String str = employee.toString();

		assertThat(employee, hasToString(str));

	}

	// Bean matcher
	@Test
	public void beanPropertyMatcher() {
		Employee emp = new Employee(001, "shannu", 65000, "shannu@gmail.com");
		assertThat(emp, hasProperty("name"));

	}

	@Test
	public void beanPropertyAndPropertyDataMacher() {
		Employee emp = new Employee(001, "shannu", 65000, "shannu@gmail.com");
		assertThat(emp, hasProperty("name", equalTo("shannu")));

	}

	@Test
	public void twoObjectsMatcher() {
		Employee emp = new Employee(001, "shannu", 65000, "shannu@gmail.com");
		Employee emp2 = new Employee(001, "shannu", 65000, "shannu@gmail.com");

		assertThat(emp, samePropertyValuesAs(emp2));
	}

	// Collection Matcher

	@Test
	public void checkCollectionEmptyOrNot() {
		List<Employee> employees = new ArrayList<Employee>();
//		Employee emp=new Employee(001, "shannu", 65000, "shannu@gmail.com");
//		employees.add(emp);
		assertThat(employees, empty());

	}
     @Test
	public void checkCollectionSize() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = new Employee(001, "shannu", 65000, "shannu@gmail.com");
		Employee emp2 = new Employee(001, "shannu", 65000, "shannu@gmail.com");
		employees.add(emp2);

		employees.add(emp);
		
		assertThat(employees, hasSize(2));

	}
     
     @Test
 	public void checkCollectionArrayAslistSize() {
 		List<String> list=Arrays.asList("shan","shannu","sriman","mahesh","pooja","ramya");
 		
 		assertThat(list, hasSize(6));

 	}
     
     @Test
     public void checkArraysSize() {
    	 
    	 String [] names= {"shan","shannu","sriman","mahesh","pooja","ramya"};
    	 assertThat(names, arrayWithSize(6));
    	 
     }
     
     
     @Test
     public void checkGivenListContainsOrNot_withSameOrder() {
    	 
    	 List<String> name=Arrays.asList("shan","shannu","sriman","mahesh","pooja","ramya");
    	 
    	assertThat(name, contains("shan","shannu","sriman","mahesh","pooja","ramya"));
    	 
     }
     
     @Test
     public void checkGivenListContainsOrNot_withoutSameOrder() {
    	 
    	 List<String> name=Arrays.asList("shan","shannu","sriman","mahesh","pooja","ramya");
    	 
    	assertThat(name, containsInAnyOrder("ramya","pooja","shan","shannu","sriman","mahesh"));
    	 
     }
     
     @Test
     public void checkGivenListContainsOneElementOrNot() {
    	 
    	 String [] name= {"shan","shannu","sriman","mahesh","pooja","ramya"};
    	 assertThat("sriman", isOneOf(name));

}
     
}
