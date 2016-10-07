import java.util.Scanner;
public class APLab_05_Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		APLab_05_Ex_02 form = new APLab_05_Ex_02();
		
		System.out.println("Please enter item 1");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price");
		Double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price");
		Double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price");
		Double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 4");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price");
		Double price4 = kb.nextDouble();
		kb.nextLine();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = discnt(subtotal);
		double tax = .10*subtotal; 
		double total = subtotal - discount + tax;
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format("Subtotal:", subtotal);
		form.format("Discount:", discount);
		form.format("Total:", total);
		
		System.out.println("\n___________________________________________");
		System.out.println("*        Thank you for your support         *");
		
	}
	public static double discnt (double subtotal)
	{
		double discount = 0;
		if(subtotal >= 2000)
		{
			discount = 0.15 * subtotal;
		}
		if(subtotal <= 2000)
		{
			discount = 0 * subtotal;
		}
		return discount;
	}
	public void format(String item, double price)
	{
		System.out.printf("\n*%15s.......    %10.2f", item, price);
	}
}