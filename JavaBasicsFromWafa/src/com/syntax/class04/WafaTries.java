package com.syntax.class04;

import java.util.Scanner;

public class WafaTries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input= new Scanner (System.in);
		System.out.println("Please enter your name");
		String name = input.next();
		System.out.println("Please enter your age");
		int age=input.nextInt();
		System.out.println("please enter boolanvalue");
		boolean booleanValue=input.nextBoolean();
		System.out.println(booleanValue);
		System.out.println("please enter decimalvalue");
		double d=input.nextDouble();
	    System.out.println(d);
	    System.out.println("please enter char value");
		char character=input.next().charAt(0);
		
		System.out.println(character);
		
		
		
		
		
		
		
		
	}

}
