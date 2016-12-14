import java.util.Scanner;
public class gameHealth
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthcount;
	
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		int healthCount = 6;
		health = new String[HEALTHLOAD]; 
		
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("your turn! hit enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random() * 2) + 1;
			amount = (int)(Math.random() * 6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("you died");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthcount -= amt;
			return "Taking " + amt + " damage!";
		}
		else
		{
			if(healthcount + amt < HEALTHLOAD)
			{
				healthcount += amt;
			}
			else
			{
				healthcount = HEALTHLOAD;
			}
			return "power up " + amt + "!";
		}
	}
	
	public static void printClip()
	{
		String output = "Health:" + "\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthcount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}