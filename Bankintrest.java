package com.java.core;

class Bank
{
 float getRateOfInterest()
 {
	 return 0;
 }
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 7.3f;
	}
}
class AXIS extends Bank
{
	float getRateOfInterest()
	{
	return 9.7f;
     }
}
class Bankintrest
{
	public static void main(String[]args)
	{
		Bank b;
		b=new SBI();
		System.out.println("SBI bank rate of interest :" +b.getRateOfInterest());
		b=new ICICI();
		System.out.println("ICICI bank rate of interest :" +b.getRateOfInterest());
		b=new AXIS();
		System.out.println("AXIS bank rate of interest :" +b.getRateOfInterest());
		
		
	}
}