import java.util.ArrayList;
public class GMC implements Car
{
	private double xco;
	private double yco;
	
	public GMC()
	{
		xco = 0;
		yco = 0;
	}
	
	public GMC(double x, double y)
	{
		xco = x;
		yco = y;
	}
	
	public int getID()
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
		double [] Loc = {xco, yco};
		return Loc;
	}
}