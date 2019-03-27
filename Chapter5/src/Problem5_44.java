/**  (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 *  Write a program that prompts the user to enter a short integer and displays the 16 bits
 *   for the integer. Here are sample runs:
 */
 
import java.util.Scanner;
public class Problem5_44 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//Prompt the user to enter a short integer
	System.out.print("Enter an integer: ");
	/* short num = input.nextShort();
	 String bits = "";
	 for(int i=0; i < 16; i++) {
		
		 bits = (num & 1)+ bits;
		 num >>= 1;
	 }
	 //convert short integer to bytes*/
	 int num = input.nextInt();
	 input.close();
	 //Display message
	 System.out.print("The bits are ");
	 //let x = 1;
	 int x = 1;
	 for(int i = 15; i >= 0; i--) {
		 //Calculate temp and bit
		 int temp = num >> i;
		 int bits = temp & x;
	 System.out.print(bits);
	 }
}
}
