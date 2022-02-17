package com.syntax.class04;

import java.util.Scanner;

//to import in mac :cmd+shift+0
//           in windows : ctr+shift+o 


public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//step1 . create a scanner and assign a variable
		Scanner scan=new Scanner(System.in);
		
		//step2 . Specify instructions
		System.out.println("Please enter countrywhere you are from");
		
		//step3  . we need to capture String value-->use next()
		
	String country=scan.next();
	System.out.println("You are from "+country);
	
	if (country.equals("Algeria")){
	System.out.println("you speak Arabic");
	
	}else if (country.equals("France")){
	System.out.println("you speak French");
	} else if (country.equals("turkey")) {
		System.out.println("you speak Turkish");
	}else {
	
		System.out.println("I do not know which language you speak");
	}	
	}

}
