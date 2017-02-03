public class Car extends Toy
{
	
	private String Car;
	
	
	public Car()
	{
		super();
		this.Car = "";
		
	}
	
	public Car(String n, String ca, int c)
	{
		super(n, c);
		this.Car = ca;
		
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return "Car: " + Car + "\n" +
			   super.toString();
	}
}