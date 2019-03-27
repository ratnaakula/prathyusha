/* (Display four patterns using loops) Use nested loops that display the following


Patterns in four separate programs:

Pattern A        Pattern B        Pattern C        Pattern D 
1                 1 2 3 4 5 6 7             1       1 2 3 4 5 6 7 
1 2               1 2 3 4 5 6             2 1         1 2 3 4 5 6
1 2 3             1 2 3 4 5             3 2 1           1 2 3 4 5 
1 2 3 4           1 2 3 4             4 3 2 1             1 2 3 4 
1 2 3 4 5         1 2 3             5 4 3 2 1               1 2 3
1 2 3 4 5 6       1 2             6 5 4 3 2 1                 1 2
1 2 3 4 5 6 7     1             7 6 5 4 3 2 1                   1

*/    

import java.util.Scanner;

public class Problem5_18 {
	
	public static void main(String[] args) 
	{
		printPatternA(); 
		printPatternB(); 
		printPatternC(); 
		printPatterD();
	}
	
	public static void printPatternA()
	{
		System.out.println("Printing Pattern A ");
		for(int i = 1 ; i <= 7; i++)
		{
			for(int j = 1 ; j <= i; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();	
		}
		System.out.println("Done Printing Pattern A \n ");
	}
	
	public static void printPatternB() 
	{
		System.out.println("Printing Pattern B ");
		for(int i = 7; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("Done Printing Pattern B \n ");
	}
	
	public static void printPatternC() {
		System.out.println("Printing Pattern C");
		for(int i = 1; i <= 7; i++)
		{
			for(int j = (7-i); j >= 1 ; j--)
			{
				System.out.print("  ");
			}
			
			for(int k = i ; k >= 1; k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		System.out.println("Done Printing Pattern C \n ");
	}
	
	public static void printPatterD()
	{
		System.out.println("Printing Pattern D \n");
		for(int i = 7; i >= 1; i--)
		{
			for(int k = (7-i); k >= 1  ; k--)
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		System.out.println("Done Printing Pattern D \n");	
	}
		
}