import java.util.Scanner;

public class Problem4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter a character
		System.out.print(" Enter a character : ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println(" The unicode for the character " + s + " is " + (int) ch);
	}
}
