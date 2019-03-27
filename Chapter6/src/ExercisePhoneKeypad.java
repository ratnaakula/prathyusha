/**  (Phone keypads)The international standard letter/number mapping for telephones is shown 
 * in Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter, 
 * as follows:
 *int getNumber(char uppercaseLetter)
*Write a test program that prompts the user to enter a phone number as a string. 
*The input number may contain letters. The program translates a letter (uppercase or lowercase) to
*a digit and leaves all other characters intact. Here is a sample run of the program:*/
import java.util.Scanner;

public class ExercisePhoneKeypad {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a phone number as a string
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		//Translate a letter to a digit and leaves all other characters untouched
		for(int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
			else
				System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	/** Method getNumber returns a number, given an uppercase letter */
	
	public static int getNumber(char upperCaseLetter) {
		//Return the character's number as in the international standard letter /number
		// for mapping telephones
		if(upperCaseLetter >= 'W')
			return 9;
		else if(upperCaseLetter >= 'T')
			return 8;
		else if(upperCaseLetter >= 'P')
			return 7;
		else if(upperCaseLetter >= 'M')
			return 6;
		else if(upperCaseLetter >= 'J')
			return 5;
		else if(upperCaseLetter >= 'G')
			return 4;
		else if(upperCaseLetter >= 'D')
			return 3;
		else 
			return 2;
	}

}
