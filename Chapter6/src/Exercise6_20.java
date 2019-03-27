/** (Count the letters in a string) Write a method that counts the number of letters in a
 *  string using the following header:
public static int countLetters(String s)*/

import java.util.Scanner;

public class Exercise6_20 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a String: ");
		String s = input.nextLine();

		// Display the number of letters in the string
		System.out.println("The number of letters in the string " + s + " : " + countLetters(s));

	}

	/** Method countLetters counts the number of letters in a String */
	public static int countLetters(String s) {
		int numberOfLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			// Test if the character is a letter
			if (Character.isLetter(s.charAt(i)))
				numberOfLetters++;

		}
		return numberOfLetters;
	}
}
