import java.util.ArrayList;
public class Car implements Location
{
	double[] loc;
	public final int ID;
	
	public Car()
	{
		loc = new double[2];
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xco = x;
		yco = y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
} 