import java.util.Scanner;

public class StringChange_Main
{
/** Main method */
	public static void main(String[] args) {
		StringChange  strWord = new StringChange();
		strWord.setS1("cat");
		String result = strWord.backAround(strWord.getS1());
		System.out.println("The backaround changed string is " +result);
	}
}
