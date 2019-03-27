/** 
 *  Using parrot class and find whether it is talking or not
 * @author prathyusha
 *
 */

public class Parrot
{
	private boolean talking;
	private int hour;
	
	public boolean isTalking()
	{
	
		return talking;
	}
	
	public void setTalking(boolean talking)
	{
	
		this.talking = talking;
	}
	
	public int getHour()
	{
	
		return hour;
	}
	
	public void setHour(int hour)
	{
	
		this.hour = hour;
	}
	
	// Compute parrotTrouble method to return true if in trouble
	public boolean parrotTrouble(boolean talking, int hour) {
		if((talking == true )&& (hour > 7 || hour < 20)){
			return true;
			
		}
		return false;
	}

}
