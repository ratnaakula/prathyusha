/** (Compute p) You can approximate p by using the following series: 
 * p = 4(1 - 1/3 + 1/5-1/7 + 1/9 -1/11 + ...... + (-1)i+1 /2i - 1)
 * write a  program that displays the p value for i = 10000, 20000, …, and 100000.
 */
import java.util.Scanner;
public class Problem5_25 {
public static void main(String[] args) {
	double pi = 0; 
	for(double i = 1; i <= 100000; i++) {
		pi += Math.pow(-1, i+1 )/ (2 * i - 1);
		if(i == 10000)
		{
			System.out.println("Pi at i = 10000 is "+(4 * pi));
		}
		else if(i == 20000)
		{
			System.out.println("Pi at i = 20000 is " +(4 * pi));
		}
		else if(i == 100000)
		{
			System.out.println("Pi at i = 100000 is " +(4 * pi));
		}
	}
}
}
