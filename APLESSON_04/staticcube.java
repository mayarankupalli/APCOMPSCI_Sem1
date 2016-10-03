import java.util.Scanner;
public class staticcube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		staticcube form = new staticcube();
		System.out.println("enter the side length");
		double side = kb.nextDouble();
		
		
		print(side, calcSurf(side));
		
	}
	public static double calcSurf(double side)
	{
		return 6.0*(side*side);
	}
	public static void print(double side, double Surf)
	{
		System.out.printf("The surface area of a cube with " + side + " sides is %5.5f" , Surf);
	}
}