package com.syntax.class03;

public class PrimitiveCasting {

	
	// TODO Auto-generated method stub

	     //main+ctrl+spaceo
	    //ctrl+space--->autocomplete
		
	
	public static void main(String[] args) {
		
		
		
	int i=10;
	//widening or implicit
	// we store int value 10 inside double variable
	double d=10;
System.out.println(i);  //10
System.out.println(d);  //10.0

     //int num=10.0; ///error : Type mismatch: cannot convert from double to int
		
    //narrowing or explicit casting
// we store double value 10.99 into int variable
  int  num=(int)10.99;
		System.out.println(num);
		
		float f=10.99f;// Type mismatch: cannot convert from double to float
		 byte b=(byte)128;//
		 
		 long number=1344455555666l;
		 int n=(int)1344455555666l;
		 System.out.println(n);
		 System.out.println(number);
		 
		
		
		
		
		
				
		
		
		
		
	}

}
