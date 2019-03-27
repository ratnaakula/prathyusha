 /**  (Summation) Write a program to compute the following summation.
  *  1 /1 +2 2 + 1 /2 2 + 2 3 + 1 /2 3 +2 4 + ......+ 1/ 2 624 +2 625 
  */
import java.util.Scanner;

public class Problem5_35 {
	public static void main(String[] args) {
		double summation = 0;
		for (double i = 1.0; i <= 624.0; i++) {
			summation += i / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		System.out.println("Summation is " + summation);
	}

}
