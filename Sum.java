package com.java.core;

 class AddFun
{
 static int A(int a,int b)
 {
	 return a+b;
 }
 static int A(int a,int b,int c)
 {
	 return a*b+c;
 }
 static double A(double a,double b,double c)
 {
	 return a+b-c;
 }
 static double A(double a,double b)
 {
	 return a%b;
 }
}
 class Sum
 {
	 public static void main(String[]args)
	 {
		System.out.println(AddFun.A(4.4,3.3)); 
		System.out.println(AddFun.A(4,3,5));
		System.out.println(AddFun.A(4.4,6.6,3.90));
		System.out.println(AddFun.A(4,3));
	 }
 }
