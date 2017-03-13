import java.util.Random;
public class APLab_05_Ex_01
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int p = rand.nextInt(6)+1;
		int c = rand.nextInt(6)+1;
		String winner = rollDice(p, c);
		
		System.out.println("you rolled a " + p);
		System.out.println("computer rolled a " + c);
		System.out.println("the winner is " + winner);
		
	}
	public static String rollDice (int p, int c)
	{
		
		if (p>c)
		{
			return "p";
		}
		if (c>p)
		{
			return "c";
		}
		else 
		{
			return "its a tie!";
		}
		
	}
}