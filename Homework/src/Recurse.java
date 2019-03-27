import java.util.*;

public class Recurse
{

	public static void main(String[] args)
	{
		System.out.println(fact(5));
		System.out.println(febbo(8));
	}

	public static int fact(int n)
	{
		if (n <= 1)
		{
			return 1;
		}
		else
			return n * fact(n - 1);
	}

	public static long febbo(long a)
	{
				if (a <= 1)
		{
			return a;
		}
		else
			return febbo(a - 1) + febbo(a - 2);
	}
}
