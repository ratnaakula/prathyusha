/**
 * 
 * @author prathyusha
 * method example 2 for calling in layers
 */
public class Method_Example2
{
	public static void main(String[] args) {
		int result = function1(10, 5);
	}

	private static int function1(int i, int j)
	{
		int add = add(i, j);
		return add;
	}

	private static int add(int i, int j)
	{
		printiandj(i,j);
		return i+j;
	}
	
	private static void printiandj(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}

}
