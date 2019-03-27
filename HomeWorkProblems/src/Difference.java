/**
 * 
 * @author prathyusha
 * Finding the absolute difference between n and 21
 */

public class Difference
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

	// using diff21 method,find difference
	// return double the absolute difference if n above 21
	public int diff21(int n)
	{

		int difference;
		difference = 21 - n;

		if (n > 21)
		{
			difference = Math.abs(difference) * 2;
		}
		return difference;
	}
}
