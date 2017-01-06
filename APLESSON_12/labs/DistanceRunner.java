import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter xOne");
		int xOne = kb.nextInt();
		System.out.println("enter yOne");
		int yOne = kb.nextInt();
		System.out.println("enter xTwo");
		int xTwo = kb.nextInt();
		System.out.println("enter yTwo");
		int yTwo = kb.nextInt();
		
		distance object = new distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println(distance + " miles in " + hours + " hours = " + object.MilesPerHour());
		
		object.setdistance(distance);
		object.sethours(hours);
		object.setminutes(minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + object.MilesPerHour());
		
	}
}