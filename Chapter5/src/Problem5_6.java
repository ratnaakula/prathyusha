import java.util.Scanner;
public class Problem5_6 {
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.609;
		//Display header
		System.out.println("Miles       Kilometers     |    Kilometers        Miles");
		for(int m = 1, k = 20 ; m <= 10 && k <= 65; m++, k +=5) {
			System.out.printf("%-12d %7.3f ", m, (m * KILOMETERS_PER_MILE));
			System.out.print("      |     ");
			System.out.printf("%-9d %13.3f \n", k, (k / KILOMETERS_PER_MILE));
		}
	}

}
