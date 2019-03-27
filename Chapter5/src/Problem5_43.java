import java.util.Scanner;
public class Problem5_43 {
public static void main(String[] args) {
	int count = 0;//Count the number of combinations
	//Display all possible combination for 
	//numbers from 1 to 7
	for(int number1 = 1;  number1 <= 7; number1 ++) {
		for(int number2 = number1 + 1; number2 <= 7; number2 ++) {
			System.out.println(number1 + "  " + number2);
			count++;
		}
	}
	//Display output
	System.out.println("The total number of all combinations is " +count);
	
}
}
