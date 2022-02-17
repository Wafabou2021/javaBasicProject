package com.syntax.reviewclass4;

import java.util.Scanner;

public class Waf {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Type 10 numbers");

        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            System.out.println(number);
        }
    }
}
