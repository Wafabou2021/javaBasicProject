package com.syntax.class07;

import java.util.Scanner;

public class OperatorHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator;
	    int num1, num2, result;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    System.out.println("Please enter first number");
	    num1 = input.nextInt();
	    System.out.println("Please enter second number");
	    num2 = input.nextInt();
	    switch (operator) {
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    //input.close();
	  }
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

