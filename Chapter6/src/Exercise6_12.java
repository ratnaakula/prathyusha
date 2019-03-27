/**  (Display characters) Write a method that prints characters using the following header:
public static void printChars(char ch1, char ch2, int numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers per line. 
Write a test program that prints ten characters per line from 1 to Z. Characters are separated by exactly one space. */
import java.util.Scanner;

public class Exercise6_12 {
	/** Main method */
	public static void main(String[] args) {
		//Print ten characters per line from 1 to Z
		final int NUMBER_OF_CHARACTERS_PER_LINE = 10;
		char ch1 = '1'; //Starting character
		char ch2 = 'Z'; // Ending character
		
		System.out.println("Characters per 1 to Z:");
		printCharacters(ch1, ch2, NUMBER_OF_CHARACTERS_PER_LINE);
		System.out.println();
	}
// Method printCharacters: prints characters ch1 and ch2 with number of characters per line 
	public static void printCharacters(char ch1, char ch2, int NUMBER_OF_CHARACTERS_PER_LINE) {
		for(char c = ch1, count = 1; c <= ch2; c++, count ++) {
			if(count % NUMBER_OF_CHARACTERS_PER_LINE == 0)
				System.out.println(c);
			else
				System.out.print(c + " ");
		}
	}

}