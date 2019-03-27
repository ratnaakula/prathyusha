import java.util.Scanner;
public class Problem5_4 {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609;
		// Display the header for table
		System.out.println("Miles           Kilometers");
		//Display table
		for(int i = 1 ; i<= 10; i++)
			System.out.printf(" %-15d %6.3f \n", i, (i * KILOMETERS_PER_MILE));
	}

}
