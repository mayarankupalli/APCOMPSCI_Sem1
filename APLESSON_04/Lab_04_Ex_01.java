import java.util.Scanner;

public class Lab_04_Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lab_04_Ex_01 form = new Lab_04_Ex_01();
		
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
		
		
		Double subtotal = price1+price2+price3;
		Double tax = .08 * subtotal;
		Double total = tax+subtotal;
		
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
	public void format(String item, double price)
	{
		System.out.printf("\n*%15s.......    %10.2f", item, price);
	}
}