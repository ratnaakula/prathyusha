import java.util.Scanner;

public class Lottery
{

	public static void main(String[] args)
	{
		
		int digit1 = 0;
		int digit1Tens = 0;
		int digit1Ones = 0;
		do {
			digit1 = getRandomTwoDigitNumber();
			digit1Tens = getTenNumber(digit1);
			digit1Ones = getOnesNumber(digit1);
			System.out.println(digit1);
		}while(digit1Tens == digit1Ones);
		System.out.print(digit1);

	}

	public static int getRandomTwoDigitNumber()
	{
		int randomNumber = (int) (Math.random() * 100);
		return randomNumber;

	}
	public static int getTenNumber(int randomNumber) {
		int digitTens = randomNumber / 10;
		return digitTens;
		
	}
	
	public static int getOnesNumber(int randomNumber) {
		int digitOnes = randomNumber % 10;
		return digitOnes;
		
	}
}
