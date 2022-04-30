package com.java.core;

public class Pattern 
 {
		
		
		public static void main(String[] args) {
			
			
			
			
			
			System.out.println("---- Printing Alphabet A ------");
			
			int j, i = 0,rows=10;
			
			do
			{
				j = 0 ;
				
				do
				{
					if((i == 0 && j != 0 && j != rows/2) || i == rows / 2 ||
							(j == 0 || j == rows /2 ) && i != 0)
						System.out.print("*");
					else
						System.out.print(" ");
					
				} while ( ++j <= rows/2);
				
				System.out.println("\n");

			} while ( ++i < rows ) ;
		}
	}



