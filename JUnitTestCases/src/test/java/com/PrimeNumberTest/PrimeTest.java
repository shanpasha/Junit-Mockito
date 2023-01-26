package com.PrimeNumberTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.SimpleExample.PrimeNumber;

@RunWith(Parameterized.class)
public class PrimeTest {
	
int num;
boolean flag;

public  PrimeNumber primeNumber ;



public PrimeTest(int num, boolean flag) {
	super();
	this.num = num;
	this.flag = flag;
}

@Before
public  void init () {
 primeNumber=new PrimeNumber();
	
}

@Parameterized.Parameters
public static Collection numbers() {
	
	return  Arrays.asList(new Object [][] {
		{2,true},
		{3,true},
		{7,true},
		{11,true}
	});
	
	
	
}



@org.junit.Test
public void Test() {
	
	assertEquals(flag, primeNumber.CheckPrimeNumber(num));
	
}


	
	
	

}
