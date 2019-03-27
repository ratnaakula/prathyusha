
public class Problem1_4
{
	public static void main(String[]args)
	{
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber  = 3;
		int fourthNumber = 4;
		
		System.out.println(" a\ta^2\t a^3   ");	
		System.out.println(firstNumber + "\t"  + (long) Math.pow(firstNumber,2) + "\t" + (long) Math.pow(firstNumber,3));
	    System.out.println( secondNumber +"\t" + (long) Math.pow(secondNumber,2) +"\t" + (long) Math.pow(secondNumber,3));
		System.out.println( thirdNumber +"\t"  + (long) Math.pow(thirdNumber ,2) +"\t" + (long) Math.pow(thirdNumber,3));
		System.out.println( fourthNumber +"\t"  +(long) Math.pow(fourthNumber,2) +"\t" + (long) Math.pow(fourthNumber,3));
	}

}
