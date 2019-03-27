import java.util.Scanner;

public class Problem5_50 {
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a String:");
		String str = input.nextLine();
		// Count the number of uppercase letters
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))

				count++;

		}
		System.out.println("The number of uppercase letters is " + count);
	}

}
