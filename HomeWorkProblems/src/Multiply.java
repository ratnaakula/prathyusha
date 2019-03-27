/**
 * using multiply class  
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
 * @author prathyusha
 *
 */

public class Multiply
{

	 private int n ;

	
	public int getN()
	{
	
		return n;
	}

	
	public void setN(int n)
	{
	
		this.n = n;
	}
	
	public boolean or35(int n1) {
		
		if (n % 3 == 0 || n % 5 == 0) {
			
			return true;
		}
		return false;
	}
}
