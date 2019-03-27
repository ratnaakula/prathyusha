import java.util.Scanner;

public class Difference_Main
{

	/** Main method */
	public static void main(String[] args)
	{

		Difference absDiff = new Difference();
		absDiff.setN(30);
		int absResult = absDiff.diff21(absDiff.getN());
		System.out.println("The result of the absolute difference is : " + absResult);
	}
}
