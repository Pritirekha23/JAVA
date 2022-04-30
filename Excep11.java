//throws keyword


package com.java.core;
public class Excep11 {
	       void m1()throws ArithmeticException{
	       {
	    	    throw new ArithmeticException("Diveded by zero");
	       }
      void n()throws ArrayIndexOutOfBoundsException
      {
    	  m1();
      }
      void p()
      {
    	  try {
    		  n();
    	  }
    	  catch(Exception e) {
    		System.out.println(e); 
    	  }
    	  public static void main(String[]arr) {
    		  Excep11 ob=new Excep11();
    		  ob.p();
      		System.out.println("Normal flow"); 
    	  }
      }
 }
