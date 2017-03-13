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
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("distance = " + object.Distance());
		
		object.setxOne(xOne);
		object.setyOne(yOne);
		object.setxTwo(xTwo);
		object.setyTwo(yTwo);
		System.out.println("distance = " + object.Distance());
		
	}
}