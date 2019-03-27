/** 
 * Using sumequals class and  checks the sum of two int numbers is equal
 * returns true if one of their value or their sumvalue is 10
 * @author prathyusha
 *
 */

public class SumEquals

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

	// checks the sum equals to one of value or their sum by makes10 method
	
	public boolean makes10(int a, int b) {
		
		if(a == 10 || b == 10 || a + b == 10) {
			return true;
		}
		return false;
	}
}
		
	
	


