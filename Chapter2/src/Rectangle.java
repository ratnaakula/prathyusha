/** 
 * 
 * @author prathyusha
 * Rectangle with area and perimeter calculation
 */

public class Rectangle
{
	private double length;
	private double width;
	
	public double getLength()
	{
	
		return length;
	}
	
	public void setLength(double length)
	{
	
		this.length = length;
	}
	
	public double getWidth()
	{
	
		return width;
	}
	
	public void setWidth(double width)
	{
	
		this.width = width;
	}
	
	
	public double areaOfRectangle(double length,double width) {
		return length * width;
	}
	
	public double perimeterOfRectangle(double length, double width) {
		return (length + width) * 2 ;
	}

}
	

