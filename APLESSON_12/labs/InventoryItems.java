public class InventoryItems
{
	private String Manufacturer;
	private String name;
	private String category;
	private int UPC;
	private String price;
	
	public InventoryItems(String Man, String nam)
	{
		Manufacturer = Man;
		name = nam;
		category = "undefined";
		price = "undefined";
		UPC = (int)(Math.random() * 1000000000) + 1;
	}
	
	public InventoryItems(String Man, String nam, String cat, String pri)
	{
		Manufacturer = Man;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 1000000000) + 1;
	}

	
	
	public void setprice(String pri)
	{
		price = pri;
	}	
	public void setcategory(String cat)
	{
		category = cat;
	}
	public String toString()
	{
		return "Inventory Info...\nManufacturer: " + Manufacturer + 
								"\nname: " + name +
								"\ncategory: " + category +
								"\nprice: " + price +
								"\nUPC: " + UPC;
		
	}
}