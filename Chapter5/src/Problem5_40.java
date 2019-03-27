/*  (Simulation: heads or tails) Write a program that simulates flipping a coin one million times and displays 
 * the number of heads and tails.*/
import java.util.Scanner;
public class Problem5_40 {
	public static void main(String[] args) {
		int heads, tails, coin;
		heads = tails = 0;
		//Simulate flipping a coin one million time
		System.out.println("Flipping a coin one million times: ");
		for(int i = 0; i < 1000000 ; i++) {
			//Generate randomly 0 or 1.
			//If 0, increment heads or else increment tails
		 coin =	(int)(Math.random() * 2) == 0 ? heads++ : tails++;
		}
		//Display results
		System.out.println("Heads : " +heads + "\nTails : " +tails);
	}
	

}
