/** 
 * using stringchange class take the last char and return a new string with the last char added at the front and back
 *  so "cat" yields "tcatt". 
 *  @author prathyusha
 */

public class StringChange
{

	private String s1;
	 
	public String getS1()
	{
	
		return s1;
	}

	
	public void setS1(String s1)
	{
	
		this.s1 = s1;
	}

	public String backAround(String s1) {
		 
		String str = s1.charAt(s1.length()- 1) + s1 + s1.charAt(s1.length()-1);
		return str;
	}
}
