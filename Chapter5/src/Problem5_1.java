import java.util.Scanner;
public class Problem5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int positives = 0;
		int negatives = 0 ;
		int count = 0;
		double total = 0;
		//Prompt the user to enter a integer, the input ends if it is 0
				System.out.print("Enter an integer, the input ends if it is 0 :");
				int number = input.nextInt();
		if(number == 0) { // Test for sentinel value
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		}
		while(number != 0 ) { // Test for sentinel value
			if (number> 0) 
			positives ++;//Increase positives
			else 
				negatives ++; //Increase negatives
			total += number;//accumulate total
			count ++;           // Increase the count
			number = input.nextInt();
			
		}
		//Calculate average
		double avg = total / count;
		//Display results
		System.out.println("The number of positives is " + positives +
				"\n The number of negatives is " +negatives +
				"\n The total is " +total+
				"\n The average is " +avg );
	}

}
