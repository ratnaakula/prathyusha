/** 
 * using temperature class checks the temp and  return true if one is less than 0 and the other is greater than 100.
 * @author prathyusha
 *
 */

public class Temperature14
{

	private int temp1;
	private int temp2;
	
	public int getTemp1()
	{
	
		return temp1;
	}
	
	public void setTemp1(int temp1)
	{
	
		this.temp1 = temp1;
	}
	
	public int getTemp2()
	{
	
		return temp2;
	}
	
	public void setTemp2(int temp2)
	{
	
		this.temp2 = temp2;
	}
	
	// using icyHot method, return true if condition matched 
	public boolean icyHot(int tem1, int tem2) {
		
		if((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		}
		return false;
	}
	
}
