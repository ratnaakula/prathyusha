import java.util.Scanner;

public class Problem3_10 // Addition quiz
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Generate two integers less than 100
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		System.out.print("what is " + number1 + " + " + number2 + "?");
		int answer = input.nextInt();
		if (number1 + number2 == answer)
			System.out.println(" your answer is correct");
		else {
			System.out.println("Your answer is wrong.");

			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
	}
}
