/** 
 * using number class and checks whether the number is within 10 of 100 or 200
 * @author prathyusha
 *
 */

public class Number
{

	private int n;

	
	public int getN()
	{
	
		return n;
	}

	
	public void setN(int n)
	{

		this.n = n;
	}

	// using nearHundred method to find the number is with in range or not
	// suppose if the math.abs(n - 100) or (n - 200) difference should be <= 10
	// than only you will return true
	// 10 - 100 = -90 Math.abs return 90
	public boolean nearHundred(int n)
	{

		int n1 = Math.abs(n - 100);
		int n2 = Math.abs(n - 200);
		System.out.println(n1);
		System.out.println(n2);

		return (n1 <= 10) || (n2 <= 10);
	}

	public boolean calculateSomething(int n)
	{

		if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210))
		{
			return true;
		}
		return false;
	}

}
