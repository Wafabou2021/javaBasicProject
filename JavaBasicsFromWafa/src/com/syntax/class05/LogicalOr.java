package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  day="Saturday";
		
		if (day.equals("Saturday")&& day.equals("Sunday")) {
		System.out.println("I have Java Class");	
			
		}
		System.out.println("Code outside of if statement");	
		
		
		
		/*let's ask user what is today
		 * 
		 * based on the day lets define wich class we have
		 * 
		 * if Monday or Friday ---> there is no class todat
		 * 
		 * else if (Tuesday or Wednesday)---> manual
		 * else if (Thursday)--> review class
		 * else if (Saturday or Sunday)--> Java class
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleas enter a day");
		String day1 = scan.nextLine();
		if (day1.equalsIgnoreCase("Monday") || day1.equals("Friday")) {
			System.out.println("There is no class");
		} else if (day1.equalsIgnoreCase("Tuesday") || day1.equals("Wednseda")) {
			System.out.println("There is manual testing calss");
		} else if (day1.equalsIgnoreCase("Thursday")) {
			System.out.println("There is no class");
		} else if (day1.equalsIgnoreCase("Saturday") || day1.equals("Sunday")) {
			System.out.println("There is Java programming class");
		}
		else {
			System.out.println("INVALID ENTRY");
		}

		
	}

}
