/*  (Format an integer) Write a method with the following header to format the integer with the 
 * specified width. public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size of the string is the
 width. For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. 
If the number is longer than the width, the method */
import java.util.Scanner;

 class Exercise6_37 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number and its width
		System.out.print("Enter a number and its width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		
		//Display a string of formatted number
		System.out.println(
				number + " formatted to width " + width + " : " + format(number, width));
		
	}
	
	/* method format returns a string  for the number with one or more prefix 0s */
	public static String format(int number, int width) {
		String num =number + ""; //String representation for the number
		
		//If the number is shorter than the width format
		//Else return the string reperesentation for the number
		if(num.length() < width) {
			for(int i = width - num.length(); i > 0 ; i--) {
				num = 0 + num;
			}
			}
			return num;
		}
	}

 
