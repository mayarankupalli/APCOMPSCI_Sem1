public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(int d)
	{
		daysLeft = d;
	}
	
	public int getPrice()
	{
		if(daysLeft > 10)
		{
			price = 30.00;
		}
		else
		{
			price = 40;
		}
	}
}