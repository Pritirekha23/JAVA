package com.java.core;

 class Bike 
{
  int speedlimit=90;
}
 class Honda extends Bike
 {
	 int speedlimit=150;
	 public static void main(String[] args)
	 {
		 Bike b=new Honda();
		 System.out.println(b.speedlimit);
	 }
 }
