package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/*create a variable and assign a value\
		 * 
		 * declare a variable and initialize
		 */
		//1
		int age=25;
		
		//2
		int num; // declare variable
		num=10; //initialize it
		num=100; //reassign the value
		
		
		int n1, n2 , n3;  //all 3 variabes are on the int type
		
		n1=10;
		n2=20;
		n3=30;
		
		  // cmd+d--> will remove entire line
		 // ctrl+d--> will remove entire line
		
		// can I change a value of the variable?
		age=26;  //reassigning the value of the variable
		//age=26.5; ERROR: AG VARIABLE CAN HOLD ONLY INT VALUE
		age =57;
		age =75;
		System.out.println(age);
		age =100;
		
		//java rules for identifiers
		
		// boolean break=true;  Java shows error since the name of the key word is the same
		
		// boolean Break=true; non error since Break has a caps
		//char 1character='A';  ERROR--> do not start identifier (name) with numbers or special characters 
		
		//double %value-12.99; ERROR--> do not start identifier with special character
		//Java allows to use _ or $ as identifier
		double $price= 1.99;
		double _value= 2.99;
		char character1='a';
		boolean Break=true;
	
		// these are not rules, but we prefere to follow
		/* variable names and methods name should start with a lowercase
		 * give variables meaningful name
		 * 
		 * class name should start with an upper case
		 * 
		 * if names has 2 or more words ---> follow camel casing 
          */
		int bigNumber = 132425;

		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
}
