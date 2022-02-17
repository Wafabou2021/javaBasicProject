package com.syntax.class05;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
Scanner  scan=new Scanner(System.in);
		
		System.out.println("using next");
		String value=scan.next();//nextInt(); nextDouble();  nextBoolean(); next().chartAt(0);
		System.out.println(value);
		
		
		
		System.out.println("unsing nextLine");
		scan.nextLine();
		String anotherValue=scan.nextLine();
		System.out.println("anotherValue");
		scan.nextLine();
		System.out.println("End of the program");
		
		
		
		
		
		
		
	}

}
