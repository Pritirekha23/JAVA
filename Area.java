package com.java.core;

import java.util.*;
class circle
{
	double r=4;
	double pi=3.141;
    double a1=pi*r*r;
}
class triangle
     {
	    double b=5;
        double h=23.3;
    	double a2=(b*h)/2;	 
     }
class rectangle
{
	double d=8;
	double c=9;
	double a3=d*c;
}
class square
{
	double s=7.6;
	double a4=s*s;
}
class cylinder
{
	double pi=3.141;
	double m=23.3;
	double h=8.4;
	double a5=(2*pi*m*h)+(2*pi*m*m);
			
}
class Area
{
	public static void main(String[]args)
	{
		circle c=new  circle();
	    triangle t=new triangle();
	   rectangle r1=new rectangle(); 
	   square s1=new square();
	   cylinder c1=new cylinder();
	   System.out.println(c.a1);
	   System.out.println(t.a2);
	   System.out.println(r1.a3);
	   System.out.println(s1.a4);
	   System.out.println(c1.a5);
	}
}