import java.util.*;

/**
 * 
 * @author prathyusha
 *
 */
public class TV
{
	private int width;
	private int length;
	private String color;
	private int channel;
	
	public TV(int widthvalue, int lengthvalue, String colorvalue, int channelvalue) {
		this.width = widthvalue;
		this.length = lengthvalue;
		this.color = colorvalue;
		this.channel = channelvalue;
	}
	
	
	public int getWidth()
	{
	
		return width;
	}
	
	public void setWidth(int width)
	{
	
		this.width = width;
	}
	
	public int getLength()
	{
	
		return length;
	}
	
	public void setLength(int length)
	{
	
		this.length = length;
	}
	
	public String getColor()
	{
	
		return color;
	}
	
	public void setColor(String color)
	{
	
		this.color = color;
	}
	
	public int getChannel()
	{
	
		return channel;
	}
	
	public void setChannel(int channel)
	{
	
		this.channel = channel;
	}
	
	

}
