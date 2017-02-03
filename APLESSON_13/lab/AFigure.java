public class AFigure extends Toy
{
	
	private String AFigure;
	
	
	public AFigure()
	{
		super();
		this.AFigure = "";
		
	}
	
	public AFigure(String n, String a, int c)
	{
		super(n, c);
		this.AFigure = a;
		
	}
	
	public String getType()
	{
		return "Action Figure";
	}
	
	public String toString()
	{
		return "AFigure: " + AFigure + "\n" +
			   super.toString();
	}
}