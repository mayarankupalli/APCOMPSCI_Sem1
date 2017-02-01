public class Bill extends Money
{
	
	private String face;
	
	
	public Bill()
	{
		super();
		this.face = "";
		
	}
	
	public Bill(String n, String f, double v)
	{
		super(n, v);
		this.face = f;
		
	}
	
	public String toString()
	{
		return "face: " + face + "\n" +
			   super.toString();
	}
}