package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//next()  vs  nextln();
		
		Scanner  scan=new Scanner(System.in);
		
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();//nextInt(); nextDouble();  nextBoolean(); next().chartAt(0);
		System.out.println(temp);
		
		scan.nextLine();
		
		System.out.println("Please enter city");
		
		String anotherValue=scan.nextLine();
		System.out.println("anotherValue");
		scan.nextLine();
		System.out.println("End of the program");
		
		
		
		
		
	}

}
