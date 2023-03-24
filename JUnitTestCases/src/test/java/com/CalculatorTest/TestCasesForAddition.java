package com.CalculatorTest;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import com.SimpleExample.Calculator;

import ch.qos.logback.classic.Logger;

public class TestCasesForAddition {
	
	org.slf4j.Logger log=LoggerFactory.getLogger(TestCasesForAddition.class);
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
		int sum=cal.addition(10, 20);
		log.info("method{}",sum);
		assertEquals(30,cal.addition(10, 20));
    }
		
		  @Test
			public void test2() {
				System.out.println("test2");

				assertEquals(30,cal.addition(100, -70));
			}
	}
	

