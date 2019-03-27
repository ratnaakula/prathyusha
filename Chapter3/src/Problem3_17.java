import java.util.Scanner;
public class Problem3_17 //
{
public static void main(String[] args)
{
	int computer = (int)(Math.random() * 3);
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a guess
		System.out.print("Enter a user guess : scissor (0) , rock(1), paper(2) :");
		int user = input.nextInt();
		System.out.print("The computer is ");
		switch (computer)

		{
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}
		System.out.print("You are ");
		switch (user) {
		case 0:
			System.out.print("scissor.");
			break;
		case 1:
			System.out.print("rock.");
			break;
		case 2:
			System.out.print("paper.");
			break;
		}
		// Display result
		if (computer == user) {
			System.out.print(" too . It is a draw ");
		} else
			System.out.print((user == 0 && computer == 1) || (user == 1 && computer == 2)
					|| (user == 2 && computer == 0) ? " you loose" : " you win");
	}
}
