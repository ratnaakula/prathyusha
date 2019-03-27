/**  (Check password) Some websites impose certain rules for passwords. Write a method that checks 
 * whether a string is a valid password. Suppose the password rules are as follows:
 *  ■ A password must have at least eight characters. 
 *  ■ A password consists of only letters and digits. 
 *  ■ A password must contain at least two digits. 
 *  Write a program that prompts the user to enter 
 * a password and displays Valid Password if the rules are followed or Invalid Password otherwise. 
 */
import java.util.Scanner;

public class Exercise6_18 {
	/** Main method */
	public static final int LENGTH_OF_VALID_PASSWORD = 8;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a password
		System.out.print("Enter a password :");
		String password = input.nextLine();
		// Display Valid Password if rules are followed, or Invalid Password otherwise
		if (isValidPassword(password)) {
			System.out.println("Password is valid:" +password);
		}
		else {
				System.out.println("Not a valid password: " +password);
		}
	}

	/** Method isValidPassword tests whether a string is a valid password */
	public static boolean isValidPassword(String password) {
		

		if (password.length() < LENGTH_OF_VALID_PASSWORD) return false;
		
		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);
			
			if (isNumeric(ch))
				numCount++;
			else if (isLetter(ch))
				charCount++;
			else return false;
		}

		return (charCount >= 2 && numCount <= 2);

	}

	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean isNumeric(char ch) {

		return (ch >= '0' && ch <= '9');

	}
}
