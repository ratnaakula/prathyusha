/** 
 * Using string class return a string if it starts with "not" as unchanged
 * @author prathyusha
 *
 */

public class String1
{

	private String s1;

	private String s2;

	public String getS1()
	{

		return s1;
	}

	public void setS1(String s1)
	{

		this.s1 = s1;
	}

	public String getS2()
	{

		return s2;
	}

	public void setS2(String s2)
	{

		this.s2 = s2;
	}

	// using notString method return true if string starts with not
	public String notString(String s1)
	{

		if (s1.equals("not"))
		{
			return s1;
		}
		else
		{
			return s2;
		}
	}

	public String startingStr(String s1)
	{

		if (s1.startsWith("not"))
		{
			return s1;
		}
		else
		{
			return s2;
		}
	}
}
