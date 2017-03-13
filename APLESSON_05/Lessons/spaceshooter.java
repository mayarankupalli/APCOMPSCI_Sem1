import java.util.Scanner;
public class spaceshooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter your target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*100)+1;
		
		if (target == enemyLoc)
			System.out.println("it's a hit");
		else
			System.out.println("keep trying");
	}
}
