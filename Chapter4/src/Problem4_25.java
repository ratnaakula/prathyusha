import java.util.Scanner;
public class Problem4_25 {
public static void main(String[] args)
{
	//Assume a vehicle plate consists of three uppercase letters
	//Generate three random uppercase letters
	int letter1 = 65 + (int)(Math.random() * (90-65));
	int letter2 = 65 + (int)(Math.random() * (90-65));
	int letter3 = 65 + (int)(Math.random() * (90-65));
	// Generate four random digits
	int digit1 = (int)(Math.random() * 10);
	int digit2 = (int)(Math.random() * 10);
	int digit3 = (int)(Math.random() * 10);
	int digit4 = (int)(Math.random() * 10);
	System.out.println(" The vehicle plate number is " +(char)letter1 + (char)letter2 + (char)letter3 + digit1 + digit2 + digit3 +digit4);
	
}
}
