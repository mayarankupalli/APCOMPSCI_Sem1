import java.util.ArrayList;
public class Toyota implements Car
{
	double[] loc;
	
	public Toyota()
	{
		loc = new double[2];
	}
	
	public Toyota(String l)
	{
		loc = new double[2];
		//set l as an array of String using split()
		String[] locs = l.split(", ");
		//add values from String array to loc as doubles using Double.parseDouble()
		loc[0] = Double.parseDouble(locs[0]);
		loc[1] = Double.parseDouble(locs[1]);
		
	}
	
	public int getID()
	{
		return (int)((Math.random() * 1000000) + 1);
	}
	
	public void move(double x, double y)
	{
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}