package com.syntax.class04;

public class Task2 {
	
	public static void main(String[] args) {
	
	/* 
	 * create a program and store values of mortgage rate and mortgage price
	 * First, program should check if rate is higher than 4.5 user will not buy a 
	 * house,  otherwise user will consider buying. Once user decides to buy a house
	 * if price of the house is larger than 50000 than user will take a loan.
	 * otherwise user will pay case.
	 * 
	 */
	
	
	double mortgageRate=3.5;
	int mortgagePrice= 1450000;
	
	if (mortgageRate>4.5) {
		System.out.println("you can not buy a house");
	}else {
		System.out.println("you can buy a house");
		
		if (mortgagePrice >50000) {
			System.out.println("you should take a loan");
		} else {
			System.out.println("you can pay cash");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}