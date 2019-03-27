/** (Sum series) Write a method to compute the following series:
m(i) =
1 2 +
2 3 + c +
i i + 1 Write a test program that displays the following table:*/

import java.util.Scanner;

public class SumSeries {
	/** Main method */
	public static void main(String[] args) {
		//Display header
		System.out.println("i         m(i)      ");
		System.out.println("---------------------");
		//Display data
		for (int i = 1; i <= 20; i++){
			System.out.printf("%-10d", i);
			System.out.printf("%-7.4f\n", sumSeries(i));
			
		}
	}
public static double sumSeries(double n) {
	double sum = 0;//Sum of the series
	for(double i = 1; i <= n; i++) {
		sum += i/ (i+1);
	}
	return sum;
}
}
