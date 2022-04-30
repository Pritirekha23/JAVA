package com.java.core;

 
class women{
         int a=20,b=20;
         void display()
         {
        	 System.out.println("hello");
         } 
}
 class TestHuman1
 {
	 public static void main(String []args)
	 {
		 women obj=new women() ;
		 System.out.println(obj.a);
		 System.out.println(obj.b);
		 obj.display();
		 women obj1=new women();
		 System.out.println(obj1.a);
		 System.out.println(obj1.b);
		 obj1.display();
		 
	 }
 }
