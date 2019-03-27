/**(Compute e) You can approximate e using the following series:
e = 1 +1/1! +1/2! +1/3! +1/4! + ..... +1/i!
  Write a program that displays the e value for i = 10000, 20000, …, and 100000. (Hint: Because i! = i * (i - 1) * c * 2 * 1, then
1/i!is 1 i(i - 1)!
  Initialize e and item to be 1 and keep adding a new item to e. The new item is the previous item divided by i for i = 2, 3, 4, ....) **/
import java.util.Scanner;
public class Problem5_26 {
	//Main method
	public static void main(String[] args) {
		//Define variables
		double e = 1;
		double num = 1;
		//loop repeats from 1 to 100000
		for(double i = 1; i <= 100000; i++) {
			num = num / i;
			e += num;
			//Checks for i = 10000 or i = 20000 .........100000
			if(i == 10000 || i == 20000 || i == 30000 || i == 40000 || i == 50000 
					|| i == 60000 || i == 70000 || i == 80000 || i == 90000 || i == 100000)
			//Display output
				System.out.println("The e value is " +e + " for i " + i);
				
			}
		}
	}


