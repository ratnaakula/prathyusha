/** (Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds 
 * to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns a 
string 0:0:5, convertMillis(100000) returns a string 0:1:40, and convertMillis(555550000)
 returns a string 154:19:10. **/
import java.util.Scanner;

 class Example6_25 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter milliseconds
		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();
		
		//Display milliseconds to hours, minutes, seconds
		System.out.println("hours:minutes:seconds: " +convertMillis(millis));
	}
/* Method convertMillis converts milliseconds to hours, minutes and seconds */
	public static String convertMillis(long millis) {
		//Obtain total seconds
		millis /= 1000;
		
		//Obtain current minute and second
		String currentMinuteAndSecond = "";
		for(int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" +millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		return millis + currentMinuteAndSecond;
	}
}
