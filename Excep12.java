package com.java.core;
 
class test extends Exception{
	test(String s)
	{
		super(s);
	}
}
public class Excep12 {

         static void validate(int age)throws test{
        	 if(age>18)
        	 {
        		 throw new test("not valid");
        	 }
        	 else {
        		 System.out.println("Welcome to vote");
        	 }
     		public static void main(String[]args) {
        	 
        		 try {
        			 validate(19);
        		 }
        		 catch(Exception e)
        		 {
        			 System.out.println("Rest of the codes");
        		 }
	     }
         }
}
