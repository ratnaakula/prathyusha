 
import java.util.Scanner;
public class Problem3_14
{
 public static void main(String[] args)
 {
		int number = (int) (Math.random() * 2);

		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a guess
		System.out.print(" Enter a guess ? Enter 0 for head and 1 for tail :");
		int guess = input.nextInt();
		// check the guess
		if(guess == number)
		{
			System.out.println(" Correct guess ");
		}
		else
		{ 
			System.out.println(" Wrong guess ");
		}
	}
}


