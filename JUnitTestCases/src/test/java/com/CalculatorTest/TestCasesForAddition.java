package com.CalculatorTest;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.SimpleExample.Calculator;

public class TestCasesForAddition {
	public static Calculator cal=new Calculator();
	
    @Before
	public void before() {
		
		System.out.println("before test");
	}
	
    @After
   	public void after() {
   		
   		System.out.println("after test");
   	}
	
    @BeforeClass
   	public static  void beforeClass() {
   		
   		System.out.println("before Class test");
   	}
   	
       @AfterClass
      	public static void afterClass() {
      		
      		System.out.println("after class test");
      	}
	
	
	@Test
	public void test() {
	
		System.out.println("test1");
		assertEquals(30,cal.addition(10, 20));
    }
		
		  @Test
			public void test2() {
				System.out.println("test2");

				assertEquals(30,cal.addition(100, -70));
			}
	}
	

