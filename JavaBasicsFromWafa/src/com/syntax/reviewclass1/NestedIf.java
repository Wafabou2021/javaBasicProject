package com.syntax.reviewclass1;

public class NestedIf {

	public static void main(String[] args) {
		

	boolean vaccine=true;
	int dose=2;
	
	if (vaccine) {
		
		System.out.println("how many does you have");
		
		
		if (dose==1) {
			System.out.println("you will need another shot");
			
		
		}else {
			System.out.println("you are fully vaccinated");
		}
	

		
		
		
	}else {
		
		
		System.out.println("i do no have any further questions");
		
		}
		
	
			
		/*declare a variabke for an allergy
		 * 
		 * if you have allergy ===>
		 * if you have a pollen
		 * if have a peanut
		 * if you have weat
		 * if no allergy ----> you are lucky\
		 * 
		 */
	
		
		boolean allergy=true;
		
		if (allergy) {
			
			System.out.println("Let's check what allergy you have");
			
			String allergytype="gluten";
			if (allergytype.equals("pollen")){
			System.out.println("please stay at home when trees are blooming. Take med A");	
			
			
			}else if (allergytype.equals("peanuts")) {
				System.out.println("Please do not eact food that contains nuts. Take Med B");
				
			}else if (allergytype.equals("gluten")) {
				System.out.println("please follow gluten free diet. Take med c");
				
			}else  {
				System.out.println("I dont know what suggestion to give you");
			}	
			}else {
				System.out.println("you are lucky");
	          }
		
		
		
		
		
		
		
		
		
		
	}

}
