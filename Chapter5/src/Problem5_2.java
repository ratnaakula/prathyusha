import java.util.Scanner;

public class Problem5_2 {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10;

		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = "  ";
		Scanner input = new Scanner(System.in);
		while (count < NUMBER_OF_QUESTIONS) {
			// Generate two random single digit numbers
			int number1 = 1 + (int) (Math.random() * 15);
			int number2 = 1 + (int) (Math.random() * 15);
			// Prompt the student to answer what is number1 + number2 ?
			System.out.print("What is" + number1 + "+" + number2 + "?");
			int answer = input.nextInt();
			// Grade the answer and display result
			if (number1 + number2 == answer) {
				System.out.println(" You are correct!");
				correctCount++;

			} else

				System.out.println(
						"Your answer is wrong. \n " + number1 + "+" + number2 + " should be" + (number1 + number2));
			// Increase the question count
			count++;
			output += "\n" + number1 + "+" + number2 + " = " + answer
					+ ((number1 + number2 == answer) ? " correct " : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println(
				"CorrectCount is" + correctCount + "\n testTime is " + testTime / 1000 + " seconds \n " + output);

	}

}

//(Repeat additions) Listing�5.4, SubtractionQuizLoop.java, 
//generates five random subtraction questions. 
//Revise the program to generate ten random addition questions for two integers between 1 and 15.
//Display the correct count and test time. 