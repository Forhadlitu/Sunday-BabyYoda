package com.upskill.java;

public class Class_2_IfElseStatement {

	public static void main(String[] args) {
		
          //Nested if Else Statement		
		
		
		
		
		int year = 2020;
		if (year<2000){
			System.out.println("20th century");
		} else {
			
		
			if (year >= 2019 && year <=2022){
				System.out.println("pendemic");
			} else {
			System.out.println("21th century");
			}
		}
			
		
		
		// less then 13 = Children
		// 13 - 18 = Teenager
		// 18 - 60 = Adult
		// 60 - 100 = Senior
		// 100+ = Champion
		int age = 60;
			
			if(age<13){
				System.out.println("You are children !!!");
			} else if (age> 13 && age < 18){
				System.out.println("You are Teenager !!!");
			
			} else if (age > 18 && age < 60){
				System.out.println("You are adult");
			} else if (age > 60 && age < 100){
				System.out.println("You are Senior !!!");
			} else {
				System.out.println("You are Champion !!!");
			}

			
	}

}
