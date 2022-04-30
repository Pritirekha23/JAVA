package com.java.core;

 class Human {
	 void display(String name)
	 {
		 System.out.println(name);
	 }
}
 class TestHuman
 {
	 public static void main(String []args)
	 {
		 Human obj=new Human();
		 obj.display("priya");
		 Human obj1=new Human();
		 obj1.display("Riya");
	 }
 }
