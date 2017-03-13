public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\nSTUDENT ID REQUIRED: ";
	}
}