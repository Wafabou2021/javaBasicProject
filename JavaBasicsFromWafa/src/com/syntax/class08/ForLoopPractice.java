package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("multiplication table");
		/*3x1=3
		 * 3x2=6
		 * 3x3=9
		 * 3*x10=30
		 */
		
		int num=3;
		int result;
		for (int i=1; i<=10; i++) {
			result=num*i;
			
			System.out.println(num+" x "+i+"="+result);
			
		}	
		System.out.println("-WHAT IS THE OUTPUT-");
			
			
			for (int i=0; i<=10; i+=3){
			
				
			System.out.print(i+" ");
			}
			
			
		System.out.println("-WHAT IS THE OUTPUT-");
		int sum=0;
		for (int i=1; i<=5; i++) {
		sum+=i;	
		}
		System.out.println(sum);
		
		System.out.println("-WHAT IS THE OUTPUT-");
		
		int value=1;
		for (int i=1; i<4; i++) {
		value*=i;	
		}
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
	}	}

