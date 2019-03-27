/**
(Demonstrate cancellation errors) A cancellation error occurs when you are manipulating 
a very large number with a very small number. The large number may cancel out the smaller number. 
For example, the result of 100000000.0 + 0.000000001 is equal to 100000000.0. To avoid cancellation errors and 
obtain more accurate results, carefully select the order of computation. For example, in computing the following series, 
you will obtain more accurate results by computing from right to left rather than from left to right:
1 + 1/2 + 1/3 + .....+ 1/n **/
import java.util.Scanner;

public class Problem5_23 {
	public static void main(String[] args) {
		double sumRightToLeft = 0.0;
		//where n = 50000
		for (double n = 50000; n >= 1; n--) {
			sumRightToLeft += 1 / n;
		}
		System.out.println("Computing from right to left " + sumRightToLeft);
		double sumLeftToRight = 0.0;
		for (double n = 1; n <= 50000; n++) {
			sumLeftToRight += 1 / n;
		}
		System.out.println("Computing from left to right " + sumLeftToRight);
		double difference = sumRightToLeft - sumLeftToRight;
		System.out.println("Difference is " + difference);
	}

}
