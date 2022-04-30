
package com.java.core;

public class Cllbvalue {
         int data=50;
         void change(Cllbvalue c) {
        	 c.data=c.data+100;       //change will be in the instance variable
         }
          public static void main(String[]args)
          {
        	  Cllbvalue c=new Cllbvalue();
        	  System.out.println("before changing "+c.data);
        	  c.change(c); //passing object
        	  System.out.println("after changing "+c.data);
          }
         
}
