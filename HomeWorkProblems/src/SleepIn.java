/**
 * 
 * @author prathyusha
 * sleep in if is not a weekday or are on vacation
 * return true if we sleep in
 */

public class SleepIn
{
	
	private boolean weekday;
	private boolean vacation;
	 
	public boolean isWeekday()
	{
	
		return weekday;
	}

	
	public void setWeekday(boolean weekday)
	{
	
		this.weekday = weekday;
	}

	
	public boolean isVacation()
	{
	
		return vacation;
	}

	
	public void setVacation(boolean vacation)
	{
	
		this.vacation = vacation;
	}

	// making sure sleep or not based on weekday and vacation
	public boolean sleepIn(boolean weekday, boolean vacation){
		if(!weekday || vacation) {
			return true;
		}
		return false;
	}
}

