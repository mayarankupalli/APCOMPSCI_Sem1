import java.util.ArrayList;
public class Honda implements Car
{
	double[] loc;
	public Honda()
	{
		loc = new double[2];
	}
	
	public Honda(double[] l)
	{
		loc = l;
	}
	
	public int getID()
	{
		return (int)((Math.random() * 1000000) + 1);
	}
	
	public void move(double x, double y)
	{
		loc[0] = x;
		loc[1] = y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}