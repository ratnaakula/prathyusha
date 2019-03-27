/* (Display pyramid) Write a program that prompts 
                                                       1                               
                                                    2  1  2                             
                                                 3  2  1  2  3                         
                                              4  3  2  1  2  3  4                       
                                           5  4  3  2  1  2  3  4  5                    
                                        6  5  4  3  2  1  2  3  4  5  6                 
                                     7  6  5  4  3  2  1  2  3  4  5  6  7
 * the user to enter an integer from 1 to 15 and displays
 *  a pyramid, as shown in the following sample run:
 */
import java.util.Scanner;
public class Problem5_17 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// Prompt the user to enter an integer from 1 to 15
	System.out.print(" Enter an integer from 1 to 15 : ");
	int number = input.nextInt();
	for(int i = 1; i <= number; i++)// number==7 displays rightside
	{
		for(int j = number; j > i; j--)
		
			// gives white space
		
			System.out.print("  ");
		
		for(int k = i; k > 0; k--)
		
			System.out.print(k + " ");
		
		for(int m = 2; m <= i; m++)
		
			System.out.print(m+ " ");
		
		System.out.println();
		
	}
	}
}
