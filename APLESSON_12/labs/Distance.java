import static java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	//default constructor
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	//Constructor with params
	public Distance(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
		distance = 0;
	}
	
	//modifier
	public void setxOne(int xO)
	{
		xOne = xO;
	}
	
	public void setyOne(int yO)
	{
		yOne = yO;
	}
	
	public void setxTwo(int xT)
	{
		xTwo = xT;
	}
	
	public void setyTwo(int yT)
	{
		yTwo = yT;
	}
	
	//Accessors
	public double Distance()
	{
		
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	

}