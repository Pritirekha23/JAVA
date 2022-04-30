//throw keyword example

//
//package com.java.core;
//
//public class Excep10 {
//	public static void main(String[]args)
//	{
//		validate(19);
//
//		System.out.println("hellloooooooooooo");
//	}
//        static void validate(int age)
//        {
//        	if(age<18)
//        	{
//        		throw new ArithmeticException("not valid");
//        	}
//        	else {
//        		System.out.println("Welcome to vote");
//        	}
//        	
//        }
//}


//handling this program by using try and catch

package com.java.core;

public class Excep10 {
	public static void main(String[]args)
	{
		try {
		validate(12);
		}
		catch(Exception e)
		{
			System.out.println(e);
		      
		}
		
	}
        static void validate(int age)
        {
        	if(age<18)
        	{
        		throw new ArithmeticException("not valid");
        	}
        	else {
        		System.out.println("Welcome to vote");
        	}
        	
        }
}