public abstract class Ticket
{
	private int serialNo;
	private int price;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random() *10000000) + 1;
		this.price = 0;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return "Serial #: " + serialNo + " Price: " + price;
	}
}