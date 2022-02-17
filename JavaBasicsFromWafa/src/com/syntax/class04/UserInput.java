package com.syntax.class04;
import  java.util.Scanner;   //we imported SCANNER from JRE System Library by typing import java.util.Scanner
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int num=10;
	    num=20;
	    
		
		Scanner input=new Scanner(System.in); //WE ARE CREATING A SCANNER
	
	System.out.println( "Please enter your name");
		//IF YOU WANT TO CAPTURED SIGNLE STRING- SCANNER SAY USE  NEXT();
	    
		
	    String name=input.next();  //type string and hit enter
	    
	    
	    System.out.println("Your name is " +name);
	    
	  //  if you want to capture int value, then the scanner ask us to use nextInt()
		
	System.out.println(name+ "Please enter your age");
	
	int age=input.nextInt(); //type integer and hit enter 
	
	
	System.out.println("Your name is "+name+"and your age is"+age);
	
	
	}

}
