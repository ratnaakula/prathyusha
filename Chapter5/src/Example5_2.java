import java.util.Scanner;
public class Example5_2 {
	public static void main(String[] args) {
		// Generate a random integer between 0-100
		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a number magic number between 0 and 100
		//System.out.println(" Enter a guess of magic number between 0 and 100 :");
		int guess = -1;
		while (guess != number) {
			// Prompt the user to guess the number
			System.out.println(" \n Enter your guess: ");
			guess = input.nextInt();
			if (guess == number)
				System.out.println(" Your guess is correct " + number);
			else if (guess > number)
				System.out.println(" Your guess is too high");
			else
				System.out.println(" Your guess is too low");

		} // End of the loop
	}

}
