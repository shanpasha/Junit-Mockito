package com.SimpleExample;

public class PrimeNumber {
	
	public  Boolean CheckPrimeNumber(int num) {
		boolean flag=true;
		
		if(num==0||num==1) {
		flag=false;
		}else {
			
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
				flag =false;
					break;
				}
				
			}
		}
		
		
		
		
		
		return flag;
		
		
		
	}
	
	
	
	

}
