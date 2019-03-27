

public class Monkey
{
	private boolean aSmile;
	private boolean bSmile;
	
	public boolean isaSmile()
	{
	
		return aSmile;
	}
	
	public void setaSmile(boolean aSmile)
	{
	
		this.aSmile = aSmile;
	}
	
	public boolean isbSmile()
	{
	
		return bSmile;
	}
	
	public void setbSmile(boolean bSmile)
	{
	
		this.bSmile = bSmile;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if((aSmile && bSmile)||(!aSmile && !bSmile)) { 
			return true;
		}
		return false;
	}
}