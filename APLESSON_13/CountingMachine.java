import java.util.ArrayList;

public class CountingMachine
{
	public static void main(String[]args) 
	{
		Money cash = new Money("penny", 2.54, 00.25);
		ArrayList<Money> inventory = new ArrayList<Money>();
		inventory.add(new Coin("Penny", 2.5, 00.01));
		inventory.add(new Coin("Nickel", 5, 00.05));
		inventory.add(new Coin("Dime", 2.268, 00.10));
		inventory.add(new Coin("Quarter", 5.670, 00.25));
		inventory.add(new Bill("one", "washington", 01.00));
		inventory.add(new Bill("five", "lincoln", 05.00));
		inventory.add(new Bill("ten", "hamilton", 10.00));
		inventory.add(new Bill("twenty", "jackson", 20.00));
		inventory.add(new Bill("hundred", "franklin", 100.00));
		
		for(Money x : inventory)
		{
			System.out.print(x);
		}
	}
	
}