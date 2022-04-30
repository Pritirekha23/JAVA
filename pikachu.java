package com.java.core;

 class pikachu {
	 public static void main(String[]args) {
		 int n=3,i,c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("prime no");
			
		}
		else {
			System.out.println(" not prime no");	
		}
	 }

}
