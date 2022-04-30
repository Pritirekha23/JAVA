package com.java.core;

class  Teach
{
	int rollno;
	String name;
	float fee;
	Teach(int rollno,String name,float fee)
	{
         rollno=rollno;     //if here we use this keyword the the output will be what we will gave
		name=name;
		fee=fee;
	}
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+fee);
     }
 }
class Teach2
{
	public static void main(String[]args)
	{
		Teach t1=new Teach(123,"sumit",8000f);
		Teach t2=new Teach(124,"prava",7000f);
		t1.display();
		t2.display();
	}
}
