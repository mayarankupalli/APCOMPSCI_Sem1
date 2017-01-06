import java.util.Scanner;
public class MPHRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter distance");
		int distance = kb.nextInt();
		System.out.println("enter hours");
		int hours = kb.nextInt();
		System.out.println("enter minutes");
		int minutes = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours = " + object.MilesPerHour());
		
		object.setdistance(distance);
		object.sethours(hours);
		object.setminutes(minutes);
		System.out.println(distance + " miles in " + hours + " hours = " + object.MilesPerHour());
		
	}
}