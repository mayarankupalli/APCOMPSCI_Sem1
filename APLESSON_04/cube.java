import java.util.Scanner;
public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		average form = new average();
		System.out.println("enter the side length");
		side = kb.nextDouble();
		
		
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = 6*(side*side);
	}
	public static void print()
	{
		System.out.printf("the surface area of a cube with " + side + "sides is" + sa);
	}
}