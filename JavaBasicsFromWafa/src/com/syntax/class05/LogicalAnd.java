package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean likeJava=true;
		boolean practice=true;
		boolean understandJava=true;
		
		if (likeJava && understandJava) {
			System.out.println("This is the best combination");
			
			}
		
		System.out.println("End of code");
		
		// we want to compare 3 numbers and find the largest
		/*
		 * if num1>num2   and num1 >num3--> num1 is the largest
		 * what is num2>num1 and num2>num3---> num2 ---> num2 is the largest
		 * what is num3>num1 and num3>num2---> num2 ---> num3 is the largest
		 */
		
		int num1=1000;
		int num2=2000;
		int num3=300;
		
		if (num1>num2 || num1>num3) {
	System.out.println(num1+" is thelargest");
		
		}	else if (num2>num1 || num2>num3) {
			System.out.println(num2+" is thelargest");	
		
		}else if (num3>num1 || num3>num2) {
		System.out.println(num3+" is the largest");
		
		
	}

}
}