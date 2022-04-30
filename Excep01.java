package com.java.core;

public class Excep01 {

      public static void main(String[]args)
      {
    	  try {
    		  int data=100/0; //may Exception occur here and it will handled by catch block
    	  }
    	  catch(ArithmeticException e)
    	  {
    		  System.out.println(e);
    		  }
    	  System.out.println("rest of the code");
      }
	
	 
}
