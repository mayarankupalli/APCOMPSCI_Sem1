public class Honda implements Location
{
	private double xco;
	private double yco;
	
	public Honda()
	{
		xco = 0;
		yco = 0;
	}
	
	public Honda(double x, double y)
	{
		xco = x;
		yco = y;
	}
	
	public double getID()
	{
		return (int)((Math.random() * 1000000) + 1);
	}
	
	public void move(double x, double y)
	{
		xco = x;
		yco = y;
	}
	
	public double[] getLoc()
	{
		double [] loc = {xco, yco};
		return loc;
	}
}