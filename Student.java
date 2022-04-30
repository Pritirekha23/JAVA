package com.java.core;

class Student
{
	int id,age;
	String name;
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	Student(int i,String n,int a){
		id=i;
        name=n;
        age =a;
	}
	void display() 
	{
		System.out.println(id+ " "+name+" "+age);
	}
	public static void main(String[]args) {
	Student s1=new Student(11189,"sonali");
	Student s2=new Student(435162,"monali",45);
	s1.display();
	s2.display();
}
}