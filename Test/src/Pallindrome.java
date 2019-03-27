import java.util.Scanner;
public class Pallindrome {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a string
		System.out.print(" Enter a string:");
		String s = input.nextLine();
		//The index of first character in the string
		int low = 0;
		//The index of last  character in the string
		int high = s.length()-1;
		boolean isPallindrome = true;
		while(low<high) {
			if(s.charAt(low)!= s.charAt(high)) {
				isPallindrome = false;
				break;
			}
			low++;
			high--;
			
			}
		if(isPallindrome)
			System.out.println(s + " is a pallindrome");
		else
			System.out.println(s + " is not  a pallindrome");
		}
	}


