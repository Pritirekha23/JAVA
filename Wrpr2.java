//unboxing-->>>> The automatic conversion of wrapper class into corresponding primitive type is known as unboxing

//wrapper to primitve 
package com.java.core;

public class Wrpr2 {
        public static void main(String[]args)  
        {
        	//converting Integer to int
        	Integer a=new Integer(5);
        	int i=a.intValue(); //converting Integer to int explicitly
        	int j=a;   //unboxing
        System.out.println(a+""+i+""+j);
        
        }
}


