/** 
 * using String class check the string
 *  return true if the string starts with "hi" and false otherwise.
 * @author prathyusha
 *
 */

public class StringStr
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
	// using startHi method find the condition is true or not
	public boolean startHi(String s1) {
		
		if (s1.startsWith("Hi")) {
			return true;
		}
				return false;
		}
	}

