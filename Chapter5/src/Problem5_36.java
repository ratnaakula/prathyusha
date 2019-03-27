/**  (Business application: checking ISBN) Use loops to simplify Programming Exercise 3.9. 
 */
import java.util.Scanner;
public class Problem5_36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter isbn
		System.out.print("Enter the first 9 digits of an ISBN : ");
		String isbn = input.nextLine();
		int d10 = 0 ;
		
		//Extract the digits of the ISBN and compute d10
		for(int i = 0 ; i < 9; i++) {
			d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
			
		}
		d10 %= 11;
		System.out.print("The ISBN-10 number is " );
		for(int i = 0; i < 9; i++) {
		System.out.print(isbn.charAt(i));
	
		}
		if(d10 == 10) 
			System.out.println("x");
		else 
		
			System.out.println(d10);
		

}
}