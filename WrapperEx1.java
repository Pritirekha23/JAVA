// wrapper class------>>>> It converts primitive into object and object into primitive
//Autoboxing------->Automatic conversion of primitive data type into its corresponding wrapper class

package com.java.core;

public class WrapperEx1 {
        public static void main(String[]args) {
        	int a=20;
        	Integer i=Integer.valueOf(a);  //converting int into integer explicitly
        	Integer j=a;  //autoboxing now compiler will write Integer.valueOf(a) internally
        	System.out.println(a+""+i+""+j);
        }
}


