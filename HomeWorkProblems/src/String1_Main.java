import java.util.Scanner;

public class String1_Main
{

	/** Main method */
	public static void main(String[] args)
	{

		String1 str = new String1();
		str.setS1("nothing");
		str.setS2("there");
		String result = str.notString(str.getS1());
		System.out.println("The resultof string " + str.getS1() + " is " + result);
		System.out.println(str.startingStr(str.getS1()));

	}
}
