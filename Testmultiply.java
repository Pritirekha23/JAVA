package com.java.core;

class MultiplyFun
{
static int Multiply(int a,int b)
{
     return a*b;	
}
	
	static double Multiply(double a,double b)
	
	{
		
		return a*b;
	}
}
class	Testmultiply 
{
public static void main(String[]args)
{
	System.out.println(MultiplyFun.Multiply(4,6));
	System.out.println(MultiplyFun.Multiply(4.6,6.7));
}
}