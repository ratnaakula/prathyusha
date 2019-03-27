
import java.util.Scanner;
public class Test4
{
	 private int a;
	 private int b;
	 private int c;
  
			
	public int getA()
	{
	
		return a;
	}

	
	public int getB()
	{
	
		return b;
	}

	
	public int getC()
	{
	
		return c;
	}

	public  Test4(int x, int y , int z){
	   a = x;
	   b = y;
	   c = z;

}
	public int calculation(int a, int b, int c) {
		int r = a * b * c;
		return r;
	}
		
	//}
	public static void main(String[] args) {
		Test4 res = new Test4(10,20,30);
		//System.out.println(res.r);
		
	}
	}

