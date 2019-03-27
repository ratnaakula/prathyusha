import java.util.Scanner;

public class Multiply_Main
{

	public static void main(String[] args) {
		Multiply nonNum = new Multiply();
		nonNum.setN(6);
		boolean result = nonNum.or35(nonNum.getN());
		System.out.println("The given non negative number is a multiple of 3 or 5 is " +result);
	}
}
