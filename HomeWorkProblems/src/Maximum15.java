/** 
 * using maximum_15 class return true if either of them is in the range 10..20 inclusive.
 * @author prathyusha
 *
 */

public class Maximum15
{

	private int a;

	private int b;

	public int getA()
	{

		return a;
	}

	public void setA(int a)
	{

		this.a = a;
	}

	public int getB()
	{

		return b;
	}

	public void setB(int b)
	{

		this.b = b;
	}

	// using max1020 method check either a and b values are in the range
	public boolean max1020(int a, int b)
	{

		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20))
			
			return true;
		else
			return false;

	}
}
