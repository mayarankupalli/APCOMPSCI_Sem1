import static java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	//default constructor
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0.0;
	}
	
	//Constructor with params
	public MilesPerHour(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0.0;
	}
	
	//modifier
	public void setdistance(int d)
	{
		distance = d;
	}
	
	public void sethours(int h)
	{
		hours = h;
	}
	
	public void setminutes(int m)
	{
		minutes = m;
	}
	
	//Accessors
	public double MilesPerHour()
	{
		
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	

}