public class StudentAdvance extends Advance
{
	public int getPrice()
	{
		price = price/2;
	}
	
	public String toString()
	{
		return "Serial #: " + serialNo + " Price: " + price + "STUDENT ID REQUIRED: " + studentprice;
	}
}