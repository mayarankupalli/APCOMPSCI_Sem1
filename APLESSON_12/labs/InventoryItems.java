public class InventoryItems
{
	private String Manufacturer;
	private String name;
	private String category;
	private int UPC;
	private int price;
	
	public InventoryItems(String Man, String nam)
	{
		Manufacturer = Man;
		name = nam;
		category = "undefined";
		price = "undefined";
		UPC = (int)(Math.random() * 1000000) + 1;
	}
	
	public InventoryItems(String Man, String nam, String cat, int pri)
	{
		Manufacturer = Man;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 1000000) + 1;
	}

	
	
	public void setavatar(String a)
	{
		avatar = a;
	}	
	
	public String toString()
	{
		return "Customer Info...\nFirstName: " + firstName + 
								"\nLastName: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
		
	}
}