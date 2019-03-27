/** 
 * using postnegt class checks the result of those values and returns true 
 * if one of value is either positive or negative
 * @author prathyusha
 *
 */

public class PostNegt
{
		private int a;
		private int b;
		private boolean negative;
		
		public int getA()
		{
		
			return a;
		}
		
		public void setA(int a)
		{
		
			this.a = a;
		}
		
		public int getB()
		{
		
			return b;
		}
		
		public void setB(int b)
		{
		
			this.b = b;
		}
		
		public boolean isNegative()
		{
		
			return negative;
		}
		
		public void setNegative(boolean negative)
		{
		
			this.negative = negative;
		}
		
		// using posneg methods and return true only if both are negative
		// if one is negative or one is positive
		// negative value true
		// !negative value is false
		 public boolean posNeg(int a, int b, boolean negative) {
			 if ( a < 0 && b < 0  && negative) {
				 return true;
			 }
			 else if ((a > 0 && b < 0)|| (a < 0 && b > 0 )) {
				 return true;
			 }
			 return false;
		 }
		
}
