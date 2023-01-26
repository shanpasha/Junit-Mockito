package com.hamcrest;






import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasToString;

import org.junit.Test;

import com.model.Employee;

public class Hamcrest {
	
	@Test
	 public void given2Strings_whenEqual_thenCorrect() {
	    String a = "foo";
	    String b = "FOO";
	assertThat(a, equalToIgnoringCase(b));
	}
	
	//
	@Test
	public void compareObjectAndToString() {
		
		Employee employee=new Employee(256,"shan", 75000, "shan@gmail.com");
		
		String str=employee.toString();
		
		assertThat(employee,hasToString(str));
		
		
		
		
		
	}
	
	
	

}
