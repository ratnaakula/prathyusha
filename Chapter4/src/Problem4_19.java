import java.util.Scanner;

public class Problem4_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user to enter the first nine digits

		System.out.print("Enter the first nine digits of an ISBN as integer:");
		String isbn = input.nextLine();
		// Extract the digits of isbn
		int d1 = Integer.parseInt(isbn.substring(0, 1));// returns the subString value of (0) and value before (1)
		int d2 = Integer.parseInt(isbn.substring(1, 2));
		int d3 = Integer.parseInt(isbn.substring(2, 3));
		int d4 = Integer.parseInt(isbn.substring(3, 4));
		int d5 = Integer.parseInt(isbn.substring(4, 5));
		int d6 = Integer.parseInt(isbn.substring(5, 6));
		int d7 = Integer.parseInt(isbn.substring(6, 7));
		int d8 = Integer.parseInt(isbn.substring(7, 8));
		int d9 = Integer.parseInt(isbn.substring(8));
		// compute the formula for d10
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		// Display the 10 digit ISBN
		System.out.println(
				" The ISBN-10  number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + (d10 == 10 ? "x" : "1"));
	}
}