 /*(Find the largest n such that n3 6 12,000) 
 Use a while loop to find the largest integer n such that n3 is less than 12,000. */
import java.util.Scanner;
public class Problem5_13 {
public static void main(String[] args) {
	int n = 1;
	while((int)Math.pow(n, 3) < 12000) {
		n++;
	}
	
	System.out.println("The largest integer n such that n3 is lessthan 1200 is: "  +n);
}
}












