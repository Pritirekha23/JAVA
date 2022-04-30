package com.java.core;

public class Excep02 {

	      public static void main(String[]args)
	      {
	    	  try {
	    		  int data=100/0;  // may through exception and if here exception is occur them the rest of the code will not be execute
	    		  System.out.println("rest of the code");
	    	  }
	    	  catch(ArithmeticException e) //handling the exception
	    	  {
	    		  System.out.println(e);
	    		  }

	      }
		
		 
	}


