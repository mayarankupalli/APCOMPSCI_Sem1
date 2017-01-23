import java.util.Scanner;
public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		InventoryItems item1;
		System.out.println("Please enter the manufacturer: ");
		String Manufacturer = kb.nextLine();
		System.out.println("Please enter the name: ");
		String name = kb.nextLine();
		System.out.println("would you like to add category and price");
		String choice = kb.nextLine();
		if (choice.equals("n"))
		{
			item1 = new InventoryItems (Manufacturer, name);
		}
		else
		{
			System.out.println("Please enter category: ");
			String category = kb.nextLine();
			System.out.println("Please enter price: ");
			String price = kb.nextLine();
			item1 = new InventoryItems (Manufacturer, name, category, price);
		}
		
		System.out.println(item1);
		item1.setprice("10");
		item1.setcategory("food");
		System.out.println("\n" + item1);
		
		
	}
	
	
}