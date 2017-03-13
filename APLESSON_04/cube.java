import java.util.Scanner;
public class cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		cube form = new cube();
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
		System.out.printf("The surface area of a cube with " + side + " sides is %5.5f" , sa);
	}
}