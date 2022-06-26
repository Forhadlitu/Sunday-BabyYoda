package com.upskill.java;






public class Class_3_Polymorphism {

	public static void main(String[] args) {
		car(4,"Red");
		
	}
		
	public static void car(){
		System.out.println("my car is Audi !");
		
   }
	
	public static void car(int door){
		System.out.println("MY Car is Audi,it has door :" + door);
		
		
	}
	public static void car(int door,String color){
		System.out.println("MY Car is Audi,it has door :" + door + " ; its color : " + color);
		
	}

}
