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
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format("Subtotal:", subtotal);
		form.format("Tax:", tax);
		form.format("Total:", total);
		System.out.println("\n___________________________________________");
		System.out.println("*        Thank you for your support         *");
		
	}
	public static Double discount (double price1, double price2, double price3, double price4 )
	{
		double total = price1 + price2 + price3 + price4;
		if(total >= 2000)
		{
			total = total - (.15*total);
			discount = 15%;
		}
		if(total <= 2000)
		{
			total = total;
			discount = 0%;
		}
	}
	public void format(String item, double price)
	{
		System.out.printf("\n*%15s.......    %10.2f", item, price);
	}
}